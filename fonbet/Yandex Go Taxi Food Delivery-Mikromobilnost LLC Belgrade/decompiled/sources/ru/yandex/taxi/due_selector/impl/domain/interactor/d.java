package ru.yandex.taxi.due_selector.impl.domain.interactor;

import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ScheduledOrderDescriptionItem;
import defpackage.avj0;
import defpackage.awm;
import defpackage.axm;
import defpackage.az91;
import defpackage.bwm;
import defpackage.cjw0;
import defpackage.evu0;
import defpackage.f4w;
import defpackage.fwm;
import defpackage.g8e;
import defpackage.j7z0;
import defpackage.kyh0;
import defpackage.m501;
import defpackage.n3a;
import defpackage.o73;
import defpackage.pex0;
import defpackage.pxm;
import defpackage.qxm;
import defpackage.rol0;
import defpackage.ryh;
import defpackage.seq0;
import defpackage.swm;
import defpackage.w511;
import defpackage.wf7;
import defpackage.wiq0;
import defpackage.x3w;
import defpackage.y1s;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Pattern;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerStateInfo$PickerState;

/* loaded from: classes5.dex */
public final class d {
    public final com.yandex.go.due.data.repository.a a;
    public final cjw0 b;
    public final bwm c;
    public final ryh d;
    public final axm e;
    public final y1s f;
    public final fwm g;
    public final seq0 h;
    public final wiq0 i;

    public d(com.yandex.go.due.data.repository.a aVar, cjw0 cjw0Var, bwm bwmVar, ryh ryhVar, axm axmVar, y1s y1sVar, fwm fwmVar, seq0 seq0Var, wiq0 wiq0Var) {
        this.a = aVar;
        this.b = cjw0Var;
        this.c = bwmVar;
        this.d = ryhVar;
        this.e = axmVar;
        this.f = y1sVar;
        this.g = fwmVar;
        this.h = seq0Var;
        this.i = wiq0Var;
    }

    public final c a(az91 az91Var) {
        ScheduledOrderAvailabilityRequest.OpenOrigin openOrigin;
        ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type type = ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type.DEFAULT;
        if (az91Var instanceof qxm) {
            openOrigin = ScheduledOrderAvailabilityRequest.OpenOrigin.SUMMARY;
        } else {
            if (!(az91Var instanceof pxm)) {
                w511.b();
                return null;
            }
            openOrigin = ScheduledOrderAvailabilityRequest.OpenOrigin.INTERCITY_DASHBOARD;
        }
        return new c(new rol0(new DuePickerStateInteractor$fetchState$1(this, type, openOrigin, null)), this);
    }

    public final swm b(swm swmVar, Calendar calendar, boolean z) {
        pex0 m;
        String str;
        String str2;
        String str3;
        j7z0 j7z0Var = swmVar.c;
        List list = swmVar.f;
        boolean b = j7z0Var.b(calendar);
        int i = j7z0Var.c;
        boolean isEmpty = j7z0Var.b.isEmpty();
        cjw0 cjw0Var = this.c.b;
        Pattern pattern = bwm.c;
        boolean z2 = calendar.getTimeZone().getRawOffset() == TimeZone.getDefault().getRawOffset();
        String str4 = "";
        if (i > 0) {
            wf7 wf7Var = wf7.a;
            Calendar c = wf7.c(calendar, calendar.getTimeZone());
            c.add(12, i);
            String p = g8e.p(m501.w(calendar), "-", m501.w(c));
            wiq0 wiq0Var = (wiq0) cjw0Var.a;
            String i2 = ((avj0) ((zuj0) cjw0Var.c)).i(z2 ? kyh0.due_select_driver_arrive : kyh0.due_select_driver_arrive_local_time, p);
            k kVar = (k) wiq0Var;
            if (kVar.m() != null && (m = kVar.m()) != null && (str = m.b) != null) {
                n3a n3aVar = (n3a) cjw0Var.b;
                if (z2) {
                    awm awmVar = (awm) n3aVar.b.b();
                    f4w f4wVar = (f4w) awmVar.c.get(str);
                    if (f4wVar != null) {
                        str2 = (String) awmVar.b.getOrDefault(f4wVar.a, "");
                        str3 = str2;
                    }
                    str3 = null;
                } else {
                    awm awmVar2 = (awm) n3aVar.b.b();
                    f4w f4wVar2 = (f4w) awmVar2.c.get(str);
                    if (f4wVar2 != null) {
                        str2 = (String) awmVar2.b.getOrDefault(f4wVar2.b, "");
                        str3 = str2;
                    }
                    str3 = null;
                }
                String str5 = str3;
                if (str5 != null) {
                    str4 = String.format(str5, Arrays.copyOf(new Object[]{p}, 1));
                }
            }
            str4 = i2;
        } else if (!z2) {
            String w = m501.w(calendar);
            pex0 m2 = ((k) ((wiq0) cjw0Var.a)).m();
            if (m2 != null) {
                n3a n3aVar2 = (n3a) cjw0Var.b;
                String str6 = m2.b;
                awm awmVar3 = (awm) n3aVar2.b.b();
                f4w f4wVar3 = (f4w) awmVar3.c.get(str6);
                String str7 = f4wVar3 != null ? (String) awmVar3.b.getOrDefault(f4wVar3.b, "") : null;
                if (str7 != null) {
                    str4 = String.format(str7, Arrays.copyOf(new Object[]{w}, 1));
                }
            }
            str4 = ((avj0) ((zuj0) cjw0Var.c)).i(kyh0.due_select_driver_arrive_local_time, w);
        }
        boolean J = evu0.J(str4);
        if (b && !J) {
            return new swm(DuePickerStateInfo$PickerState.VALID_DATE, swmVar.b, swmVar.c, calendar, this.d.C(swmVar.e, calendar, j7z0Var.c, str4, z), list, swmVar.g, swmVar.h, swmVar.i, swmVar.j, swmVar.k, swmVar.l, swmVar.m);
        }
        if (!b) {
            return isEmpty ? new swm(DuePickerStateInfo$PickerState.UNAVAILABLE, swmVar.b, swmVar.c, swmVar.d, swmVar.e, swmVar.f, swmVar.g, swmVar.h, swmVar.i, swmVar.j, swmVar.k, swmVar.l, swmVar.m) : new swm(DuePickerStateInfo$PickerState.INVALID_DATE, swmVar.b, swmVar.c, calendar, this.d.C(swmVar.e, calendar, j7z0Var.c, str4, z), swmVar.f, swmVar.g, swmVar.h, swmVar.i, swmVar.j, swmVar.k, swmVar.l, swmVar.m);
        }
        List list2 = swmVar.e;
        this.d.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            x3w x3wVar = (x3w) obj;
            if (!(x3wVar instanceof ScheduledOrderDescriptionItem) || !((ScheduledOrderDescriptionItem) x3wVar).d) {
                if (!(x3wVar instanceof o73)) {
                    arrayList.add(obj);
                }
            }
        }
        return new swm(DuePickerStateInfo$PickerState.VALID_DATE, swmVar.b, swmVar.c, calendar, arrayList, list, swmVar.g, swmVar.h, swmVar.i, swmVar.j, swmVar.k, swmVar.l, swmVar.m);
    }
}
