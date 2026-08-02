package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import com.google.i18n.phonenumbers.a;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesTarget;
import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetState$SelectAccount$Type;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetViewState$SelectAccount$Type;
import com.ybsdk.widgets.common.SuggestView$State$Behaviour;
import com.ybsdk.widgets.common.SuggestView$State$WidthType;
import com.ybsdk.widgets.common.WidgetWithToggleView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.o;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class yl01 implements ev31 {
    public final Context a;
    public final w530 b;

    public yl01(Context context, w530 w530Var) {
        this.a = context;
        this.b = w530Var;
    }

    public static x49 a(u031 u031Var) {
        if (!jl40.l(u031Var, t031.a) && !jl40.l(u031Var, r501.c)) {
            if (u031Var instanceof p031) {
                return a(((p031) u031Var).a);
            }
            if (u031Var instanceof s031) {
                p39 p39Var = ((s031) u031Var).z;
                if (p39Var != null) {
                    return q39.a(p39Var);
                }
            } else if (u031Var instanceof m031) {
                p39 p39Var2 = ((m031) u031Var).w;
                if (p39Var2 != null) {
                    return q39.a(p39Var2);
                }
            } else {
                w511.b();
            }
        }
        return null;
    }

    public static rr51 c(u031 u031Var) {
        if (!jl40.l(u031Var, t031.a) && !jl40.l(u031Var, r501.c)) {
            if (u031Var instanceof p031) {
                return c(((p031) u031Var).a);
            }
            if (u031Var instanceof s031) {
                return ((s031) u031Var).y;
            }
            if (u031Var instanceof m031) {
                return ((m031) u031Var).c;
            }
            w511.b();
        }
        return null;
    }

    public static uvz0 d(u031 u031Var) {
        String str;
        String str2;
        if (!jl40.l(u031Var, r501.c) && !jl40.l(u031Var, t031.a)) {
            if (u031Var instanceof p031) {
                return d(((p031) u031Var).a);
            }
            if (u031Var instanceof s031) {
                rvz0 rvz0Var = ((s031) u031Var).a;
                if (rvz0Var != null && (str2 = rvz0Var.a) != null) {
                    Text.Constant i = g8e.i(Text.Companion, str2);
                    String str3 = rvz0Var.c;
                    Text.Constant constant = str3 != null ? new Text.Constant(str3) : null;
                    ThemedImageUrlEntity themedImageUrlEntity = rvz0Var.d;
                    return new uvz0(i, constant, themedImageUrlEntity != null ? job1.f(themedImageUrlEntity, new ri01(17)) : null);
                }
            } else if (u031Var instanceof m031) {
                rvz0 rvz0Var2 = ((m031) u031Var).a;
                if (rvz0Var2 != null && (str = rvz0Var2.a) != null) {
                    Text.Constant i2 = g8e.i(Text.Companion, str);
                    String str4 = rvz0Var2.c;
                    Text.Constant constant2 = str4 != null ? new Text.Constant(str4) : null;
                    ThemedImageUrlEntity themedImageUrlEntity2 = rvz0Var2.d;
                    return new uvz0(i2, constant2, themedImageUrlEntity2 != null ? job1.f(themedImageUrlEntity2, new ri01(18)) : null);
                }
            } else {
                w511.b();
            }
        }
        return null;
    }

    public static rbv e(ThemedImageUrlEntity themedImageUrlEntity, int i) {
        return job1.f(themedImageUrlEntity, new ii8(i, 24));
    }

    public static t451 f(vm01 vm01Var, boolean z, boolean z2) {
        WidgetWithToggleView.ToggleState toggleState;
        ColorModel colorModel;
        ColorModel colorModel2 = vm01Var.c;
        fme fmeVar = vm01Var.e;
        Text.Constant i = g8e.i(Text.Companion, vm01Var.a);
        ColorModel colorModel3 = vm01Var.b;
        zsv zsvVar = vm01Var.f;
        rbv f = job1.f(zsvVar.b, new ri01(16));
        String str = zsvVar.a;
        ControlState controlState = vm01Var.d;
        int[] iArr = xl01.c;
        int i2 = iArr[controlState.ordinal()];
        if (i2 == 1) {
            toggleState = WidgetWithToggleView.ToggleState.ON;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            toggleState = WidgetWithToggleView.ToggleState.OFF;
        }
        ColorModel colorModel4 = fmeVar.c;
        int i3 = iArr[controlState.ordinal()];
        if (i3 == 1) {
            colorModel = fmeVar.a;
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            colorModel = fmeVar.b;
        }
        t451 t451Var = new t451(colorModel2, colorModel3, i, str, f, new o(toggleState, colorModel4, colorModel), z2);
        if (z) {
            return t451Var;
        }
        return null;
    }

    public final String b(String str) {
        String b;
        return (!cvu0.t(str, "RUB", true) || (b = this.b.b(str)) == null) ? str : b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:342:0x090c, code lost:
    
        if (r3 == null) goto L629;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x097a A[LOOP:4: B:346:0x0974->B:348:0x097a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x02e9  */
    /* JADX WARN: Type inference failed for: r15v2, types: [tev] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4, types: [com.ybsdk.core.utils.text.Text$Constant] */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [t451] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r3v200 */
    /* JADX WARN: Type inference failed for: r3v201, types: [px11] */
    /* JADX WARN: Type inference failed for: r3v268 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r60v1 */
    /* JADX WARN: Type inference failed for: r60v2 */
    /* JADX WARN: Type inference failed for: r60v33 */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        ytb ytbVar;
        boolean z;
        ytb ytbVar2;
        BigDecimal bigDecimal;
        String str;
        String str2;
        hh6 fh6Var;
        List list;
        mfq0 mfq0Var;
        int i;
        boolean z2;
        List list2;
        boolean z3;
        xf6 xf6Var;
        xf6 xf6Var2;
        xf6 xf6Var3;
        int i2;
        BottomSheetViewState$SelectAccount$Type bottomSheetViewState$SelectAccount$Type;
        xf6 xf6Var4;
        hh6 hh6Var;
        Text.Constant constant;
        Text.Constant constant2;
        ubv0 ubv0Var;
        int i3;
        SuggestView$State$Behaviour suggestView$State$Behaviour;
        gjq0 gjq0Var;
        String str3;
        String str4;
        dcf dcfVar;
        String str5;
        bk01 bk01Var;
        eh01 b;
        boolean z4;
        rbv nbvVar;
        ThemedImageUrlEntity themedImageUrlEntity;
        ThemedImageUrlEntity image;
        boolean z5;
        rbv rbvVar;
        Integer valueOf;
        Integer num;
        Integer valueOf2;
        TransferDeeplink transferDeeplink;
        Integer num2;
        Text.Constant i4;
        String str6;
        String str7;
        String str8;
        boolean z6;
        int i5;
        String str9;
        boolean z7;
        boolean z8;
        boolean z9;
        ?? r31;
        Object obj2;
        xk01 xk01Var = (xk01) obj;
        hzt0 hzt0Var = null;
        if (!(xk01Var instanceof wk01)) {
            if (xk01Var instanceof uk01) {
                return new tl01(((uk01) xk01Var).a);
            }
            if (xk01Var instanceof vk01) {
                return new ul01(false, ((vk01) xk01Var).a);
            }
            w511.b();
            return null;
        }
        wk01 wk01Var = (wk01) xk01Var;
        unq unqVar = wk01Var.j;
        u031 u031Var = wk01Var.q;
        wjq0 wjq0Var = wk01Var.i;
        ak1 ak1Var = wk01Var.g;
        if (wk01Var.v.getRequireNavigation()) {
            return new ul01(true, null);
        }
        String str10 = "";
        if (wjq0Var != null) {
            UnconditionalLimitWidgetEntity d = ysb1.d(u031Var);
            vm01 vm01Var = wk01Var.C;
            boolean z10 = wjq0Var.b().f != null;
            boolean z11 = wjq0Var instanceof njq0;
            if (z11) {
                z5 = false;
                z4 = false;
                ThemedImageUrlEntity themedImageUrlEntity2 = ((njq0) wjq0Var).a.f;
                if (themedImageUrlEntity2 != null) {
                    nbvVar = e(themedImageUrlEntity2, txg0.ybsdk_ic_bank_placeholder_without_background);
                } else {
                    rbvVar = null;
                    if (!z11 || (wjq0Var instanceof vjq0) || (wjq0Var instanceof ujq0) || (wjq0Var instanceof sjq0) || (wjq0Var instanceof ljq0) || (wjq0Var instanceof ijq0) || (wjq0Var instanceof jjq0) || (wjq0Var instanceof tjq0) || (wjq0Var instanceof djq0) || (wjq0Var instanceof cjq0) || (wjq0Var instanceof hjq0) || (wjq0Var instanceof gjq0) || (wjq0Var instanceof kjq0)) {
                        valueOf = Integer.valueOf(nyg0.ybsdk_circle_button_background);
                    } else {
                        if (!(wjq0Var instanceof ajq0)) {
                            w511.b();
                            return null;
                        }
                        valueOf = null;
                    }
                    ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                    if (!z11 || (wjq0Var instanceof vjq0) || (wjq0Var instanceof ujq0) || (wjq0Var instanceof sjq0) || (wjq0Var instanceof ljq0) || (wjq0Var instanceof ijq0) || (wjq0Var instanceof tjq0) || (wjq0Var instanceof jjq0) || (wjq0Var instanceof djq0) || (wjq0Var instanceof cjq0) || (wjq0Var instanceof hjq0) || (wjq0Var instanceof gjq0) || (wjq0Var instanceof kjq0)) {
                        num = null;
                    } else {
                        if (!(wjq0Var instanceof ajq0)) {
                            w511.b();
                            return null;
                        }
                        num = Integer.valueOf(kwg0.ybsdk_transfer_stadium_icon_aft_padding);
                    }
                    valueOf2 = Integer.valueOf(txg0.ybsdk_ic_arrow_short_bottom);
                    transferDeeplink = wjq0Var.b().f;
                    if (!jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE) && transferDeeplink != null) {
                        if (transferDeeplink.equals(TransferDeeplink.AllTargets.INSTANCE) && !transferDeeplink.equals(TransferDeeplink.PhoneTransfer.INSTANCE) && !transferDeeplink.equals(TransferDeeplink.CrossBorderTransfer.INSTANCE) && !(transferDeeplink instanceof TransferDeeplink.RawAction) && !transferDeeplink.equals(TransferDeeplink.RequisitesTransfer.INSTANCE) && !(transferDeeplink instanceof TransferDeeplink.SelectTarget) && !transferDeeplink.equals(TransferDeeplink.Self.ItemsSheet.INSTANCE) && !transferDeeplink.equals(TransferDeeplink.Self.SectionsSheet.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        if (!(wjq0Var instanceof ajq0) || (wjq0Var instanceof djq0) || (wjq0Var instanceof cjq0) || (wjq0Var instanceof ijq0) || (wjq0Var instanceof jjq0) || (wjq0Var instanceof ljq0) || z11 || (wjq0Var instanceof pjq0) || (wjq0Var instanceof rjq0) || (wjq0Var instanceof vjq0) || (wjq0Var instanceof ujq0) || (wjq0Var instanceof ojq0)) {
                            num2 = valueOf2;
                            if (!z11) {
                                i4 = g8e.i(Text.Companion, ((njq0) wjq0Var).a.c);
                            } else if (wjq0Var instanceof vjq0) {
                                i4 = g8e.i(Text.Companion, ((vjq0) wjq0Var).a.c);
                            } else if (wjq0Var instanceof ujq0) {
                                i4 = g8e.i(Text.Companion, ((ujq0) wjq0Var).a.c);
                            } else if (wjq0Var instanceof sjq0) {
                                b bVar = Text.Companion;
                                RequisitesTarget target = ((sjq0) wjq0Var).getTarget();
                                String title = target != null ? target.getTitle() : null;
                                if (title == null) {
                                    title = "";
                                }
                                i4 = g8e.i(bVar, title);
                            } else if (wjq0Var instanceof jjq0) {
                                i4 = g8e.i(Text.Companion, ((jjq0) wjq0Var).c.b);
                            } else if (wjq0Var instanceof ajq0) {
                                i4 = g8e.i(Text.Companion, ((ajq0) wjq0Var).c.c);
                            } else if (wjq0Var instanceof ljq0) {
                                i4 = g8e.i(Text.Companion, ((ljq0) wjq0Var).b.getName());
                            } else if (wjq0Var instanceof ijq0) {
                                i4 = g8e.i(Text.Companion, ((ijq0) wjq0Var).b.getName());
                            } else if (wjq0Var instanceof tjq0) {
                                i4 = g8e.i(Text.Companion, ((tjq0) wjq0Var).d);
                            } else if (wjq0Var instanceof djq0) {
                                i4 = g8e.i(Text.Companion, ((djq0) wjq0Var).b);
                            } else if (wjq0Var instanceof cjq0) {
                                b bVar2 = Text.Companion;
                                cjq0 cjq0Var = (cjq0) wjq0Var;
                                bjq0 bjq0Var = cjq0Var.e;
                                if (bjq0Var == null || (str6 = bjq0Var.c) == null) {
                                    str6 = cjq0Var.b;
                                }
                                i4 = g8e.i(bVar2, str6);
                            } else if (wjq0Var instanceof hjq0) {
                                i4 = g8e.i(Text.Companion, ((hjq0) wjq0Var).d);
                            } else if (wjq0Var instanceof gjq0) {
                                b bVar3 = Text.Companion;
                                String str11 = ((gjq0) wjq0Var).b.c;
                                if (str11 == null) {
                                    str11 = "";
                                }
                                i4 = g8e.i(bVar3, str11);
                            } else {
                                if (!(wjq0Var instanceof kjq0)) {
                                    w511.b();
                                    return null;
                                }
                                i4 = g8e.i(Text.Companion, ((kjq0) wjq0Var).b);
                            }
                            Text.Constant constant3 = i4;
                            boolean z12 = wjq0Var instanceof cjq0;
                            int i6 = !z12 ? 2 : 1;
                            Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_transfer_accessibility_edit_recipient);
                            if (z11) {
                                if (wjq0Var instanceof vjq0) {
                                    str7 = ((vjq0) wjq0Var).a.d;
                                } else if (wjq0Var instanceof ujq0) {
                                    str7 = ((ujq0) wjq0Var).a.d;
                                } else if (wjq0Var instanceof sjq0) {
                                    str7 = ((sjq0) wjq0Var).getAccountNumber();
                                } else if (wjq0Var instanceof jjq0) {
                                    str7 = ((jjq0) wjq0Var).c.c;
                                } else if (wjq0Var instanceof ajq0) {
                                    str7 = ((ajq0) wjq0Var).c.d;
                                } else if (wjq0Var instanceof ljq0) {
                                    str7 = xi91.c(((ljq0) wjq0Var).c);
                                } else if (wjq0Var instanceof ijq0) {
                                    ijq0 ijq0Var = (ijq0) wjq0Var;
                                    String subtitle = ijq0Var.b.getSubtitle();
                                    if (subtitle == null) {
                                        str7 = ijq0Var.c;
                                    } else {
                                        ytbVar = null;
                                        str7 = subtitle;
                                        if (str7 == null) {
                                        }
                                        z6 = wjq0Var instanceof djq0;
                                        int i7 = 17;
                                        if (!z6) {
                                        }
                                        i5 = i7;
                                        z7 = wjq0Var instanceof vjq0;
                                        if (z7) {
                                        }
                                        z8 = z9;
                                        if (vm01Var == null) {
                                        }
                                        hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant3, i6, h, r26, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                                        z = z5;
                                    }
                                } else if (wjq0Var instanceof tjq0) {
                                    str7 = ((tjq0) wjq0Var).e;
                                } else if (wjq0Var instanceof djq0) {
                                    str7 = ((djq0) wjq0Var).c;
                                } else if (z12) {
                                    cjq0 cjq0Var2 = (cjq0) wjq0Var;
                                    bjq0 bjq0Var2 = cjq0Var2.e;
                                    if (bjq0Var2 == null || (str8 = bjq0Var2.d) == null) {
                                        str8 = cjq0Var2.c;
                                    }
                                    if (str8 != null) {
                                        str7 = xi91.c(str8);
                                    }
                                } else if (wjq0Var instanceof hjq0) {
                                    str7 = ((hjq0) wjq0Var).e;
                                } else {
                                    if (wjq0Var instanceof gjq0) {
                                        Regex regex = kfb0.a;
                                        str7 = ((gjq0) wjq0Var).b.a;
                                        if (!evu0.z(str7, '*')) {
                                            try {
                                                a d2 = a.d();
                                                ytbVar = null;
                                                try {
                                                    str7 = d2.c(d2.p(str7, null), PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL);
                                                } catch (Exception unused) {
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    } else {
                                        ytbVar = null;
                                        if (!(wjq0Var instanceof kjq0)) {
                                            w511.b();
                                            return null;
                                        }
                                        str7 = ((kjq0) wjq0Var).c;
                                    }
                                    if (str7 == null) {
                                    }
                                    z6 = wjq0Var instanceof djq0;
                                    int i72 = 17;
                                    if (!z6) {
                                    }
                                    i5 = i72;
                                    z7 = wjq0Var instanceof vjq0;
                                    if (z7) {
                                    }
                                    z8 = z9;
                                    if (vm01Var == null) {
                                    }
                                    hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant3, i6, h, r26, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                                    z = z5;
                                }
                                ytbVar = null;
                                if (str7 == null) {
                                }
                                z6 = wjq0Var instanceof djq0;
                                int i722 = 17;
                                if (!z6) {
                                }
                                i5 = i722;
                                z7 = wjq0Var instanceof vjq0;
                                if (z7) {
                                }
                                z8 = z9;
                                if (vm01Var == null) {
                                }
                                hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant3, i6, h, r26, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                                z = z5;
                            } else {
                                String str12 = ((njq0) wjq0Var).a.d;
                                if (str12 != null) {
                                    str7 = xi91.c(str12);
                                    ytbVar = null;
                                    ?? constant4 = str7 == null ? new Text.Constant(str7) : ytbVar;
                                    z6 = wjq0Var instanceof djq0;
                                    int i7222 = 17;
                                    if (!z6) {
                                        if (z12) {
                                            cjq0 cjq0Var3 = (cjq0) wjq0Var;
                                            bjq0 bjq0Var3 = cjq0Var3.e;
                                            if (bjq0Var3 == null || (str9 = bjq0Var3.d) == null) {
                                                str9 = cjq0Var3.c;
                                            }
                                            if (str9 != null && !evu0.J(str9)) {
                                                i7222 = 8388611;
                                            }
                                        } else {
                                            if (!(wjq0Var instanceof ajq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof jjq0) && !(wjq0Var instanceof ljq0) && !z11 && !(wjq0Var instanceof pjq0) && !(wjq0Var instanceof rjq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof ujq0) && !(wjq0Var instanceof vjq0) && !(wjq0Var instanceof ojq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0)) {
                                                w511.b();
                                                return ytbVar;
                                            }
                                            i5 = 3;
                                            z7 = wjq0Var instanceof vjq0;
                                            if (z7) {
                                                z9 = ((vjq0) wjq0Var).a.e;
                                            } else if (wjq0Var instanceof ujq0) {
                                                z9 = ((ujq0) wjq0Var).a.e;
                                            } else if (wjq0Var instanceof jjq0) {
                                                z9 = ((jjq0) wjq0Var).c.d;
                                            } else if (wjq0Var instanceof ajq0) {
                                                z9 = ((ajq0) wjq0Var).c.e;
                                            } else {
                                                if (!(wjq0Var instanceof sjq0) && !z11 && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !z6 && !z12 && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0)) {
                                                    w511.b();
                                                    return ytbVar;
                                                }
                                                z8 = z5 ? 1 : 0;
                                                if (vm01Var == null) {
                                                    if (wjq0Var instanceof jjq0) {
                                                        v24 v24Var = ((jjq0) wjq0Var).c.f;
                                                        obj2 = f(vm01Var, (v24Var == null || !v24Var.a) ? z5 ? 1 : 0 : true, z10);
                                                    } else if (wjq0Var instanceof ujq0) {
                                                        v24 v24Var2 = ((ujq0) wjq0Var).a.b;
                                                        obj2 = f(vm01Var, (v24Var2 == null || !v24Var2.a) ? z5 ? 1 : 0 : true, z10);
                                                    } else {
                                                        if (!(wjq0Var instanceof ajq0) && !z7 && !(wjq0Var instanceof sjq0) && !z11 && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !z6 && !z12 && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0)) {
                                                            w511.b();
                                                            return ytbVar;
                                                        }
                                                        obj2 = ytbVar;
                                                    }
                                                    r31 = obj2;
                                                } else {
                                                    r31 = ytbVar;
                                                }
                                                hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant3, i6, h, constant4, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                                                z = z5;
                                            }
                                            z8 = z9;
                                            if (vm01Var == null) {
                                            }
                                            hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant3, i6, h, constant4, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                                            z = z5;
                                        }
                                    }
                                    i5 = i7222;
                                    z7 = wjq0Var instanceof vjq0;
                                    if (z7) {
                                    }
                                    z8 = z9;
                                    if (vm01Var == null) {
                                    }
                                    hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant3, i6, h, constant4, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                                    z = z5;
                                }
                            }
                            str7 = null;
                            ytbVar = null;
                            if (str7 == null) {
                            }
                            z6 = wjq0Var instanceof djq0;
                            int i72222 = 17;
                            if (!z6) {
                            }
                            i5 = i72222;
                            z7 = wjq0Var instanceof vjq0;
                            if (z7) {
                            }
                            z8 = z9;
                            if (vm01Var == null) {
                            }
                            hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant3, i6, h, constant4, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                            z = z5;
                        } else if (!(wjq0Var instanceof tjq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0)) {
                            w511.b();
                            return null;
                        }
                    }
                    num2 = null;
                    if (!z11) {
                    }
                    Text.Constant constant32 = i4;
                    boolean z122 = wjq0Var instanceof cjq0;
                    if (!z122) {
                    }
                    Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_accessibility_edit_recipient);
                    if (z11) {
                    }
                    str7 = null;
                    ytbVar = null;
                    if (str7 == null) {
                    }
                    z6 = wjq0Var instanceof djq0;
                    int i722222 = 17;
                    if (!z6) {
                    }
                    i5 = i722222;
                    z7 = wjq0Var instanceof vjq0;
                    if (z7) {
                    }
                    z8 = z9;
                    if (vm01Var == null) {
                    }
                    hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType, num, num2, null, null, constant32, i6, h2, constant4, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                    z = z5;
                }
            } else {
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                if (wjq0Var instanceof vjq0) {
                    nbvVar = ((vjq0) wjq0Var).a.f;
                } else if (wjq0Var instanceof ujq0) {
                    nbvVar = ((ujq0) wjq0Var).a.f;
                } else if (wjq0Var instanceof sjq0) {
                    RequisitesTarget target2 = ((sjq0) wjq0Var).getTarget();
                    if (target2 == null || (image = target2.getImage()) == null || (nbvVar = e(image, txg0.ybsdk_ic_bank_placeholder_without_background)) == null) {
                        nbvVar = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                    }
                } else if (wjq0Var instanceof jjq0) {
                    nbvVar = ((jjq0) wjq0Var).c.e;
                } else if (wjq0Var instanceof ajq0) {
                    nbvVar = ((ajq0) wjq0Var).c.f;
                } else if (wjq0Var instanceof ljq0) {
                    ThemedImageUrlEntity logo = ((ljq0) wjq0Var).b.getLogo();
                    if (logo == null || (nbvVar = e(logo, myg0.ybsdk_ic_mobile_provider_placeholder)) == null) {
                        nbvVar = new nbv(myg0.ybsdk_ic_mobile_provider_placeholder, null);
                    }
                } else if (wjq0Var instanceof ijq0) {
                    ThemedImageUrlEntity logo2 = ((ijq0) wjq0Var).b.getLogo();
                    if (logo2 == null || (nbvVar = e(logo2, myg0.ybsdk_ic_internet_provider_placeholder)) == null) {
                        nbvVar = new nbv(myg0.ybsdk_ic_internet_provider_placeholder, null);
                    }
                } else if (wjq0Var instanceof tjq0) {
                    nbvVar = e(((tjq0) wjq0Var).f, txg0.ybsdk_ic_bank_placeholder_without_background);
                    if (nbvVar == null) {
                        nbvVar = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                    }
                } else if (wjq0Var instanceof djq0) {
                    nbvVar = e(((djq0) wjq0Var).d, txg0.ybsdk_ic_bank_placeholder_without_background);
                    if (nbvVar == null) {
                        nbvVar = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                    }
                } else if (wjq0Var instanceof cjq0) {
                    cjq0 cjq0Var4 = (cjq0) wjq0Var;
                    bjq0 bjq0Var4 = cjq0Var4.e;
                    if (bjq0Var4 == null || (themedImageUrlEntity = bjq0Var4.f) == null) {
                        themedImageUrlEntity = cjq0Var4.d;
                    }
                    nbvVar = e(themedImageUrlEntity, txg0.ybsdk_ic_bank_placeholder_without_background);
                    if (nbvVar == null) {
                        nbvVar = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                    }
                } else if (wjq0Var instanceof hjq0) {
                    nbvVar = e(((hjq0) wjq0Var).f, txg0.ybsdk_ic_bank_placeholder_without_background);
                    if (nbvVar == null) {
                        nbvVar = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                    }
                } else if (wjq0Var instanceof gjq0) {
                    ThemedImageUrlEntity themedImageUrlEntity3 = ((gjq0) wjq0Var).m;
                    if (themedImageUrlEntity3 == null || (nbvVar = e(themedImageUrlEntity3, txg0.ybsdk_ic_bank_placeholder_without_background)) == null) {
                        nbvVar = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                    }
                } else {
                    if (!(wjq0Var instanceof kjq0)) {
                        w511.b();
                        return null;
                    }
                    ThemedImageUrlEntity themedImageUrlEntity4 = ((kjq0) wjq0Var).d;
                    if (themedImageUrlEntity4 == null || (nbvVar = e(themedImageUrlEntity4, txg0.ybsdk_ic_bank_placeholder_without_background)) == null) {
                        nbvVar = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                    }
                }
            }
            rbvVar = nbvVar;
            z5 = z4;
            if (z11) {
            }
            valueOf = Integer.valueOf(nyg0.ybsdk_circle_button_background);
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.FIT_CENTER;
            if (z11) {
            }
            num = null;
            valueOf2 = Integer.valueOf(txg0.ybsdk_ic_arrow_short_bottom);
            transferDeeplink = wjq0Var.b().f;
            if (!jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE)) {
                if (transferDeeplink.equals(TransferDeeplink.AllTargets.INSTANCE)) {
                }
                if (wjq0Var instanceof ajq0) {
                }
                num2 = valueOf2;
                if (!z11) {
                }
                Text.Constant constant322 = i4;
                boolean z1222 = wjq0Var instanceof cjq0;
                if (!z1222) {
                }
                Text.Resource h22 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_accessibility_edit_recipient);
                if (z11) {
                }
                str7 = null;
                ytbVar = null;
                if (str7 == null) {
                }
                z6 = wjq0Var instanceof djq0;
                int i7222222 = 17;
                if (!z6) {
                }
                i5 = i7222222;
                z7 = wjq0Var instanceof vjq0;
                if (z7) {
                }
                z8 = z9;
                if (vm01Var == null) {
                }
                hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType2, num, num2, null, null, constant322, i6, h22, constant4, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
                z = z5;
            }
            num2 = null;
            if (!z11) {
            }
            Text.Constant constant3222 = i4;
            boolean z12222 = wjq0Var instanceof cjq0;
            if (!z12222) {
            }
            Text.Resource h222 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_accessibility_edit_recipient);
            if (z11) {
            }
            str7 = null;
            ytbVar = null;
            if (str7 == null) {
            }
            z6 = wjq0Var instanceof djq0;
            int i72222222 = 17;
            if (!z6) {
            }
            i5 = i72222222;
            z7 = wjq0Var instanceof vjq0;
            if (z7) {
            }
            z8 = z9;
            if (vm01Var == null) {
            }
            hzt0Var = new hzt0(new gzt0(rbvVar, valueOf, scaleType2, num, num2, null, null, constant3222, i6, h222, constant4, i5, false, z8, z10, r31, 1056768), d == null ? nx11.b(d) : ytbVar);
            z = z5;
        } else {
            ytbVar = null;
            z = 0;
        }
        List list3 = ak1Var.f;
        String str13 = ak1Var.k;
        if (hzt0Var != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list3) {
                if (!jl40.l(((eh01) obj3).a, wjq0Var.b().a)) {
                    arrayList.add(obj3);
                }
            }
            list3 = arrayList;
        }
        if (list3.isEmpty()) {
            ytbVar2 = ytbVar;
        } else {
            List<eh01> list4 = list3;
            ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
            for (eh01 eh01Var : list4) {
                String str14 = eh01Var.a;
                rbv f = job1.f(eh01Var.d, new ri01(15));
                if (f == null) {
                    f = new nbv(txg0.ybsdk_ic_yb_placeholder, ytbVar);
                }
                rbv rbvVar2 = f;
                Text.Constant i8 = g8e.i(Text.Companion, eh01Var.b);
                boolean z13 = eh01Var.e;
                String str15 = eh01Var.c;
                arrayList2.add(new otb(str14, rbvVar2, i8, z13, str15 != null ? new Text.Constant(str15) : null));
                ytbVar = null;
            }
            ytbVar2 = new ytb(new wtb(arrayList2));
        }
        ArrayList arrayList3 = ytbVar2 != null ? ytbVar2.a.a : null;
        boolean z14 = (arrayList3 == null || arrayList3.isEmpty()) ? true : z;
        sj01[] sj01VarArr = new sj01[2];
        sj01VarArr[z] = ytbVar2;
        sj01VarArr[1] = hzt0Var;
        Pair pair = new Pair(j73.A(sj01VarArr), Boolean.valueOf(!z14));
        List list5 = (List) pair.getFirst();
        boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
        String str16 = wk01Var.r;
        Text.Constant i9 = str16 != null ? g8e.i(Text.Companion, str16) : null;
        Text.Constant i10 = g8e.i(Text.Companion, ak1Var.c);
        String str17 = ak1Var.d;
        Text constant5 = str17 != null ? new Text.Constant(str17) : Text.Empty.INSTANCE;
        rbv f2 = job1.f(ak1Var.e, new ri01(14));
        if (f2 == null) {
            f2 = new nbv(vxg0.ybsdk_account_placeholder_gray, null);
            if (wk01Var.a == TransferScenario.TIPS) {
                f2 = null;
            }
        }
        eu01 eu01Var = new eu01(i9, wk01Var.o, f2, i10, constant5, (rtz0) null, 96);
        BigDecimal bigDecimal2 = wk01Var.d;
        String b2 = this.b.b(wk01Var.c);
        String str18 = b2 == null ? "" : b2;
        String str19 = wk01Var.e;
        vg6 vg6Var = wk01Var.h;
        boolean l = jl40.l(vg6Var, wfz.y);
        Context context = this.a;
        if (l) {
            rr51 c = c(wk01Var.q);
            if (c != null) {
                fh6Var = new dh6(c);
                bigDecimal = bigDecimal2;
                str = str19;
                str2 = "";
                hh6Var = fh6Var;
            } else {
                bigDecimal = bigDecimal2;
                str = str19;
                str2 = "";
                hh6Var = null;
            }
        } else {
            if (vg6Var instanceof tg6) {
                tg6 tg6Var = (tg6) vg6Var;
                BottomSheetState$SelectAccount$Type bottomSheetState$SelectAccount$Type = tg6Var.x;
                int i11 = xl01.a[bottomSheetState$SelectAccount$Type.ordinal()];
                if (i11 == 1) {
                    bigDecimal = bigDecimal2;
                    str = str19;
                    str2 = "";
                    cf6 cf6Var = wk01Var.f;
                    list = cf6Var != null ? cf6Var.a() : null;
                } else if (i11 == 2) {
                    List list6 = wk01Var.m;
                    bigDecimal = bigDecimal2;
                    str = str19;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list6, 10));
                    Iterator it = list6.iterator();
                    while (it.hasNext()) {
                        ak1 ak1Var2 = (ak1) it.next();
                        arrayList4.add(new uf6(new edq0(new sl(ak1Var2.a, ak1Var2.c, ak1Var2.g, com.ybsdk.feature.transfer.version2.api.mappers.a.j(ak1Var2.e), null, ak1Var2.l, ak1Var2.m), true)));
                        it = it;
                        str10 = str10;
                    }
                    str2 = str10;
                    list = uab1.d(arrayList4);
                } else {
                    bigDecimal = bigDecimal2;
                    str = str19;
                    str2 = "";
                    w511.b();
                }
                sl slVar = tg6Var.a;
                int[] iArr = xl01.a;
                int i12 = iArr[bottomSheetState$SelectAccount$Type.ordinal()];
                if (i12 == 1) {
                    wjq0 wjq0Var2 = wk01Var.i;
                    if (wjq0Var2 instanceof ujq0) {
                        mfq0Var = ((ujq0) wjq0Var2).a;
                    } else if (wjq0Var2 instanceof vjq0) {
                        mfq0Var = ((vjq0) wjq0Var2).a;
                    } else if ((wjq0Var2 instanceof jjq0) || (wjq0Var2 instanceof ajq0) || (wjq0Var2 instanceof pjq0) || (wjq0Var2 instanceof rjq0) || (wjq0Var2 instanceof njq0) || (wjq0Var2 instanceof ljq0) || (wjq0Var2 instanceof ijq0) || (wjq0Var2 instanceof tjq0) || (wjq0Var2 instanceof djq0) || (wjq0Var2 instanceof cjq0) || (wjq0Var2 instanceof ojq0) || (wjq0Var2 instanceof hjq0) || (wjq0Var2 instanceof gjq0) || (wjq0Var2 instanceof kjq0) || wjq0Var2 == null) {
                        mfq0Var = null;
                    } else {
                        w511.b();
                    }
                    i = iArr[bottomSheetState$SelectAccount$Type.ordinal()];
                    if (i != 1) {
                    }
                    if (slVar != null) {
                    }
                    if (mfq0Var != null) {
                    }
                    xf6Var = null;
                    if (xf6Var == null) {
                    }
                    if (list2 == null) {
                    }
                    List<xf6> list7 = list2;
                    ArrayList arrayList5 = new ArrayList(tcc.n(list7, 10));
                    while (r4.hasNext()) {
                    }
                    String str20 = tg6Var.b;
                    if (str20 == null) {
                    }
                    String str21 = tg6Var.c;
                    pdq0 pdq0Var = new pdq0(arrayList5, r22, str21 == null ? g8e.i(Text.Companion, str21) : null, null, null, 48);
                    rr51 rr51Var = tg6Var.w;
                    i2 = xl01.a[tg6Var.x.ordinal()];
                    if (i2 != 1) {
                    }
                    fh6Var = new fh6(pdq0Var, rr51Var, bottomSheetViewState$SelectAccount$Type);
                    hh6Var = fh6Var;
                } else if (i12 == 2) {
                    mfq0Var = zk01.g(wk01Var.g);
                    i = iArr[bottomSheetState$SelectAccount$Type.ordinal()];
                    if (i != 1) {
                        z2 = z;
                    } else if (i == 2) {
                        z2 = true;
                    } else {
                        w511.b();
                    }
                    if (slVar != null) {
                        list2 = list;
                        z3 = z2;
                    } else if (list != null) {
                        Iterator it2 = list.iterator();
                        List list8 = list;
                        while (true) {
                            if (!it2.hasNext()) {
                                list2 = list8;
                                z3 = z2;
                                xf6Var4 = 0;
                                break;
                            }
                            xf6Var4 = it2.next();
                            list2 = list8;
                            z3 = z2;
                            if (((xf6) xf6Var4).d(slVar.a)) {
                                break;
                            }
                            list8 = list2;
                            z2 = z3;
                        }
                        xf6Var = xf6Var4;
                    } else {
                        list2 = list;
                        z3 = z2;
                        xf6Var = null;
                    }
                    if (mfq0Var != null || list2 == null) {
                        xf6Var = null;
                    } else {
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                xf6Var3 = 0;
                                break;
                            }
                            xf6Var3 = it3.next();
                            if (((xf6) xf6Var3).d(mfq0Var.a)) {
                                break;
                            }
                        }
                        xf6Var = xf6Var3;
                    }
                    if (xf6Var == null) {
                        if (list2 != null) {
                            Iterator it4 = list2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    xf6Var2 = 0;
                                    break;
                                }
                                xf6Var2 = it4.next();
                                if (((xf6) xf6Var2).b() && z3) {
                                    break;
                                }
                            }
                            xf6Var = xf6Var2;
                        } else {
                            xf6Var = null;
                        }
                    }
                    if (list2 == null) {
                        list2 = EmptyList.a;
                    }
                    List<xf6> list72 = list2;
                    ArrayList arrayList52 = new ArrayList(tcc.n(list72, 10));
                    for (xf6 xf6Var5 : list72) {
                        arrayList52.add(xf6Var5.c(context, jl40.l(xf6Var5, xf6Var)));
                    }
                    String str202 = tg6Var.b;
                    Text.Constant i13 = str202 == null ? g8e.i(Text.Companion, str202) : null;
                    String str212 = tg6Var.c;
                    pdq0 pdq0Var2 = new pdq0(arrayList52, i13, str212 == null ? g8e.i(Text.Companion, str212) : null, null, null, 48);
                    rr51 rr51Var2 = tg6Var.w;
                    i2 = xl01.a[tg6Var.x.ordinal()];
                    if (i2 != 1) {
                        bottomSheetViewState$SelectAccount$Type = BottomSheetViewState$SelectAccount$Type.SUBJECT;
                    } else if (i2 == 2) {
                        bottomSheetViewState$SelectAccount$Type = BottomSheetViewState$SelectAccount$Type.MAIN;
                    } else {
                        w511.b();
                    }
                    fh6Var = new fh6(pdq0Var2, rr51Var2, bottomSheetViewState$SelectAccount$Type);
                    hh6Var = fh6Var;
                } else {
                    w511.b();
                }
            } else {
                bigDecimal = bigDecimal2;
                str = str19;
                str2 = "";
                if (vg6Var != null) {
                    w511.b();
                }
            }
            hh6Var = null;
        }
        vnq vnqVar = unqVar != null ? new vnq(new Text.Constant(unqVar.a), unqVar.b) : null;
        boolean z15 = wjq0Var instanceof cjq0;
        if (z15) {
            String str22 = wk01Var.G;
            if (str22 != null) {
                str13 = str22;
            }
            if (str13 != null) {
                constant = new Text.Constant(str13);
                constant2 = constant;
            }
            constant2 = null;
        } else {
            if (str13 != null) {
                constant = new Text.Constant(str13);
                constant2 = constant;
            }
            constant2 = null;
        }
        String str23 = ak1Var.o;
        Text.Constant constant6 = str23 != null ? new Text.Constant(str23) : null;
        boolean z16 = (wjq0Var == null || (b = wjq0Var.b()) == null || !b.g) ? z : true;
        uvz0 d3 = d(u031Var);
        ActionButtonEntity actionButtonEntity = wk01Var.D;
        YbButtonView.a aVar = actionButtonEntity != null ? new YbButtonView.a(actionButtonEntity.getText(), actionButtonEntity.getSubtitle(), null, null, null, null, null, false, u031Var instanceof p031, null, 3068) : null;
        boolean z17 = wk01Var.x;
        boolean z18 = wjq0Var instanceof gjq0;
        if (!z18) {
            List list9 = ak1Var.i;
            int size = list9.size();
            List<y4v0> list10 = list9;
            ArrayList arrayList6 = new ArrayList(tcc.n(list10, 10));
            for (y4v0 y4v0Var : list10) {
                MoneyEntity moneyEntity = y4v0Var.a;
                int i14 = xl01.b[y4v0Var.c.ordinal()];
                if (i14 != 1) {
                    i3 = 2;
                    if (i14 != 2) {
                        w511.b();
                        return null;
                    }
                    suggestView$State$Behaviour = SuggestView$State$Behaviour.REPLACE;
                } else {
                    i3 = 2;
                    suggestView$State$Behaviour = SuggestView$State$Behaviour.PLUS;
                }
                arrayList6.add(new u9v0(moneyEntity, y4v0Var.b, suggestView$State$Behaviour, size != i3 ? size != 3 ? SuggestView$State$WidthType.WRAP : SuggestView$State$WidthType.TRIPLE : SuggestView$State$WidthType.DOUBLE, true));
            }
            ubv0 ubv0Var2 = new ubv0(arrayList6);
            if (size != 0) {
                ubv0Var = ubv0Var2;
                x49 a = a(u031Var);
                boolean z19 = wk01Var.z;
                boolean z20 = wk01Var.B;
                boolean z21 = wk01Var.A;
                gjq0Var = !z18 ? (gjq0) wjq0Var : null;
                if (gjq0Var != null) {
                    dcfVar = null;
                } else {
                    String str24 = gjq0Var.f;
                    String b3 = b(str24);
                    String str25 = gjq0Var.i;
                    if (str25 == null) {
                        ejq0 ejq0Var = gjq0Var.h;
                        if (ejq0Var != null) {
                            String b4 = b(gjq0Var.d);
                            String b5 = b(str24);
                            StringBuilder v = b64.v("1 ", b4, " = ", ejq0Var.a, " ");
                            v.append(b5);
                            str5 = v.toString();
                        } else {
                            str5 = null;
                        }
                        str3 = str5 == null ? str2 : str5;
                    } else {
                        str3 = str25;
                    }
                    String str26 = gjq0Var.j;
                    if (str26 != null) {
                        String str27 = gjq0Var.f;
                        str4 = cvu0.v(str26, "%s", g8e.p(evu0.k0(w530.a(this.b, gjq0Var.e, str27, false, tm60.a, false, 20)).toString(), " ", str27), z);
                    } else {
                        str4 = null;
                    }
                    dcfVar = new dcf(gjq0Var.e, g8e.i(Text.Companion, b3), new Text.Constant(str3), str4);
                }
                int i15 = !z15 ? ung0.ybColor_textIcon_secondary : ung0.ybColor_textIcon_primary;
                int i16 = !z15 ? 16 : 0;
                if (z15) {
                    Resources resources = context.getResources();
                    bk01Var = new bk01(m810.b(resources.getDimension(kwg0.ybsdk_transfer_main_info_autosize_min_text_size) / Resources.getSystem().getDisplayMetrics().scaledDensity), m810.b(resources.getDimension(kwg0.ybsdk_transfer_main_info_autosize_max_text_size) / Resources.getSystem().getDisplayMetrics().scaledDensity), m810.b(resources.getDimension(kwg0.ybsdk_transfer_main_info_autosize_step) / Resources.getSystem().getDisplayMetrics().scaledDensity));
                } else {
                    bk01Var = null;
                }
                return new vl01(eu01Var, bigDecimal, str18, str, list5, booleanValue, hh6Var, vnqVar, constant2, constant6, z16, d3, aVar, z17, ubv0Var, a, z19, z21, z20, dcfVar, i15, i16, bk01Var);
            }
        }
        ubv0Var = null;
        x49 a2 = a(u031Var);
        boolean z192 = wk01Var.z;
        boolean z202 = wk01Var.B;
        boolean z212 = wk01Var.A;
        if (!z18) {
        }
        if (gjq0Var != null) {
        }
        int i152 = !z15 ? ung0.ybColor_textIcon_secondary : ung0.ybColor_textIcon_primary;
        if (!z15) {
        }
        if (z15) {
        }
        return new vl01(eu01Var, bigDecimal, str18, str, list5, booleanValue, hh6Var, vnqVar, constant2, constant6, z16, d3, aVar, z17, ubv0Var, a2, z192, z212, z202, dcfVar, i152, i16, bk01Var);
    }
}
