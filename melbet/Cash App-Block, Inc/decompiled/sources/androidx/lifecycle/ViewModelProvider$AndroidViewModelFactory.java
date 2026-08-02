package androidx.lifecycle;

import android.app.Application;
import androidx.core.os.BundleKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ViewModelProvider$AndroidViewModelFactory extends ViewModelProvider$NewInstanceFactory {
    public static final Trifle APPLICATION_KEY = new Trifle(6);
    public static ViewModelProvider$AndroidViewModelFactory _instance;
    public final Application application;

    public ViewModelProvider$AndroidViewModelFactory(Application application) {
        this.application = application;
    }

    public final ViewModel create(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
            viewModel.getClass();
            return viewModel;
        } catch (IllegalAccessException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "), (Throwable) e);
            return null;
        } catch (InstantiationException e2) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "), (Throwable) e2);
            return null;
        } catch (NoSuchMethodException e3) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "), (Throwable) e3);
            return null;
        } catch (InvocationTargetException e4) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "), (Throwable) e4);
            return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider$NewInstanceFactory, androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class cls) {
        cls.getClass();
        Application application = this.application;
        if (application != null) {
            return create(cls, application);
        }
        a$$ExternalSyntheticBUOutline0.m("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider$NewInstanceFactory, androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        creationExtras.getClass();
        if (this.application != null) {
            return create(cls);
        }
        Application application = (Application) creationExtras.get(APPLICATION_KEY);
        if (application != null) {
            return create(cls, application);
        }
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return BundleKt.createViewModel(cls);
        }
        a$$ExternalSyntheticBUOutline0.m$3("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
