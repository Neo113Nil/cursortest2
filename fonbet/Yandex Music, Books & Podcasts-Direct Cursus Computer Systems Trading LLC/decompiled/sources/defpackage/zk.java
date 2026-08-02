package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class zk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ zk(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        Function0 function0 = this.b;
        Object obj3 = gq5.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                j66.l(function0, (hq5) obj, rvf.R(1));
                break;
            case 1:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                Function0 function02 = this.b;
                boolean f = oq5Var2.f(function02);
                Object K = oq5Var2.K();
                if (f || K == obj3) {
                    K = new yrm(R.drawable.ic_add_24, R.string.dialog_action_add_to_playlist, "dialog_action_add", function02);
                    oq5Var2.k0(K);
                }
                ivf.o((yrm) K, function02, null, null, null, oq5Var2, 0, 28);
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                Function0 function03 = this.b;
                boolean f2 = oq5Var4.f(function03);
                Object K2 = oq5Var4.K();
                if (f2 || K2 == obj3) {
                    K2 = new tbq(function03);
                    oq5Var4.k0(K2);
                }
                ivf.o((tbq) K2, function03, vci.a, null, null, oq5Var4, 384, 24);
            case 3:
                ((Integer) obj2).getClass();
                sk3.b(function0, (hq5) obj, rvf.R(1));
                break;
            case 4:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                ild.i(function0, d.d(vciVar, 1.0f), hq5Var3, 48);
            case 5:
                ((Integer) obj2).getClass();
                lxe.a(function0, (hq5) obj, rvf.R(1));
                break;
            case 6:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                zsd.g(this.b, null, 0, 0L, 0, hq5Var4, 0, 30);
            case 7:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                zsd.g(this.b, null, 0, 0L, 0, hq5Var5, 0, 30);
            case 8:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var6;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                zsd.g(this.b, null, 0, 0L, 0, hq5Var6, 0, 30);
            case 9:
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var7;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                oq5 oq5Var10 = (oq5) hq5Var7;
                Function0 function04 = this.b;
                boolean f3 = oq5Var10.f(function04);
                Object K3 = oq5Var10.K();
                if (f3 || K3 == obj3) {
                    K3 = new yrm(R.drawable.ic_trash_24, R.string.dialog_action_delete_from_phone_memory, "dialog_action_uncache", function04);
                    oq5Var10.k0(K3);
                }
                ivf.o((yrm) K3, function04, null, null, null, oq5Var10, 0, 28);
            case 10:
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var8;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                oq5 oq5Var12 = (oq5) hq5Var8;
                Function0 function05 = this.b;
                boolean f4 = oq5Var12.f(function05);
                Object K4 = oq5Var12.K();
                if (f4 || K4 == obj3) {
                    K4 = new u8p(R.drawable.ic_complain_24, R.string.menu_element_complaint_track, "dialog_action_complaint", function05);
                    oq5Var12.k0(K4);
                }
                ivf.o((u8p) K4, function05, null, null, null, oq5Var12, 0, 28);
            case 11:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var9;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                ug3.a(zsd.c0(d.c(vciVar, 1.0f), function0), hq5Var9, 0);
            case 12:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                oq5 oq5Var15 = (oq5) hq5Var10;
                Function0 function06 = this.b;
                boolean f5 = oq5Var15.f(function06);
                Object K5 = oq5Var15.K();
                if (f5 || K5 == obj3) {
                    K5 = new u8p(R.drawable.ic_trash_24, R.string.menu_element_delete_from_queue, "dialog_action_delete_from_queue", function06);
                    oq5Var15.k0(K5);
                }
                ivf.o((u8p) K5, function06, null, null, null, oq5Var15, 0, 28);
            case 13:
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var11;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                oq5 oq5Var17 = (oq5) hq5Var11;
                Function0 function07 = this.b;
                boolean f6 = oq5Var17.f(function07);
                Object K6 = oq5Var17.K();
                if (f6 || K6 == obj3) {
                    K6 = new u8p(R.drawable.ic_trash_24, R.string.menu_element_delete_from_phonoteka, "dialog_action_delete_from_collection", function07);
                    oq5Var17.k0(K6);
                }
                ivf.o((u8p) K6, function07, null, null, null, oq5Var17, 0, 28);
            case 14:
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var18 = (oq5) hq5Var12;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        break;
                    }
                }
                oq5 oq5Var19 = (oq5) hq5Var12;
                Function0 function08 = this.b;
                boolean f7 = oq5Var19.f(function08);
                Object K7 = oq5Var19.K();
                if (f7 || K7 == obj3) {
                    K7 = new u8p(R.drawable.ic_remove, R.string.menu_element_delete_from_playlist, "dialog_action_delete_from_playlist", function08);
                    oq5Var19.k0(K7);
                }
                ivf.o((u8p) K7, function08, null, null, null, oq5Var19, 0, 28);
            case 15:
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var13;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                oq5 oq5Var21 = (oq5) hq5Var13;
                Function0 function09 = this.b;
                boolean f8 = oq5Var21.f(function09);
                Object K8 = oq5Var21.K();
                if (f8 || K8 == obj3) {
                    K8 = new hcq(function09);
                    oq5Var21.k0(K8);
                }
                ivf.o((hcq) K8, function09, vci.a, null, null, oq5Var21, 384, 24);
            case 16:
                hq5 hq5Var14 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var22 = (oq5) hq5Var14;
                if (oq5Var22.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean f9 = oq5Var22.f(function0);
                    Object K9 = oq5Var22.K();
                    if (f9 || K9 == obj3) {
                        K9 = new or(17, function0);
                        oq5Var22.k0(K9);
                    }
                    bcx.d((Function0) K9, a.a(vciVar, "disable_auto_cache_confirm_button"), false, vwb.b, oq5Var22, 3120, 4);
                } else {
                    oq5Var22.S();
                }
                break;
            case 17:
                hq5 hq5Var15 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var23 = (oq5) hq5Var15;
                if (oq5Var23.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f10 = oq5Var23.f(function0);
                    Object K10 = oq5Var23.K();
                    if (f10 || K10 == obj3) {
                        K10 = new or(16, function0);
                        oq5Var23.k0(K10);
                    }
                    bcx.d((Function0) K10, a.a(vciVar, "disable_auto_cache_dismiss_button"), false, vwb.c, oq5Var23, 3120, 4);
                } else {
                    oq5Var23.S();
                }
                break;
            case 18:
                hq5 hq5Var16 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var16;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        break;
                    }
                }
                xee.q(this.b, null, false, null, men.c, hq5Var16, 805306368, 510);
            case 19:
                hq5 hq5Var17 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var25 = (oq5) hq5Var17;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        break;
                    }
                }
                xee.q(this.b, null, false, null, men.d, hq5Var17, 805306368, 510);
            case 20:
                hq5 hq5Var18 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var26 = (oq5) hq5Var18;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        break;
                    }
                }
                oq5 oq5Var27 = (oq5) hq5Var18;
                Function0 function010 = this.b;
                boolean f11 = oq5Var27.f(function010);
                Object K11 = oq5Var27.K();
                if (f11 || K11 == obj3) {
                    K11 = new yrm(R.drawable.ic_tracklyrics_24, R.string.dialog_action_show_lyrics, "dialog_action_lyrics", function010);
                    oq5Var27.k0(K11);
                }
                ivf.o((yrm) K11, function010, null, null, null, oq5Var27, 0, 28);
            case 21:
                hq5 hq5Var19 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var28 = (oq5) hq5Var19;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        break;
                    }
                }
                oq5 oq5Var29 = (oq5) hq5Var19;
                Function0 function011 = this.b;
                boolean f12 = oq5Var29.f(function011);
                Object K12 = oq5Var29.K();
                if (f12 || K12 == obj3) {
                    K12 = new yrm(R.drawable.ic_check_24, R.string.menu_element_mark_as_read, "dialog_action_mark_read", function011);
                    oq5Var29.k0(K12);
                }
                ivf.o((yrm) K12, function011, null, null, null, oq5Var29, 0, 28);
            case 22:
                hq5 hq5Var20 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var30 = (oq5) hq5Var20;
                    if (oq5Var30.z()) {
                        oq5Var30.S();
                        break;
                    }
                }
                oq5 oq5Var31 = (oq5) hq5Var20;
                Function0 function012 = this.b;
                boolean f13 = oq5Var31.f(function012);
                Object K13 = oq5Var31.K();
                if (f13 || K13 == obj3) {
                    K13 = new pcq(function012);
                    oq5Var31.k0(K13);
                }
                ivf.o((pcq) K13, function012, null, null, null, oq5Var31, 0, 28);
            case 23:
                ((Integer) obj2).getClass();
                hdg.k(function0, (hq5) obj, rvf.R(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ivf.e(function0, (hq5) obj, rvf.R(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                v3g.i(function0, (hq5) obj, rvf.R(1));
                break;
            case 26:
                hq5 hq5Var21 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var32 = (oq5) hq5Var21;
                    if (oq5Var32.z()) {
                        oq5Var32.S();
                        break;
                    }
                }
                oq5 oq5Var33 = (oq5) hq5Var21;
                Function0 function013 = this.b;
                boolean f14 = oq5Var33.f(function013);
                Object K14 = oq5Var33.K();
                if (f14 || K14 == obj3) {
                    K14 = new tcq(function013);
                    oq5Var33.k0(K14);
                }
                ivf.o((tcq) K14, function013, vci.a, null, null, oq5Var33, 384, 24);
            case 27:
                float floatValue = ((Float) obj2).floatValue();
                ((lfm) obj).getClass();
                if (floatValue < 0.0f) {
                    function0.invoke();
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                float floatValue2 = ((Float) obj2).floatValue();
                ((lfm) obj).getClass();
                if (floatValue2 < 0.0f) {
                    function0.invoke();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                v3g.c(function0, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zk(Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = function0;
    }
}
