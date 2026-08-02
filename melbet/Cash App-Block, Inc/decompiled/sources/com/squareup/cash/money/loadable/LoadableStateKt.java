package com.squareup.cash.money.loadable;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.money.loadable.Loadable;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public abstract class LoadableStateKt {
    public static final MutableState collectAsLoadableState(Flow flow, GapComposer gapComposer) {
        flow.getClass();
        boolean changed = gapComposer.changed(flow);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 5);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return Updater.collectAsState((Flow) rememberedValue, Loadable.Loading.INSTANCE, null, gapComposer, 48, 2);
    }

    public static final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate firstSelectableOrNull(List list) {
        Object obj;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (isSelectable((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj)) {
                break;
            }
        }
        return (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj;
    }

    public static final ArraysKt___ArraysJvmKt$asList$3 getAvailableAfModes(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key.getClass();
        Object obj = {0};
        Object obj2 = ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (obj2 != null) {
            obj = obj2;
        }
        return new ArraysKt___ArraysJvmKt$asList$3((int[]) obj, 0);
    }

    public static final int getSupportedAeMode(CameraMetadata cameraMetadata, int i) {
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        Object obj = {0};
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        Object obj2 = camera2CameraMetadata.get(key);
        if (obj2 != null) {
            obj = obj2;
        }
        if (new ArraysKt___ArraysJvmKt$asList$3((int[]) obj, 0).contains(Integer.valueOf(i))) {
            return i;
        }
        key.getClass();
        Object obj3 = {0};
        Object obj4 = camera2CameraMetadata.get(key);
        if (obj4 != null) {
            obj3 = obj4;
        }
        return new ArraysKt___ArraysJvmKt$asList$3((int[]) obj3, 0).contains(1) ? 1 : 0;
    }

    public static final boolean isSelectable(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate) {
        calendarDate.getClass();
        List<AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment> list = calendarDate.treatments;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment dateTreatment : list) {
            if ((dateTreatment instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) || (dateTreatment instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue)) {
                return true;
            }
        }
        return false;
    }

    public static final Object valueOrNull(Loadable loadable) {
        loadable.getClass();
        if (Intrinsics.areEqual(loadable, Loadable.Loading.INSTANCE)) {
            return null;
        }
        if (loadable instanceof Loadable.Loaded) {
            return ((Loadable.Loaded) loadable).value;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
