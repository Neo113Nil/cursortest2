package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AppComponentFactory extends android.app.AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't call constructor", e);
            return null;
        }
    }
}
