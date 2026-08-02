package com.google.android.play.core.splitinstall.internal;

import android.view.View;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.room.Room;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ViewUtils;
import com.squareup.cash.R;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.shared.ui.BottomSheetUtilsKt$setup$1;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class zzbk {
    public static final void setup(BottomSheetBehavior bottomSheetBehavior, Function0 function0, View view, View view2, View view3) {
        bottomSheetBehavior.getClass();
        view.getClass();
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetUtilsKt$setup$1(0, function0, view3));
        bottomSheetBehavior.skipCollapsed = true;
        if (view2 != null) {
            view = view2;
        }
        InsetsUtilsKt.onInsetsChanged(view, new BrandsSearchView$$ExternalSyntheticLambda4(view, 7));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewUtils.AnonymousClass3(1));
        }
    }

    public static final String toClickableLabel(GenericTreeElementsViewEvent genericTreeElementsViewEvent, Composer composer) {
        genericTreeElementsViewEvent.getClass();
        Integer valueOf = ((genericTreeElementsViewEvent instanceof GenericTreeElementsViewEvent.OpenUrlEvent) || (genericTreeElementsViewEvent instanceof GenericTreeElementsViewEvent.PromptOverlayEvent)) ? Integer.valueOf(R.string.open_click_label) : genericTreeElementsViewEvent instanceof GenericTreeElementsViewEvent.DismissEvent ? Integer.valueOf(R.string.dismiss_click_label) : null;
        GapComposer gapComposer = (GapComposer) composer;
        if (valueOf == null) {
            gapComposer.startReplaceGroup(1191326380);
            gapComposer.end(false);
            return null;
        }
        gapComposer.startReplaceGroup(1191326381);
        String stringResource = Room.stringResource(gapComposer, valueOf.intValue());
        gapComposer.end(false);
        return stringResource;
    }

    public static zzbi zza(String str, Object obj, Class cls) {
        return new zzbi(3, obj, zzh(obj, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static Object zzd(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(zzi(obj.getClass(), str, cls2).invoke(obj, serializable));
        } catch (Exception e) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e);
        }
    }

    public static Field zzh(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(CameraSelector$$ExternalSyntheticOutline0.m("Failed to find a field named ", str, " on an object of instance ", obj.getClass().getName()));
    }

    public static Method zzi(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
