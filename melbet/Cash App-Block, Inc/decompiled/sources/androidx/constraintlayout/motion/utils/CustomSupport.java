package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import app.cash.local.viewmodels.LocalTextsKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.google.android.gms.internal.mlkit_genai_prompt.zzalf;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.profile.viewmodels.GenericProfileElementType;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$AchievementsWidgetElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$ActivityElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$ActivityStatsElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$ButtonElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$IconTextElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$TextElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$TrustElements;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class CustomSupport {
    public static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewCashAppPayOfferInAppBrowserV2.deepLinkSpecs;
    }

    public static final GenericProfileElementType getType(GenericProfileElement genericProfileElement) {
        genericProfileElement.getClass();
        LocalTextsKt localTextsKt = genericProfileElement.element;
        if (localTextsKt instanceof GenericProfileElement$Element$ActivityElement) {
            return GenericProfileElementType.ACTIVITY;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$ButtonElement) {
            return GenericProfileElementType.BUTTON;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$IconTextElement) {
            return GenericProfileElementType.ICON_TEXT;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$TrustElements) {
            return GenericProfileElementType.TRUST_INDICATOR;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$TextElement) {
            return GenericProfileElementType.TEXT;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$AchievementsWidgetElement) {
            return GenericProfileElementType.ACHIEVEMENTS;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$ActivityStatsElement) {
            return GenericProfileElementType.ACTIVITY_STATS_ELEMENT;
        }
        return null;
    }

    public static void setInterpolatedValue(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.mName;
        try {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(constraintAttribute.mType);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (ordinal) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int clamp = (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(clamp);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.mName);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot access method ", str, " on View \"");
            m3m.append(Debug.getName(view));
            m3m.append("\"");
            Log.e("CustomSupport", m3m.toString(), e);
        } catch (NoSuchMethodException e2) {
            StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("No method ", str, " on View \"");
            m3m2.append(Debug.getName(view));
            m3m2.append("\"");
            Log.e("CustomSupport", m3m2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder m3m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot invoke method ", str, " on View \"");
            m3m3.append(Debug.getName(view));
            m3m3.append("\"");
            Log.e("CustomSupport", m3m3.toString(), e3);
        }
    }

    public static zzalf zzb() {
        ClassLoader classLoader = CustomSupport.class.getClassLoader();
        if (zzalf.class.equals(zzalf.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new CustomSupport[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(zzaky.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzalf"), (Throwable) e2);
                }
            }
            if (arrayList.size() == 1) {
                return (zzalf) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzalf) zzalf.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                OptionalProvider$$ExternalSyntheticLambda0.m(e3);
                return null;
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
