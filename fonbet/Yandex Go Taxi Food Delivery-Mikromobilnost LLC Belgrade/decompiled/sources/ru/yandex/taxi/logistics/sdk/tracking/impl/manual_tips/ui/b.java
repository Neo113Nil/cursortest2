package ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui;

import defpackage.af00;
import defpackage.bvf0;
import defpackage.c1x0;
import defpackage.ds31;
import defpackage.ffz0;
import defpackage.gci0;
import defpackage.gf00;
import defpackage.hf00;
import defpackage.ho;
import defpackage.j00;
import defpackage.jl40;
import defpackage.jwh;
import defpackage.uzh0;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yr31;
import defpackage.ziq0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;

/* loaded from: classes5.dex */
public final class b extends yr31 {
    public final gf00 A;
    public final r0 B;
    public final r0 C;
    public final gci0 D;
    public final hf00 b;
    public final jwh c;
    public final LocalFeedbackRepository w;
    public final c1x0 x;
    public final DecimalFormat y = new DecimalFormat("#.###");
    public final af00 z;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(hf00 hf00Var, jwh jwhVar, LocalFeedbackRepository localFeedbackRepository, j00 j00Var, c1x0 c1x0Var) {
        af00 af00Var;
        String str;
        String str2;
        this.b = hf00Var;
        this.c = jwhVar;
        this.w = localFeedbackRepository;
        this.x = c1x0Var;
        List a = j00Var.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof ho : true) {
                arrayList.add(next);
            }
        }
        ho hoVar = (ho) kotlin.collections.a.R(arrayList);
        if (hoVar != null) {
            ArrayList arrayList2 = hoVar.a;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof ffz0) {
                    arrayList3.add(obj);
                }
            }
            ffz0 ffz0Var = (ffz0) kotlin.collections.a.R(arrayList3);
            if (ffz0Var != null) {
                ziq0 ziq0Var = (ziq0) localFeedbackRepository.b.getValue();
                if (jl40.l(ffz0Var.a, ziq0Var != null ? ziq0Var.a : null)) {
                    str = ziq0Var.b;
                } else {
                    String str3 = ffz0Var.d;
                    if (str3 != null) {
                        str2 = str3;
                        af00Var = new af00(ffz0Var.c, str2, ffz0Var.e, ffz0Var.f, ffz0Var.a);
                        this.z = af00Var;
                        int i = uzh0.delivery_manual_tip_editor_title;
                        String str4 = af00Var.a;
                        gf00 gf00Var = new gf00(i, this.y.format(af00Var.c), this.y.format(af00Var.d), str4 == null ? "" : str4, "", null);
                        this.A = gf00Var;
                        String str5 = af00Var.b;
                        r0 c = bvf0.c(str5 != null ? str5 : "");
                        this.B = c;
                        r0 c2 = bvf0.c(null);
                        this.C = c2;
                        this.D = e.R(new m0(c, c2, new ManualTipViewModel$manualTipFlow$1(this, null)), ds31.a(this), wsr0.a(xsr0.a, 3), gf00Var);
                        if (af00Var == af00.f) {
                            this.b.a.dismiss();
                            return;
                        }
                        return;
                    }
                    str = (String) localFeedbackRepository.e.getValue();
                }
                str2 = str;
                af00Var = new af00(ffz0Var.c, str2, ffz0Var.e, ffz0Var.f, ffz0Var.a);
                this.z = af00Var;
                int i2 = uzh0.delivery_manual_tip_editor_title;
                String str42 = af00Var.a;
                gf00 gf00Var2 = new gf00(i2, this.y.format(af00Var.c), this.y.format(af00Var.d), str42 == null ? "" : str42, "", null);
                this.A = gf00Var2;
                String str52 = af00Var.b;
                r0 c3 = bvf0.c(str52 != null ? str52 : "");
                this.B = c3;
                r0 c22 = bvf0.c(null);
                this.C = c22;
                this.D = e.R(new m0(c3, c22, new ManualTipViewModel$manualTipFlow$1(this, null)), ds31.a(this), wsr0.a(xsr0.a, 3), gf00Var2);
                if (af00Var == af00.f) {
                }
            }
        }
        af00Var = af00.f;
        this.z = af00Var;
        int i22 = uzh0.delivery_manual_tip_editor_title;
        String str422 = af00Var.a;
        gf00 gf00Var22 = new gf00(i22, this.y.format(af00Var.c), this.y.format(af00Var.d), str422 == null ? "" : str422, "", null);
        this.A = gf00Var22;
        String str522 = af00Var.b;
        r0 c32 = bvf0.c(str522 != null ? str522 : "");
        this.B = c32;
        r0 c222 = bvf0.c(null);
        this.C = c222;
        this.D = e.R(new m0(c32, c222, new ManualTipViewModel$manualTipFlow$1(this, null)), ds31.a(this), wsr0.a(xsr0.a, 3), gf00Var22);
        if (af00Var == af00.f) {
        }
    }

    public final void W(String str, Map map) {
        MapBuilder a = this.x.a(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(a);
        this.c.a.o(str, null, linkedHashMap);
    }
}
