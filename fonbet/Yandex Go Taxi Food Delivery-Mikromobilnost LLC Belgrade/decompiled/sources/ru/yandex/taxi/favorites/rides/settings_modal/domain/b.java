package ru.yandex.taxi.favorites.rides.settings_modal.domain;

import android.content.Context;
import com.yandex.go.slot.dto.SettingsModalContentItemDto$Slot;
import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.irs0;
import defpackage.jgv;
import defpackage.lar0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.t9r0;
import defpackage.tt2;
import defpackage.xss0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class b {
    public final Context a;
    public final irs0 b;
    public final t9r0 c;
    public final jgv d;
    public final e e;
    public final tt2 f;

    public b(Context context, irs0 irs0Var, t9r0 t9r0Var, jgv jgvVar, e eVar, tt2 tt2Var) {
        this.a = context;
        this.b = irs0Var;
        this.c = t9r0Var;
        this.d = jgvVar;
        this.e = eVar;
        this.f = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SettingsModalContentItemDto$Slot settingsModalContentItemDto$Slot, int i, boolean z, ContinuationImpl continuationImpl) {
        SettingsModalUiStateMapper$mapSlot$1 settingsModalUiStateMapper$mapSlot$1;
        int i2;
        String str;
        String str2;
        if (continuationImpl instanceof SettingsModalUiStateMapper$mapSlot$1) {
            settingsModalUiStateMapper$mapSlot$1 = (SettingsModalUiStateMapper$mapSlot$1) continuationImpl;
            int i3 = settingsModalUiStateMapper$mapSlot$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                settingsModalUiStateMapper$mapSlot$1.label = i3 - Integer.MIN_VALUE;
                Object obj = settingsModalUiStateMapper$mapSlot$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = settingsModalUiStateMapper$mapSlot$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        str2 = (String) settingsModalUiStateMapper$mapSlot$1.L$1;
                        kotlin.b.b(obj);
                        return new lar0(str2, (xss0) obj);
                    }
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) settingsModalUiStateMapper$mapSlot$1.L$1;
                    kotlin.b.b(obj);
                    return new lar0(str, (xss0) obj);
                }
                kotlin.b.b(obj);
                t9r0 t9r0Var = this.c;
                irs0 irs0Var = this.b;
                if (z) {
                    String i4 = oyr.i(i, "Slot_");
                    SlotItemDto slotItemDto = settingsModalContentItemDto$Slot.a;
                    settingsModalUiStateMapper$mapSlot$1.L$0 = null;
                    settingsModalUiStateMapper$mapSlot$1.L$1 = i4;
                    settingsModalUiStateMapper$mapSlot$1.I$0 = i;
                    settingsModalUiStateMapper$mapSlot$1.Z$0 = z;
                    settingsModalUiStateMapper$mapSlot$1.label = 1;
                    obj = ((com.yandex.go.slot.mapper.a) irs0Var).q(slotItemDto, t9r0Var, settingsModalUiStateMapper$mapSlot$1);
                    if (obj != coroutineSingletons) {
                        str2 = i4;
                        return new lar0(str2, (xss0) obj);
                    }
                } else {
                    String i5 = oyr.i(i, "Slot_");
                    SlotItemDto slotItemDto2 = settingsModalContentItemDto$Slot.a;
                    settingsModalUiStateMapper$mapSlot$1.L$0 = null;
                    settingsModalUiStateMapper$mapSlot$1.L$1 = i5;
                    settingsModalUiStateMapper$mapSlot$1.I$0 = i;
                    settingsModalUiStateMapper$mapSlot$1.Z$0 = z;
                    settingsModalUiStateMapper$mapSlot$1.label = 2;
                    obj = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto2, t9r0Var, false, false, null, settingsModalUiStateMapper$mapSlot$1);
                    if (obj != coroutineSingletons) {
                        str = i5;
                        return new lar0(str, (xss0) obj);
                    }
                }
                return coroutineSingletons;
            }
        }
        settingsModalUiStateMapper$mapSlot$1 = new SettingsModalUiStateMapper$mapSlot$1(this, continuationImpl);
        Object obj2 = settingsModalUiStateMapper$mapSlot$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = settingsModalUiStateMapper$mapSlot$1.label;
        if (i2 == 0) {
        }
    }
}
