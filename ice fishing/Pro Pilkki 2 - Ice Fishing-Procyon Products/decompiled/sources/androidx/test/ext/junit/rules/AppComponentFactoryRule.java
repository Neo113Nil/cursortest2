package androidx.test.ext.junit.rules;

import android.app.AppComponentFactory;
import android.os.Build;
import androidx.test.platform.app.AppComponentFactoryRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.junit.rules.ExternalResource;

/* JADX INFO: compiled from: AppComponentFactoryRule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/test/ext/junit/rules/AppComponentFactoryRule;", "Lorg/junit/rules/ExternalResource;", "factory", "Landroid/app/AppComponentFactory;", "(Landroid/app/AppComponentFactory;)V", "after", "", "before", "ext_junit_java_androidx_test_ext_junit-junit_kt"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppComponentFactoryRule extends ExternalResource {
    private final AppComponentFactory factory;

    public AppComponentFactoryRule(AppComponentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
    }

    @Override // org.junit.rules.ExternalResource
    protected void before() {
        if (Build.VERSION.SDK_INT < 28) {
            throw new IllegalStateException("AppComponentFactoryRule is not supported on 'VERSION.SDK_INT < VERSION_CODES.P'".toString());
        }
        AppComponentFactoryRegistry.setAppComponentFactory(this.factory);
    }

    @Override // org.junit.rules.ExternalResource
    protected void after() {
        AppComponentFactoryRegistry.setAppComponentFactory(null);
    }
}
