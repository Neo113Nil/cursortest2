package com.google.android.gms.internal.mlkit_vision_common;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import com.datadog.android.rum.internal.domain.scope.RumScopeKey;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public abstract class zzia {
    public static RumScopeKey from(Object obj, String str) {
        Intent intent;
        String m;
        String obj2;
        String className;
        int i;
        String canonicalName;
        obj.getClass();
        ComponentName componentName = obj instanceof Activity ? ((Activity) obj).getComponentName() : (!(obj instanceof ActivityNavigator.Destination) || (intent = ((ActivityNavigator.Destination) obj).intent) == null) ? null : intent.getComponent();
        if (componentName != null) {
            String m2 = Boxes$$ExternalSyntheticOutline1.m(System.identityHashCode(obj), componentName.getClassName(), "@");
            String packageName = componentName.getPackageName();
            packageName.getClass();
            if (packageName.length() == 0) {
                m = componentName.getClassName();
                m.getClass();
            } else {
                String className2 = componentName.getClassName();
                className2.getClass();
                if (StringsKt__StringsJVMKt.startsWith(className2, componentName.getPackageName() + ".", false)) {
                    m = componentName.getClassName();
                    m.getClass();
                } else {
                    String className3 = componentName.getClassName();
                    className3.getClass();
                    if (StringsKt.contains((CharSequence) className3, '.', false)) {
                        m = componentName.getClassName();
                        m.getClass();
                    } else {
                        m = Recorder$$ExternalSyntheticOutline2.m(componentName.getPackageName(), ".", componentName.getClassName());
                    }
                }
            }
            if (str == null) {
                str = componentName.getClassName();
                str.getClass();
            }
            return new RumScopeKey(m2, m, str);
        }
        boolean z = obj instanceof String;
        if (z) {
            obj2 = (String) obj;
        } else if (obj instanceof Number) {
            obj2 = obj.toString();
        } else if (obj instanceof Enum) {
            obj2 = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", ((Enum) obj).name());
        } else {
            if (obj instanceof DialogFragmentNavigator.Destination) {
                DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) obj;
                className = destination.getClassName();
                i = destination.impl.id;
            } else if (obj instanceof FragmentNavigator.Destination) {
                FragmentNavigator.Destination destination2 = (FragmentNavigator.Destination) obj;
                className = destination2.getClassName();
                i = destination2.impl.id;
            } else {
                obj2 = obj.toString();
            }
            obj2 = Boxes$$ExternalSyntheticOutline1.m(i, className, "#");
        }
        if (z) {
            canonicalName = (String) obj;
        } else if (obj instanceof Number) {
            canonicalName = obj.toString();
        } else if (obj instanceof Enum) {
            canonicalName = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), ".", ((Enum) obj).name());
        } else if (obj instanceof DialogFragmentNavigator.Destination) {
            canonicalName = ((DialogFragmentNavigator.Destination) obj).getClassName();
        } else if (obj instanceof FragmentNavigator.Destination) {
            canonicalName = ((FragmentNavigator.Destination) obj).getClassName();
        } else {
            canonicalName = obj.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = obj.getClass().getSimpleName();
            }
        }
        if (str == null) {
            str = z ? (String) obj : obj instanceof Number ? obj.toString() : obj instanceof Enum ? ((Enum) obj).name() : obj instanceof DialogFragmentNavigator.Destination ? ((DialogFragmentNavigator.Destination) obj).getClassName() : obj instanceof FragmentNavigator.Destination ? ((FragmentNavigator.Destination) obj).getClassName() : obj.getClass().getName();
        }
        return new RumScopeKey(obj2, canonicalName, str);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewMoneyBooklet.deepLinkSpecs;
    }
}
