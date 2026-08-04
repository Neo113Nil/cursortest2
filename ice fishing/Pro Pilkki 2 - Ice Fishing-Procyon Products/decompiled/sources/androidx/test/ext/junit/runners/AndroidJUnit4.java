package androidx.test.ext.junit.runners;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidJUnit4 extends Runner implements Filterable, Sortable {
    private static final String TAG = "AndroidJUnit4";
    private final Runner delegate;

    public AndroidJUnit4(Class<?> klass) throws InitializationError {
        this.delegate = loadRunner(klass);
    }

    private static String getRunnerClassName() {
        String property = System.getProperty("android.junit.runner", null);
        if (property != null) {
            return property;
        }
        if (!System.getProperty("java.runtime.name").toLowerCase().contains("android") && hasClass("org.robolectric.RobolectricTestRunner")) {
            return "org.robolectric.RobolectricTestRunner";
        }
        return "androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner";
    }

    private static boolean hasClass(String className) {
        try {
            return Class.forName(className) != null;
        } catch (ClassNotFoundException unused) {
        }
    }

    private static Runner loadRunner(Class<?> testClass) throws InitializationError {
        return loadRunner(testClass, getRunnerClassName());
    }

    private static Runner loadRunner(Class<?> testClass, String runnerClassName) throws InitializationError {
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(runnerClassName);
        } catch (ClassNotFoundException e) {
            throwInitializationError(String.format("Delegate runner %s for AndroidJUnit4 could not be found.\n", runnerClassName), e);
            cls = null;
        }
        try {
            constructor = cls.getConstructor(Class.class);
        } catch (NoSuchMethodException e2) {
            throwInitializationError(String.format("Delegate runner %s for AndroidJUnit4 requires a public constructor that takes a Class<?>.\n", runnerClassName), e2);
        }
        try {
            return (Runner) constructor.newInstance(testClass);
        } catch (IllegalAccessException e3) {
            throwInitializationError(String.format("Illegal constructor access for test runner %s\n", runnerClassName), e3);
            throw new IllegalStateException("Should never reach here");
        } catch (InstantiationException e4) {
            throwInitializationError(String.format("Failed to instantiate test runner %s\n", runnerClassName), e4);
            throw new IllegalStateException("Should never reach here");
        } catch (InvocationTargetException e5) {
            throwInitializationError(String.format("Failed to instantiate test runner %s\n%s\n", cls, getInitializationErrorDetails(e5, testClass)), e5);
            throw new IllegalStateException("Should never reach here");
        }
    }

    private static void throwInitializationError(String details, Throwable cause) throws InitializationError {
        throw new InitializationError(new RuntimeException(details, cause));
    }

    private static String getInitializationErrorDetails(Throwable throwable, Class<?> testClass) {
        StringBuilder sb = new StringBuilder();
        Throwable cause = throwable.getCause();
        if (cause == null) {
            return "";
        }
        if (cause.getClass() == InitializationError.class) {
            List<Throwable> causes = ((InitializationError) cause).getCauses();
            sb.append(String.format("Test class %s is malformed. (%s problems):\n", testClass, Integer.valueOf(causes.size())));
            Iterator<Throwable> it = causes.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return this.delegate.getDescription();
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        this.delegate.run(runNotifier);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        ((Filterable) this.delegate).filter(filter);
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        ((Sortable) this.delegate).sort(sorter);
    }
}
