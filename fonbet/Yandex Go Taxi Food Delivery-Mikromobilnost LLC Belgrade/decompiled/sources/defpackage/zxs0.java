package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.ImageCaptureException;
import androidx.media3.exoplayer.mediacodec.f;
import com.yandex.go.plus.experiment.CashbackExperiment;
import com.yandex.go.routestats.BackendFormat;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.tariffs.SummaryHighTariffSelectorExperiment;
import com.yandex.go.taxi.experiments.AlternativeOverride;
import com.yandex.go.taxi.experiments.InactiveTariffView;
import com.yandex.go.taxi.experiments.OverrideInactiveTariffsExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.ui.selector.model.WideTariffAppearanceExperiment;
import com.yandex.go.zone.dto.objects.BrandingValues;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.SurgeIconStyle;
import com.yandex.go.zone.dto.objects.TariffBranding;
import com.yandex.go.zone.dto.objects.TariffModifierInfo;
import com.yandex.go.zone.dto.objects.VerticalMode;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.domain.reactions.ReactionCodes;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.FullReactionInfo;
import defpackage.kiv0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.b;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;

/* loaded from: classes14.dex */
public final class zxs0 implements u8v, myt0, pb10, g070 {
    public Object a;
    public Object b;

    public /* synthetic */ zxs0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.pb10
    public void A(ob10 ob10Var, Handler handler) {
        ((MediaCodec) this.a).setOnFrameRenderedListener(new jb3(this, ob10Var, 3), handler);
    }

    @Override // defpackage.pb10
    public void a(int i, int i2, long j, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.pb10
    public void b(int i) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.pb10
    public void c(int i, long j) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, j);
    }

    public void d(l980 l980Var, hxx0 hxx0Var, int i, int i2) {
        String i3;
        j6z0 j6z0Var = hxx0Var.a;
        i6z0 i6z0Var = j6z0Var.a;
        int i4 = i6z0Var.b;
        int i5 = i6z0Var.c;
        if (i5 <= 0 && i4 <= 0) {
            d980 d980Var = (d980) l980Var;
            d980Var.d(((avj0) d980Var.f).h(i2));
            return;
        }
        zuj0 zuj0Var = (zuj0) this.a;
        nw8 nw8Var = (nw8) this.b;
        zuj0 zuj0Var2 = nw8Var.a;
        if (j6z0Var.c) {
            i6z0 i6z0Var2 = j6z0Var.b;
            int i6 = i6z0Var2.b;
            int i7 = i6z0Var2.c;
            if (i5 == 0 && i7 == 0) {
                StringBuilder sb = new StringBuilder();
                if (i4 > 0) {
                    sb.append(i4);
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i8 = kyh0.common_hour_sign;
                if (i6 > 0) {
                    sb3.append(i6);
                    if (i8 != 0) {
                        sb3.append((char) 160);
                        sb3.append(((avj0) zuj0Var2).h(i8));
                    }
                }
                avj0 avj0Var = (avj0) zuj0Var2;
                i3 = avj0Var.i(yzh0.order_screen_time_left_pattern, sb2, sb3.toString());
            } else if (i4 == i6) {
                cjw0 cjw0Var = new cjw0(nw8Var, i6z0Var);
                cjw0Var.D();
                cjw0Var.E(false);
                String sb4 = ((StringBuilder) cjw0Var.b).toString();
                StringBuilder sb5 = new StringBuilder();
                int length = sb5.length();
                if (length > 0 && sb5.charAt(length - 1) != '~') {
                    sb5.append(" ");
                }
                int i9 = kyh0.common_minutes_sign;
                if (i7 > 0) {
                    sb5.append(i7);
                    if (i9 != 0) {
                        sb5.append((char) 160);
                        sb5.append(((avj0) zuj0Var2).h(i9));
                    }
                }
                avj0 avj0Var2 = (avj0) zuj0Var2;
                i3 = avj0Var2.i(yzh0.order_screen_time_left_pattern, sb4, sb5.toString());
            } else {
                cjw0 cjw0Var2 = new cjw0(nw8Var, i6z0Var);
                cjw0Var2.D();
                cjw0Var2.E(true);
                String sb6 = ((StringBuilder) cjw0Var2.b).toString();
                cjw0 cjw0Var3 = new cjw0(nw8Var, i6z0Var2);
                cjw0Var3.D();
                cjw0Var3.E(true);
                avj0 avj0Var3 = (avj0) zuj0Var2;
                i3 = avj0Var3.i(yzh0.order_screen_time_left_pattern, sb6, ((StringBuilder) cjw0Var3.b).toString());
            }
        } else {
            cjw0 cjw0Var4 = new cjw0(nw8Var, i6z0Var);
            cjw0Var4.D();
            cjw0Var4.E(true);
            i3 = ((StringBuilder) cjw0Var4.b).toString();
        }
        d980 d980Var2 = (d980) l980Var;
        d980Var2.d(((avj0) zuj0Var).i(i, i3));
    }

    @Override // defpackage.pb10
    public void e() {
        ((MediaCodec) this.a).detachOutputSurface();
    }

    @Override // defpackage.pb10
    public void f(int i, ucf ucfVar, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, ucfVar.i, j, i2);
    }

    @Override // defpackage.pb10
    public void flush() {
        ((MediaCodec) this.a).flush();
    }

    @Override // defpackage.pb10
    public void g(Surface surface) {
        ((MediaCodec) this.a).setOutputSurface(surface);
    }

    @Override // defpackage.pb10
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.a).getInputBuffer(i);
    }

    @Override // defpackage.pb10
    public PersistableBundle getMetrics() {
        return ((MediaCodec) this.a).getMetrics();
    }

    @Override // defpackage.pb10
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.a).getOutputBuffer(i);
    }

    @Override // defpackage.pb10
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.a).getOutputFormat();
    }

    @Override // defpackage.myt0
    public long h(long j) {
        rnz rnzVar = (rnz) this.a;
        Long l = (Long) rnzVar.c(j);
        if (l == null) {
            jyt0 jyt0Var = (jyt0) this.b;
            long j2 = jyt0Var.a;
            jyt0Var.a = 1 + j2;
            l = Long.valueOf(j2);
            rnzVar.h(j, l);
        }
        return l.longValue();
    }

    @Override // defpackage.u8v
    public void j(ImageCaptureException imageCaptureException) {
        jgz jgzVar = jgz.a;
        jgz.d(imageCaptureException, "Error while capture image", new Object[0]);
    }

    @Override // defpackage.u8v
    public void k(reu reuVar) {
        File file = (File) this.a;
        ((me5) this.b).invoke(g3r.c(file));
        file.delete();
    }

    @Override // defpackage.g070
    public void l(ServerMessageRef serverMessageRef, long j, ArrayList arrayList, UserReaction[] userReactionArr) {
        Object obj;
        dlz0 dlz0Var = (dlz0) this.b;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            FullReactionInfo fullReactionInfo = (FullReactionInfo) obj;
            if (fullReactionInfo.getType() == ReactionCodes.ThumbsUp.getCode() && fullReactionInfo.isChecked()) {
                break;
            }
        }
        FullReactionInfo fullReactionInfo2 = (FullReactionInfo) obj;
        ((bbi0) ((m8g) ((s020) this.a)).w0.get()).a(new kv10(serverMessageRef, ReactionCodes.ThumbsUp.getCode(), fullReactionInfo2 != null ? 1 : 2, cha1.e(arrayList, fullReactionInfo2 != null ? 0 : ReactionCodes.ThumbsUp.getCode(), userReactionArr, j)));
        hai0 hai0Var = dlz0Var.z;
        if (hai0Var != null) {
            hai0Var.close();
        }
        dlz0Var.z = null;
        dlz0Var.h();
    }

    public void o(boolean z) {
        cq80 cq80Var = (cq80) this.b;
        View view = cq80Var.d;
        BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) this.a;
        view.setVisibility(bottomEdgeButtonLayout.getVisibility() == 0 ? 0 : 8);
        if (bottomEdgeButtonLayout.getVisibility() == 0) {
            View view2 = cq80Var.d;
            if (z) {
                cma1.b(1.0f, view2);
            } else {
                cma1.b(0.0f, view2);
            }
        }
    }

    public u2 p() {
        return ((p4x0) this.a).c.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:363:0x0b5d, code lost:
    
        if (r7 == 0) goto L650;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07a6 A[EDGE_INSN: B:180:0x07a6->B:181:0x07a6 BREAK  A[LOOP:5: B:161:0x074d->B:462:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0936 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0c30 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:462:? A[LOOP:5: B:161:0x074d->B:462:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object[], mi31[]] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object[], mi31[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList q(lrx0 lrx0Var, String str) {
        List list;
        int i;
        boolean z;
        ArrayList arrayList;
        List list2;
        int i2;
        List list3;
        int i3;
        oeq0 neq0Var;
        boolean z2;
        String a;
        boolean z3;
        boolean z4;
        EmptyList emptyList;
        bdc bdcVar;
        Iterator it;
        Object obj;
        ServiceLevel.Branding branding;
        boolean z5;
        int i4;
        boolean z6;
        String str2;
        CashbackBadgeStyle n;
        CashbackBadgeStyle cashbackBadgeStyle;
        boolean z7;
        String str3;
        CashbackBadgeStyle cashbackBadgeStyle2;
        String str4;
        String str5;
        Map map;
        boolean z8;
        mr31 mr31Var;
        mr31 mr31Var2;
        String str6;
        ?? a2;
        ?? a3;
        String str7;
        List list4;
        boolean z9;
        elx0 a4;
        nco ncoVar;
        String str8;
        Object obj2;
        String str9;
        v580 v580Var;
        List list5;
        Object obj3;
        ht10 ht10Var;
        fx1 fx1Var;
        Object obj4;
        pex0 a5;
        Map map2;
        Object obj5;
        Map f;
        sj6 sj6Var;
        BrandingValues brandingValues;
        String a6;
        Map map3;
        AlternativeOverride alternativeOverride;
        SummaryUiDelegate$TariffCardStyle summaryUiDelegate$TariffCardStyle;
        kdc kdcVar;
        ena1 nn0Var;
        ena1 ena1Var;
        kdc kdcVar2;
        npw0 npw0Var;
        boolean z10;
        StringBuilder sb;
        t0f0 t0f0Var;
        t0f0 t0f0Var2;
        pju pjuVar;
        SurgeIconStyle surgeIconStyle;
        pju pjuVar2;
        wlq0 wlq0Var;
        v0f0 v0f0Var;
        int i5;
        List list6;
        Object obj6;
        float f2;
        Iterator it2;
        int i6;
        int i7;
        pex0 pex0Var;
        Selector selector;
        ListIterator listIterator;
        pex0 pex0Var2;
        Selector selector2;
        zxs0 zxs0Var = this;
        List list7 = lrx0Var.a;
        int i8 = lrx0Var.d;
        int i9 = lrx0Var.c;
        mi31 mi31Var = (mi31) a.S(i9, list7);
        pex0 pex0Var3 = mi31Var != null ? mi31Var.a : null;
        boolean z11 = (pex0Var3 == null || (pex0Var3.t0.a.isEmpty() && pex0Var3.O == null)) ? false : true;
        boolean z12 = lrx0Var.b != PriceUpdate$PriceLoadingState.LOADED;
        boolean z13 = lrx0Var.e;
        EmptyList emptyList2 = EmptyList.a;
        if (pex0Var3 == null || (list = pex0Var3.A0) == null) {
            list = emptyList2;
        }
        qze0 qze0Var = pex0Var3 != null ? pex0Var3.m : null;
        Map map4 = lrx0Var.f;
        String str10 = pex0Var3 != null ? pex0Var3.b : null;
        boolean z14 = i8 != -1;
        List list8 = list7;
        boolean z15 = 0;
        ArrayList arrayList2 = new ArrayList(tcc.n(list8, 10));
        Iterator it3 = list8.iterator();
        int i10 = 0;
        boolean z16 = false;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                scc.m();
                throw null;
            }
            mi31 mi31Var2 = (mi31) next;
            int i12 = i9;
            boolean z17 = i9 == i10 ? true : z15;
            if (z14 && (i10 == i8 || z17)) {
                i = i8;
                z = true;
            } else {
                i = i8;
                z = z15;
            }
            boolean z18 = (z11 || z17 || z || z16) ? z15 : true;
            Iterator it4 = it3;
            pbx0 pbx0Var = (pbx0) zxs0Var.a;
            boolean z19 = z11;
            ndl0 ndl0Var = (ndl0) zxs0Var.b;
            ndl0Var.getClass();
            pex0 pex0Var4 = ((mi31) list7.get(i10)).a;
            k kVar = (k) ((ck31) ndl0Var.b);
            VerticalMode verticalMode = kVar.j().b;
            VerticalMode verticalMode2 = VerticalMode.WITHOUT_SELECTOR;
            boolean z20 = z13;
            leq0 leq0Var = leq0.a;
            if (verticalMode == verticalMode2) {
                String str11 = pex0Var4.b;
                List list9 = kVar.j().a;
                ListIterator listIterator2 = list9.listIterator(list9.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        i5 = -1;
                        break;
                    }
                    mi31 mi31Var3 = (mi31) a.R(((za31) listIterator2.previous()).b);
                    if (mi31Var3 != null && (pex0Var2 = mi31Var3.a) != null && (selector2 = pex0Var2.N) != null) {
                        listIterator = listIterator2;
                        if (selector2.f) {
                            i5 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        listIterator = listIterator2;
                    }
                    listIterator2 = listIterator;
                }
                if (i5 == -1 || i5 == scc.f(kVar.j().a)) {
                    arrayList = arrayList2;
                    list2 = list;
                    list6 = null;
                } else {
                    int i13 = i5 + 1;
                    arrayList = arrayList2;
                    int i14 = i5 + 2;
                    list2 = list;
                    list6 = i14 == list9.size() ? scc.g(ndl0.a(((za31) list9.get(i5)).b), ndl0.a(((za31) list9.get(i13)).b)) : scc.g(ndl0.a(((za31) list9.get(i5)).b), ndl0.a(((za31) list9.get(i13)).b), ndl0.a(((za31) list9.get(i14)).b));
                }
                List list10 = list6;
                if (list10 != null && !list10.isEmpty()) {
                    Iterator it5 = list9.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj6 = null;
                            break;
                        }
                        obj6 = it5.next();
                        if (ndl0.a(((za31) obj6).b).equals(a.P(list6))) {
                            break;
                        }
                    }
                    za31 za31Var = (za31) obj6;
                    if (za31Var != null) {
                        mi31 mi31Var4 = (mi31) a.R(za31Var.b);
                        Float valueOf = (mi31Var4 == null || (pex0Var = mi31Var4.a) == null || (selector = pex0Var.N) == null) ? null : Float.valueOf(selector.g);
                        if (valueOf != null) {
                            f2 = valueOf.floatValue();
                            float f3 = 1.0f - f2;
                            it2 = list6.iterator();
                            i6 = z15;
                            while (true) {
                                if (it2.hasNext()) {
                                    i7 = -1;
                                    break;
                                }
                                if (jl40.l((String) it2.next(), str11)) {
                                    i7 = i6;
                                    break;
                                }
                                i6++;
                            }
                            if (i7 != 1) {
                                neq0Var = new neq0(f3);
                            } else if (i7 == 2) {
                                neq0Var = new neq0(f3 + 1.0f);
                            }
                        }
                    }
                    f2 = 0.0f;
                    float f32 = 1.0f - f2;
                    it2 = list6.iterator();
                    i6 = z15;
                    while (true) {
                        if (it2.hasNext()) {
                        }
                        i6++;
                    }
                    if (i7 != 1) {
                    }
                }
                neq0Var = leq0Var;
            } else {
                arrayList = arrayList2;
                list2 = list;
                ListIterator listIterator3 = list7.listIterator(list7.size());
                while (true) {
                    if (!listIterator3.hasPrevious()) {
                        i2 = -1;
                        break;
                    }
                    if (((mi31) listIterator3.previous()).a.N.f) {
                        i2 = listIterator3.nextIndex();
                        break;
                    }
                }
                if (i2 == -1 || i2 == scc.f(list7)) {
                    list3 = null;
                } else {
                    int i15 = i2 + 1;
                    int i16 = i2 + 2;
                    if (i16 == list7.size()) {
                        ?? r11 = new mi31[2];
                        r11[z15] = list7.get(i2);
                        r11[1] = list7.get(i15);
                        list3 = scc.g(r11);
                    } else {
                        ?? r8 = new mi31[3];
                        r8[z15] = list7.get(i2);
                        r8[1] = list7.get(i15);
                        r8[2] = list7.get(i16);
                        list3 = scc.g(r8);
                    }
                }
                List list11 = list3;
                if (list11 != null && !list11.isEmpty()) {
                    float f4 = 1.0f - ((mi31) a.P(list3)).a.N.g;
                    Iterator it6 = list3.iterator();
                    int i17 = z15;
                    while (true) {
                        if (!it6.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (pex0Var4.J0.a(((mi31) it6.next()).a)) {
                            i3 = i17;
                            break;
                        }
                        i17++;
                    }
                    if (i3 == 1) {
                        neq0Var = new neq0(f4);
                    } else if (i3 == 2) {
                        neq0Var = new neq0(f4 + 1.0f);
                    }
                }
                neq0Var = leq0Var;
            }
            pdc pdcVar = pbx0Var.F;
            bdc bdcVar2 = (bdc) pbx0Var.c;
            k7x0 k7x0Var = pbx0Var.B;
            pex0 pex0Var5 = mi31Var2.a;
            dlx0 dlx0Var = new dlx0();
            String str12 = pex0Var5.b;
            List list12 = list7;
            qze0 qze0Var2 = pex0Var5.m;
            ybo yboVar = pex0Var5.h;
            Selector selector3 = pex0Var5.N;
            List list13 = pex0Var5.S;
            ru.yandex.taxi.tariffs.model.a aVar = pex0Var5.t0;
            wu1 wu1Var = pex0Var5.O;
            boolean z21 = pex0Var5.u;
            dlx0Var.a = str12;
            Map map5 = map4;
            dlx0Var.b = str;
            dlx0Var.c = emptyList2;
            dlx0Var.d = mi31Var2.c();
            dlx0Var.e = z12;
            String str13 = pex0Var5.j;
            String str14 = (String) ((Map) pbx0Var.M.a.getValue()).get(str12);
            if (str14 == null) {
                z2 = z12;
                a = str13;
            } else {
                z2 = z12;
                a = ((m7x0) k7x0Var).a(str14);
            }
            dlx0Var.f = a;
            dlx0Var.h = pex0Var5.u0;
            dlx0Var.i = pex0Var5.g0;
            dlx0Var.t = z17;
            dlx0Var.u = pex0Var5.g();
            dlx0Var.v = z;
            dlx0Var.x = z21;
            dlx0Var.I = neq0Var;
            dlx0Var.J = wu1Var;
            if (z2 || qze0Var2 == null) {
                z3 = z17;
                z4 = z21;
                emptyList = emptyList2;
                bdcVar = bdcVar2;
            } else {
                String str15 = qze0Var2.d;
                String str16 = qze0Var2.a;
                wlq0 wlq0Var2 = qze0Var2.l;
                z3 = z17;
                SummaryUiDelegate$TariffCardStyle c = pbx0Var.J.c();
                z4 = z21;
                if (c == SummaryUiDelegate$TariffCardStyle.WIDE) {
                    summaryUiDelegate$TariffCardStyle = c;
                    WideTariffAppearanceExperiment wideTariffAppearanceExperiment = (WideTariffAppearanceExperiment) ((jbh) pbx0Var.H).c(WideTariffAppearanceExperiment.f).b();
                    if (wideTariffAppearanceExperiment.b && wideTariffAppearanceExperiment.d) {
                        kdcVar = pbx0Var.P;
                        if (!z4 && !qze0Var2.h) {
                            t0f0 o = pbx0Var.o(kdcVar, z15);
                            t0f0Var = pbx0Var.o((bdc) pbx0Var.w, true);
                            emptyList = emptyList2;
                            t0f0Var2 = o;
                        } else if (wlq0Var2 == null) {
                            t0f0 r0f0Var = (qze0Var == null || (wlq0Var = qze0Var.l) == null || (v0f0Var = (v0f0) wlq0Var.c.get(str12)) == null) ? null : new r0f0(v0f0Var.b, v0f0Var.a);
                            if (r0f0Var == null) {
                                r0f0Var = (qze0Var == null || (pjuVar2 = (pju) qze0Var.i.get(str12)) == null) ? null : new s0f0(pjuVar2.b, pjuVar2.c, pjuVar2.a);
                                if (r0f0Var == null) {
                                    v0f0 v0f0Var2 = wlq0Var2.a;
                                    r0f0Var = new r0f0(v0f0Var2.b, v0f0Var2.a);
                                }
                            }
                            t0f0 t0f0Var3 = r0f0Var;
                            v0f0 v0f0Var3 = wlq0Var2.b;
                            t0f0Var = new r0f0(v0f0Var3.b, v0f0Var3.a);
                            t0f0Var2 = t0f0Var3;
                            emptyList = emptyList2;
                        } else {
                            String str17 = qze0Var2 != null ? qze0Var2.j : null;
                            if (str17 != null) {
                                nn0Var = new on0(str17);
                            } else if ((wu1Var instanceof uy1) || (wu1Var instanceof pl2) || (wu1Var instanceof ojc) || (wu1Var instanceof qnx0)) {
                                nn0Var = new nn0(a1h0.ic_cheaper_down);
                            } else {
                                if (!(wu1Var instanceof py1) && !(wu1Var instanceof zo40) && !(wu1Var instanceof ur40) && !(wu1Var instanceof yu1) && !(wu1Var instanceof gid0) && !(wu1Var instanceof jjj0) && !(wu1Var instanceof p8f) && !(wu1Var instanceof u0h) && !(wu1Var instanceof yx00) && !(wu1Var instanceof vmd0) && !(wu1Var instanceof j2d0) && wu1Var != null) {
                                    w511.b();
                                    return null;
                                }
                                ena1Var = null;
                                if (z20 && !(wu1Var instanceof ojc) && pex0Var5.e0.a()) {
                                    ppw0 ppw0Var = pbx0Var.G;
                                    npw0 npw0Var2 = ppw0Var.d;
                                    kdcVar2 = kdcVar;
                                    SummaryStyle summaryStyle = pex0Var5.v0;
                                    if (summaryStyle != null && (surgeIconStyle = summaryStyle.a) != null) {
                                        npw0Var2 = ppw0Var.a(surgeIconStyle, npw0Var2.a);
                                    }
                                    npw0Var = npw0Var2;
                                } else {
                                    kdcVar2 = kdcVar;
                                    npw0Var = null;
                                }
                                z10 = npw0Var == null;
                                sb = new StringBuilder();
                                if (z10) {
                                    emptyList = emptyList2;
                                } else {
                                    emptyList = emptyList2;
                                    sb.append(((avj0) ((zuj0) pbx0Var.b)).h(kyh0.tariff_card_surge_note));
                                    sb.append(Extension.FIX_SPACE);
                                }
                                sb.append(str16);
                                if (str15 != null && str15.length() != 0) {
                                    sb.append(Extension.FIX_SPACE);
                                    sb.append(str15);
                                }
                                String sb2 = sb.toString();
                                t0f0 s0f0Var = (qze0Var != null || (pjuVar = (pju) qze0Var.i.get(str12)) == null) ? null : new s0f0(pjuVar.b, pjuVar.c, pjuVar.a);
                                t0f0 q0f0Var = s0f0Var != null ? new q0f0(ena1Var, null, qze0Var2.a, 0, kdcVar2, null, sb2, 162) : s0f0Var;
                                String str18 = qze0Var2.g;
                                String str19 = str18.length() != 0 ? str16 : str18;
                                if (obx0.a[summaryUiDelegate$TariffCardStyle.ordinal()] == 1) {
                                    str15 = qze0Var2.e;
                                }
                                q0f0 q0f0Var2 = new q0f0(ena1Var, npw0Var, str19, 3, bdcVar2, str15, sb2, 128);
                                bdcVar = bdcVar2;
                                t0f0Var = q0f0Var2;
                                t0f0Var2 = q0f0Var;
                                dlx0Var.k = t0f0Var2;
                                dlx0Var.l = t0f0Var;
                            }
                            ena1Var = nn0Var;
                            if (z20) {
                            }
                            kdcVar2 = kdcVar;
                            npw0Var = null;
                            if (npw0Var == null) {
                            }
                            sb = new StringBuilder();
                            if (z10) {
                            }
                            sb.append(str16);
                            if (str15 != null) {
                                sb.append(Extension.FIX_SPACE);
                                sb.append(str15);
                            }
                            String sb22 = sb.toString();
                            if (qze0Var != null) {
                            }
                            if (s0f0Var != null) {
                            }
                            String str182 = qze0Var2.g;
                            if (str182.length() != 0) {
                            }
                            if (obx0.a[summaryUiDelegate$TariffCardStyle.ordinal()] == 1) {
                            }
                            q0f0 q0f0Var22 = new q0f0(ena1Var, npw0Var, str19, 3, bdcVar2, str15, sb22, 128);
                            bdcVar = bdcVar2;
                            t0f0Var = q0f0Var22;
                            t0f0Var2 = q0f0Var;
                            dlx0Var.k = t0f0Var2;
                            dlx0Var.l = t0f0Var;
                        }
                        bdcVar = bdcVar2;
                        dlx0Var.k = t0f0Var2;
                        dlx0Var.l = t0f0Var;
                    }
                } else {
                    summaryUiDelegate$TariffCardStyle = c;
                }
                kdcVar = bdcVar2;
                if (!z4) {
                }
                if (wlq0Var2 == null) {
                }
            }
            jgv jgvVar = pbx0Var.A;
            TariffBranding a7 = z4 ? null : b.a(pex0Var5, pbx0Var.y);
            if (a7 != null) {
                n7v n7vVar = a7.e;
                n7v n7vVar2 = a7.d;
                if (jgvVar.b(n7vVar2) || jgvVar.b(n7vVar)) {
                    dlx0Var.w = false;
                    dlx0Var.p = jgvVar.a(n7vVar2);
                    dlx0Var.q = jgvVar.a(n7vVar);
                    unx0 unx0Var = pbx0Var.C;
                    List list14 = list13;
                    it = list14.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        ServiceLevel.Branding.Type type = ((ServiceLevel.Branding) obj).c;
                        if (type == ServiceLevel.Branding.Type.CASH_BACK || type == ServiceLevel.Branding.Type.BADGE) {
                            break;
                        }
                    }
                    branding = (ServiceLevel.Branding) obj;
                    if (!(wu1Var instanceof yu1)) {
                        List list15 = aVar.a;
                        if (!(list15 instanceof Collection) || !list15.isEmpty()) {
                            Iterator it7 = list15.iterator();
                            while (it7.hasNext()) {
                                if (((ex1) it7.next()) instanceof xu1) {
                                }
                            }
                        }
                        z5 = false;
                        ServiceLevel.Branding.Type type2 = branding != null ? branding.c : null;
                        i4 = type2 == null ? -1 : obx0.b[type2.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                boolean z22 = z3 && unx0Var.d.a;
                                String str20 = branding.i;
                                if (str20 == null) {
                                    str20 = "";
                                }
                                dlx0Var.z = str20;
                                String str21 = branding.k;
                                dlx0Var.B = (str21 == null || evu0.J(str21)) ? null : ((m7x0) k7x0Var).a(str21);
                                dlx0Var.C = z22;
                                dlx0Var.E = CashbackBadgeStyle.LIGHT_GRADIENT;
                                dlx0Var.F = ((ufu) pdcVar).h(bdcVar, branding.q);
                                dlx0Var.G = false;
                                dlx0Var.H = Float.valueOf(16.0f);
                                dlx0Var.D = CashbackBadgeStyle.LIGHT_GRAY;
                            }
                            str3 = "";
                        } else {
                            wk21 wk21Var = pbx0Var.z;
                            if (z3 && unx0Var.d.a) {
                                CashbackExperiment a8 = ((l) wk21Var).a();
                                a8.getClass();
                                if (d6z.Y(a8, "cashback_tariff_badge_promo_text").length() != 0) {
                                    z6 = true;
                                    ServiceLevel.Branding.Tooltip tooltip = branding.a;
                                    str2 = tooltip == null ? tooltip.a : null;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    n = !z5 ? pbx0.n(branding.t) : null;
                                    CashbackBadgeStyle n2 = pbx0.n(branding.u);
                                    if (!z5) {
                                        n2 = null;
                                    }
                                    if (n == null) {
                                        n = ((l) wk21Var).b();
                                    }
                                    cashbackBadgeStyle = n2;
                                    CashbackBadgeStyle cashbackBadgeStyle3 = n;
                                    if (cashbackBadgeStyle != null) {
                                        l lVar = (l) wk21Var;
                                        z7 = z5;
                                        int i18 = xk21.a[lVar.a().d.a.ordinal()];
                                        str3 = "";
                                        cashbackBadgeStyle2 = i18 != 1 ? i18 != 2 ? i18 != 3 ? CashbackBadgeStyle.DISABLED : CashbackBadgeStyle.DISABLED : CashbackBadgeStyle.LIGHT_GRAY : lVar.b();
                                    } else {
                                        z7 = z5;
                                        str3 = "";
                                        cashbackBadgeStyle2 = cashbackBadgeStyle;
                                    }
                                    String str22 = (z3 && z && !z7) ? null : branding.i;
                                    dlx0Var.y = str2;
                                    dlx0Var.z = str22;
                                    CashbackExperiment a9 = ((l) wk21Var).a();
                                    a9.getClass();
                                    dlx0Var.A = d6z.Y(a9, "cashback_tariff_badge_promo_text");
                                    String str23 = branding.k;
                                    dlx0Var.B = (str23 != null || evu0.J(str23)) ? null : ((m7x0) k7x0Var).a(str23);
                                    dlx0Var.C = z6;
                                    dlx0Var.E = cashbackBadgeStyle3;
                                    dlx0Var.D = cashbackBadgeStyle2;
                                }
                            }
                            z6 = false;
                            ServiceLevel.Branding.Tooltip tooltip2 = branding.a;
                            if (tooltip2 == null) {
                            }
                            if (str2 == null) {
                            }
                            if (!z5) {
                            }
                            CashbackBadgeStyle n22 = pbx0.n(branding.u);
                            if (!z5) {
                            }
                            if (n == null) {
                            }
                            cashbackBadgeStyle = n22;
                            CashbackBadgeStyle cashbackBadgeStyle32 = n;
                            if (cashbackBadgeStyle != null) {
                            }
                            if (z3) {
                            }
                            dlx0Var.y = str2;
                            dlx0Var.z = str22;
                            CashbackExperiment a92 = ((l) wk21Var).a();
                            a92.getClass();
                            dlx0Var.A = d6z.Y(a92, "cashback_tariff_badge_promo_text");
                            String str232 = branding.k;
                            dlx0Var.B = (str232 != null || evu0.J(str232)) ? null : ((m7x0) k7x0Var).a(str232);
                            dlx0Var.C = z6;
                            dlx0Var.E = cashbackBadgeStyle32;
                            dlx0Var.D = cashbackBadgeStyle2;
                        }
                        if (z18) {
                            kip kipVar = pbx0Var.I;
                            qqo qqoVar = kipVar.a;
                            qqo qqoVar2 = kipVar.a;
                            if (((OverrideInactiveTariffsExperiment) qqoVar.b()).getB() && ((OverrideInactiveTariffsExperiment) qqoVar2.b()).getB() && !((OverrideInactiveTariffsExperiment) qqoVar2.b()).c.isEmpty() && str10 != null) {
                                Iterator it8 = aVar.a.iterator();
                                while (it8.hasNext()) {
                                    wu1 wu1Var2 = ((ex1) it8.next()).a().O;
                                    if (wu1Var2 != null && (a6 = wu1Var2.a()) != null && ((OverrideInactiveTariffsExperiment) qqoVar2.b()).getB()) {
                                        Map map6 = (Map) ((OverrideInactiveTariffsExperiment) qqoVar2.b()).c.get(a6);
                                        InactiveTariffView inactiveTariffView = (map6 == null || (map3 = (Map) map6.get(str12)) == null || (alternativeOverride = (AlternativeOverride) map3.get(str10)) == null) ? null : alternativeOverride.a;
                                        if (inactiveTariffView != null) {
                                            fx1Var = new fx1(a6, inactiveTariffView);
                                            if (fx1Var == null) {
                                                break;
                                            }
                                        }
                                    }
                                    fx1Var = null;
                                    if (fx1Var == null) {
                                    }
                                }
                            }
                            fx1Var = null;
                            if (fx1Var != null) {
                                Iterator it9 = aVar.a.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it9.next();
                                    wu1 wu1Var3 = ((ex1) obj4).a().O;
                                    if (jl40.l(wu1Var3 != null ? wu1Var3.a() : null, fx1Var.a)) {
                                        break;
                                    }
                                }
                                ex1 ex1Var = (ex1) obj4;
                                if (ex1Var != null && (a5 = ex1Var.a()) != null) {
                                    InactiveTariffView inactiveTariffView2 = fx1Var.b;
                                    String str24 = inactiveTariffView2.a;
                                    String str25 = inactiveTariffView2.c;
                                    if (str24 != null) {
                                        dlx0Var.g = ((m7x0) k7x0Var).a(str24);
                                    }
                                    if (str25 != null) {
                                        Iterator it10 = a5.S.iterator();
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                obj5 = null;
                                                break;
                                            }
                                            obj5 = it10.next();
                                            if (((ServiceLevel.Branding) obj5).c == ServiceLevel.Branding.Type.CASH_BACK) {
                                                break;
                                            }
                                        }
                                        ServiceLevel.Branding branding2 = (ServiceLevel.Branding) obj5;
                                        if (branding2 == null || (brandingValues = branding2.v) == null || (f = brandingValues.a) == null) {
                                            f = kotlin.collections.b.f();
                                        }
                                        pbx0Var.O.getClass();
                                        map2 = map5;
                                        BackendFormat backendFormat = (BackendFormat) map2.get(str25);
                                        if (backendFormat != null) {
                                            List<String> list16 = backendFormat.a;
                                            List list17 = list16;
                                            if (!(list17 instanceof Collection) || !list17.isEmpty()) {
                                                Iterator it11 = list17.iterator();
                                                while (it11.hasNext()) {
                                                    if (!f.containsKey((String) it11.next())) {
                                                    }
                                                }
                                            }
                                            HashMap hashMap = new HashMap(list16.size());
                                            for (String str26 : list16) {
                                                String str27 = str10;
                                                String p = oyr.p("$", str26, "$");
                                                String str28 = (String) f.get(str26);
                                                if (str28 == null) {
                                                    str28 = str3;
                                                }
                                                hashMap.put(p, str28);
                                                str10 = str27;
                                            }
                                            str4 = str10;
                                            sj6Var = new sj6(b9s.a(backendFormat.b, hashMap), b9s.b(backendFormat.c, hashMap));
                                            if (sj6Var != null) {
                                                FormattedText formattedText = sj6Var.a;
                                                StringBuilder sb3 = new StringBuilder();
                                                for (o oVar : formattedText.a) {
                                                    if (oVar instanceof FormattedText.h) {
                                                        sb3.append(((FormattedText.h) oVar).a);
                                                    } else if (oVar instanceof FormattedText.g) {
                                                        sb3.append(((FormattedText.g) oVar).b.a);
                                                    }
                                                }
                                                dlx0Var.n = sb3.toString();
                                                dlx0Var.o = sj6Var.b;
                                            }
                                        }
                                        str4 = str10;
                                        sj6Var = null;
                                        if (sj6Var != null) {
                                        }
                                    } else {
                                        str4 = str10;
                                        map2 = map5;
                                    }
                                    String str29 = inactiveTariffView2.b;
                                    if (str29 != null) {
                                        PriceMeta priceMeta = a5.T;
                                        qze0 qze0Var3 = a5.m;
                                        fef fefVar = qze0Var3 != null ? qze0Var3.c : null;
                                        if (priceMeta != null && fefVar != null) {
                                            str5 = str12;
                                            map = map2;
                                            v0f0 h = ((sze0) pbx0Var.N).h(map, priceMeta, fefVar, str29, null);
                                            if (h != null) {
                                                dlx0Var.m = new r0f0(h.b, h.a);
                                            }
                                            dlx0Var.K = true;
                                            if (pex0Var5.K0 || z2) {
                                                z8 = false;
                                            } else {
                                                niv0 niv0Var = pbx0Var.L;
                                                liv0 liv0Var = niv0Var.b;
                                                qqo qqoVar3 = liv0Var.a;
                                                qqo qqoVar4 = liv0Var.a;
                                                if (!((kiv0) qqoVar3.b()).b || (list5 = (List) ((kiv0) qqoVar4.b()).d.get(str5)) == null) {
                                                    list5 = emptyList;
                                                }
                                                Iterator it12 = list5.iterator();
                                                while (true) {
                                                    if (!it12.hasNext()) {
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = it12.next();
                                                    kiv0.a aVar2 = (kiv0.a) obj3;
                                                    ru.yandex.taxi.tooltips.repository.b bVar = niv0Var.a;
                                                    String str30 = aVar2.a;
                                                    kiv0.a.C0101a c0101a = aVar2.c;
                                                    int i19 = c0101a.a;
                                                    Integer num = c0101a.b;
                                                    int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                                                    bVar.getClass();
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append(str5);
                                                    niv0 niv0Var2 = niv0Var;
                                                    sb4.append(":");
                                                    sb4.append(str30);
                                                    String sb5 = sb4.toString();
                                                    Integer num2 = (Integer) bVar.d.get(sb5);
                                                    int intValue2 = num2 != null ? num2.intValue() : 0;
                                                    Integer num3 = (Integer) ((ConcurrentHashMap) bVar.e.getValue()).get(sb5);
                                                    if (intValue2 < intValue && (num3 != null ? num3.intValue() : 0) < i19) {
                                                        break;
                                                    }
                                                    niv0Var = niv0Var2;
                                                }
                                                kiv0.a aVar3 = (kiv0.a) obj3;
                                                if (aVar3 != null) {
                                                    String Y = d6z.Y((kiv0) qqoVar4.b(), aVar3.b);
                                                    String str31 = aVar3.a;
                                                    kiv0.a.C0101a c0101a2 = aVar3.c;
                                                    int i20 = c0101a2.a;
                                                    Integer num4 = c0101a2.b;
                                                    z8 = false;
                                                    ht10Var = new ht10(Y, new pvz0(str5, str31, i20, num4 != null ? num4.intValue() : Integer.MAX_VALUE), z8, 12);
                                                } else {
                                                    z8 = false;
                                                    ht10Var = null;
                                                }
                                                if (ht10Var != null) {
                                                    mr31Var = new mr31((String) ht10Var.b, "summary_multiclass_tooltip", false, null, 0, new bdc(xng0.bgInvert), null, (pvz0) ht10Var.c, 7612);
                                                    if (mr31Var == null) {
                                                        String str32 = selector3.b;
                                                        String str33 = (str32 == null || str32.length() == 0) ? null : str32;
                                                        if (str33 == null || wu1Var == null || !z || (wu1Var instanceof zo40) || (wu1Var instanceof jjj0)) {
                                                            mr31Var = null;
                                                        } else {
                                                            if (!(wu1Var instanceof py1) && !(wu1Var instanceof uy1) && !(wu1Var instanceof pl2) && !(wu1Var instanceof qnx0) && !(wu1Var instanceof yu1) && !(wu1Var instanceof ojc) && !(wu1Var instanceof gid0) && !(wu1Var instanceof p8f) && !(wu1Var instanceof u0h) && !(wu1Var instanceof ur40) && !(wu1Var instanceof vmd0) && !(wu1Var instanceof j2d0) && !(wu1Var instanceof yx00)) {
                                                                w511.b();
                                                                return null;
                                                            }
                                                            mr31Var = new mr31(str33, wu1Var.a(), false, null, 0, new bdc(xng0.bgInvert), null, null, 8124);
                                                        }
                                                        if (mr31Var == null) {
                                                            ati atiVar = pex0Var5.Z;
                                                            String str34 = (atiVar == null || (v580Var = atiVar.b) == null) ? null : v580Var.b.c.a;
                                                            mr31Var = str34 != null ? new mr31(str34, "sdd_delivery_tariff_tooltip", false, null, 0, new bdc(xng0.bgInvert), null, null, 8124) : null;
                                                            if (mr31Var == null) {
                                                                Iterator it13 = list14.iterator();
                                                                while (true) {
                                                                    if (!it13.hasNext()) {
                                                                        obj2 = null;
                                                                        break;
                                                                    }
                                                                    obj2 = it13.next();
                                                                    if (((ServiceLevel.Branding) obj2).c == ServiceLevel.Branding.Type.TARIFF_TOOLTIP) {
                                                                        break;
                                                                    }
                                                                }
                                                                ServiceLevel.Branding branding3 = (ServiceLevel.Branding) obj2;
                                                                mr31Var = (branding3 == null || (str9 = branding3.e) == null) ? null : new mr31(str9, "branding_tariff_tooltip", branding3.o != null ? true : z8, null, 0, new bdc(xng0.bgInvert), null, null, 8120);
                                                            }
                                                        }
                                                    }
                                                    mr31Var2 = mr31Var;
                                                    pbx0Var.x.getClass();
                                                    if (mr31Var2 != null) {
                                                        dlx0Var.s = mr31Var2;
                                                    }
                                                    str6 = mr31Var2 == null ? mr31Var2.a : null;
                                                    lgx0 lgx0Var = pbx0Var.D;
                                                    lgx0Var.getClass();
                                                    a2 = lgx0Var.a(list13, TariffModifierInfo.ModifierShowMode.SELECTED);
                                                    a3 = lgx0Var.a(list13, TariffModifierInfo.ModifierShowMode.NOT_SELECTED);
                                                    if (a2 != 0) {
                                                        int length = a2.length();
                                                        str7 = a2;
                                                    }
                                                    str7 = str6;
                                                    if ((a3 != 0 && a3.length() != 0) || z) {
                                                        str6 = a3;
                                                    }
                                                    Boolean bool = Boolean.TRUE;
                                                    HashMap hashMap2 = dlx0Var.r;
                                                    hashMap2.put(bool, str7);
                                                    hashMap2.put(Boolean.FALSE, str6);
                                                    if (((SummaryHighTariffSelectorExperiment) pbx0Var.K.b.getValue()).c.contains(str5)) {
                                                        list4 = list2;
                                                        z9 = true;
                                                    } else {
                                                        String str35 = yboVar.b;
                                                        if (evu0.J(str35)) {
                                                            i47 i47Var = pbx0Var.E;
                                                            int i21 = yboVar.a;
                                                            z9 = true;
                                                            if (i21 < 1) {
                                                                i47Var.getClass();
                                                                str8 = str3;
                                                            } else {
                                                                str8 = i21 + " " + ((avj0) i47Var.b).h(kyh0.date_format_min);
                                                            }
                                                            str35 = str8;
                                                        } else {
                                                            z9 = true;
                                                        }
                                                        Selector.HighlightedEtaDto highlightedEtaDto = selector3.h;
                                                        ufu ufuVar = (ufu) pdcVar;
                                                        kdc b = ufuVar.b(highlightedEtaDto != null ? highlightedEtaDto.a : null);
                                                        kdc i22 = ufuVar.i(highlightedEtaDto != null ? highlightedEtaDto.b : null);
                                                        if (z2 || evu0.J(str35)) {
                                                            list4 = list2;
                                                            ncoVar = null;
                                                        } else if (pex0Var5.g() || b == null || i22 == null) {
                                                            list4 = list2;
                                                            ncoVar = (z3 || !list4.contains(str5)) ? (z3 || z) ? new jco(str35) : new lco(str35) : new kco(str35, z);
                                                        } else {
                                                            ncoVar = new kco(str35, z, b, i22);
                                                            list4 = list2;
                                                        }
                                                        dlx0Var.j = ncoVar;
                                                    }
                                                    a4 = dlx0Var.a(pex0Var5.J0);
                                                    if (a4.M) {
                                                        z16 = z9;
                                                    }
                                                    ArrayList arrayList3 = arrayList;
                                                    arrayList3.add(a4);
                                                    zxs0Var = this;
                                                    z15 = z8;
                                                    list = list4;
                                                    i10 = i11;
                                                    i9 = i12;
                                                    i8 = i;
                                                    it3 = it4;
                                                    z11 = z19;
                                                    z13 = z20;
                                                    str10 = str4;
                                                    list7 = list12;
                                                    z12 = z2;
                                                    emptyList2 = emptyList;
                                                    arrayList2 = arrayList3;
                                                    map4 = map;
                                                }
                                            }
                                            mr31Var = null;
                                            if (mr31Var == null) {
                                            }
                                            mr31Var2 = mr31Var;
                                            pbx0Var.x.getClass();
                                            if (mr31Var2 != null) {
                                            }
                                            if (mr31Var2 == null) {
                                            }
                                            lgx0 lgx0Var2 = pbx0Var.D;
                                            lgx0Var2.getClass();
                                            a2 = lgx0Var2.a(list13, TariffModifierInfo.ModifierShowMode.SELECTED);
                                            a3 = lgx0Var2.a(list13, TariffModifierInfo.ModifierShowMode.NOT_SELECTED);
                                            if (a2 != 0) {
                                            }
                                            str7 = str6;
                                            if (a3 != 0) {
                                                str6 = a3;
                                                Boolean bool2 = Boolean.TRUE;
                                                HashMap hashMap22 = dlx0Var.r;
                                                hashMap22.put(bool2, str7);
                                                hashMap22.put(Boolean.FALSE, str6);
                                                if (((SummaryHighTariffSelectorExperiment) pbx0Var.K.b.getValue()).c.contains(str5)) {
                                                }
                                                a4 = dlx0Var.a(pex0Var5.J0);
                                                if (a4.M) {
                                                }
                                                ArrayList arrayList32 = arrayList;
                                                arrayList32.add(a4);
                                                zxs0Var = this;
                                                z15 = z8;
                                                list = list4;
                                                i10 = i11;
                                                i9 = i12;
                                                i8 = i;
                                                it3 = it4;
                                                z11 = z19;
                                                z13 = z20;
                                                str10 = str4;
                                                list7 = list12;
                                                z12 = z2;
                                                emptyList2 = emptyList;
                                                arrayList2 = arrayList32;
                                                map4 = map;
                                            }
                                            str6 = a3;
                                            Boolean bool22 = Boolean.TRUE;
                                            HashMap hashMap222 = dlx0Var.r;
                                            hashMap222.put(bool22, str7);
                                            hashMap222.put(Boolean.FALSE, str6);
                                            if (((SummaryHighTariffSelectorExperiment) pbx0Var.K.b.getValue()).c.contains(str5)) {
                                            }
                                            a4 = dlx0Var.a(pex0Var5.J0);
                                            if (a4.M) {
                                            }
                                            ArrayList arrayList322 = arrayList;
                                            arrayList322.add(a4);
                                            zxs0Var = this;
                                            z15 = z8;
                                            list = list4;
                                            i10 = i11;
                                            i9 = i12;
                                            i8 = i;
                                            it3 = it4;
                                            z11 = z19;
                                            z13 = z20;
                                            str10 = str4;
                                            list7 = list12;
                                            z12 = z2;
                                            emptyList2 = emptyList;
                                            arrayList2 = arrayList322;
                                            map4 = map;
                                        }
                                    }
                                    map = map2;
                                    str5 = str12;
                                    dlx0Var.K = true;
                                    if (pex0Var5.K0) {
                                    }
                                    z8 = false;
                                    mr31Var = null;
                                    if (mr31Var == null) {
                                    }
                                    mr31Var2 = mr31Var;
                                    pbx0Var.x.getClass();
                                    if (mr31Var2 != null) {
                                    }
                                    if (mr31Var2 == null) {
                                    }
                                    lgx0 lgx0Var22 = pbx0Var.D;
                                    lgx0Var22.getClass();
                                    a2 = lgx0Var22.a(list13, TariffModifierInfo.ModifierShowMode.SELECTED);
                                    a3 = lgx0Var22.a(list13, TariffModifierInfo.ModifierShowMode.NOT_SELECTED);
                                    if (a2 != 0) {
                                    }
                                    str7 = str6;
                                    if (a3 != 0) {
                                    }
                                    str6 = a3;
                                    Boolean bool222 = Boolean.TRUE;
                                    HashMap hashMap2222 = dlx0Var.r;
                                    hashMap2222.put(bool222, str7);
                                    hashMap2222.put(Boolean.FALSE, str6);
                                    if (((SummaryHighTariffSelectorExperiment) pbx0Var.K.b.getValue()).c.contains(str5)) {
                                    }
                                    a4 = dlx0Var.a(pex0Var5.J0);
                                    if (a4.M) {
                                    }
                                    ArrayList arrayList3222 = arrayList;
                                    arrayList3222.add(a4);
                                    zxs0Var = this;
                                    z15 = z8;
                                    list = list4;
                                    i10 = i11;
                                    i9 = i12;
                                    i8 = i;
                                    it3 = it4;
                                    z11 = z19;
                                    z13 = z20;
                                    str10 = str4;
                                    list7 = list12;
                                    z12 = z2;
                                    emptyList2 = emptyList;
                                    arrayList2 = arrayList3222;
                                    map4 = map;
                                }
                            }
                        }
                        str4 = str10;
                        str5 = str12;
                        map = map5;
                        if (pex0Var5.K0) {
                        }
                        z8 = false;
                        mr31Var = null;
                        if (mr31Var == null) {
                        }
                        mr31Var2 = mr31Var;
                        pbx0Var.x.getClass();
                        if (mr31Var2 != null) {
                        }
                        if (mr31Var2 == null) {
                        }
                        lgx0 lgx0Var222 = pbx0Var.D;
                        lgx0Var222.getClass();
                        a2 = lgx0Var222.a(list13, TariffModifierInfo.ModifierShowMode.SELECTED);
                        a3 = lgx0Var222.a(list13, TariffModifierInfo.ModifierShowMode.NOT_SELECTED);
                        if (a2 != 0) {
                        }
                        str7 = str6;
                        if (a3 != 0) {
                        }
                        str6 = a3;
                        Boolean bool2222 = Boolean.TRUE;
                        HashMap hashMap22222 = dlx0Var.r;
                        hashMap22222.put(bool2222, str7);
                        hashMap22222.put(Boolean.FALSE, str6);
                        if (((SummaryHighTariffSelectorExperiment) pbx0Var.K.b.getValue()).c.contains(str5)) {
                        }
                        a4 = dlx0Var.a(pex0Var5.J0);
                        if (a4.M) {
                        }
                        ArrayList arrayList32222 = arrayList;
                        arrayList32222.add(a4);
                        zxs0Var = this;
                        z15 = z8;
                        list = list4;
                        i10 = i11;
                        i9 = i12;
                        i8 = i;
                        it3 = it4;
                        z11 = z19;
                        z13 = z20;
                        str10 = str4;
                        list7 = list12;
                        z12 = z2;
                        emptyList2 = emptyList;
                        arrayList2 = arrayList32222;
                        map4 = map;
                    }
                    z5 = true;
                    if (branding != null) {
                    }
                    if (type2 == null) {
                    }
                    if (i4 != 1) {
                    }
                    if (z18) {
                    }
                    str4 = str10;
                    str5 = str12;
                    map = map5;
                    if (pex0Var5.K0) {
                    }
                    z8 = false;
                    mr31Var = null;
                    if (mr31Var == null) {
                    }
                    mr31Var2 = mr31Var;
                    pbx0Var.x.getClass();
                    if (mr31Var2 != null) {
                    }
                    if (mr31Var2 == null) {
                    }
                    lgx0 lgx0Var2222 = pbx0Var.D;
                    lgx0Var2222.getClass();
                    a2 = lgx0Var2222.a(list13, TariffModifierInfo.ModifierShowMode.SELECTED);
                    a3 = lgx0Var2222.a(list13, TariffModifierInfo.ModifierShowMode.NOT_SELECTED);
                    if (a2 != 0) {
                    }
                    str7 = str6;
                    if (a3 != 0) {
                    }
                    str6 = a3;
                    Boolean bool22222 = Boolean.TRUE;
                    HashMap hashMap222222 = dlx0Var.r;
                    hashMap222222.put(bool22222, str7);
                    hashMap222222.put(Boolean.FALSE, str6);
                    if (((SummaryHighTariffSelectorExperiment) pbx0Var.K.b.getValue()).c.contains(str5)) {
                    }
                    a4 = dlx0Var.a(pex0Var5.J0);
                    if (a4.M) {
                    }
                    ArrayList arrayList322222 = arrayList;
                    arrayList322222.add(a4);
                    zxs0Var = this;
                    z15 = z8;
                    list = list4;
                    i10 = i11;
                    i9 = i12;
                    i8 = i;
                    it3 = it4;
                    z11 = z19;
                    z13 = z20;
                    str10 = str4;
                    list7 = list12;
                    z12 = z2;
                    emptyList2 = emptyList;
                    arrayList2 = arrayList322222;
                    map4 = map;
                }
            }
            CouponCheckResult couponCheckResult = pex0Var5.j0;
            dlx0Var.w = (couponCheckResult == null || !couponCheckResult.a || z4) ? false : true;
            unx0 unx0Var2 = pbx0Var.C;
            List list142 = list13;
            it = list142.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            branding = (ServiceLevel.Branding) obj;
            if (!(wu1Var instanceof yu1)) {
            }
            z5 = true;
            if (branding != null) {
            }
            if (type2 == null) {
            }
            if (i4 != 1) {
            }
            if (z18) {
            }
            str4 = str10;
            str5 = str12;
            map = map5;
            if (pex0Var5.K0) {
            }
            z8 = false;
            mr31Var = null;
            if (mr31Var == null) {
            }
            mr31Var2 = mr31Var;
            pbx0Var.x.getClass();
            if (mr31Var2 != null) {
            }
            if (mr31Var2 == null) {
            }
            lgx0 lgx0Var22222 = pbx0Var.D;
            lgx0Var22222.getClass();
            a2 = lgx0Var22222.a(list13, TariffModifierInfo.ModifierShowMode.SELECTED);
            a3 = lgx0Var22222.a(list13, TariffModifierInfo.ModifierShowMode.NOT_SELECTED);
            if (a2 != 0) {
            }
            str7 = str6;
            if (a3 != 0) {
            }
            str6 = a3;
            Boolean bool222222 = Boolean.TRUE;
            HashMap hashMap2222222 = dlx0Var.r;
            hashMap2222222.put(bool222222, str7);
            hashMap2222222.put(Boolean.FALSE, str6);
            if (((SummaryHighTariffSelectorExperiment) pbx0Var.K.b.getValue()).c.contains(str5)) {
            }
            a4 = dlx0Var.a(pex0Var5.J0);
            if (a4.M) {
            }
            ArrayList arrayList3222222 = arrayList;
            arrayList3222222.add(a4);
            zxs0Var = this;
            z15 = z8;
            list = list4;
            i10 = i11;
            i9 = i12;
            i8 = i;
            it3 = it4;
            z11 = z19;
            z13 = z20;
            str10 = str4;
            list7 = list12;
            z12 = z2;
            emptyList2 = emptyList;
            arrayList2 = arrayList3222222;
            map4 = map;
        }
        return arrayList2;
    }

    public void r(String str) {
        g8k0 g8k0Var = (g8k0) this.a;
        String str2 = (String) this.b;
        f8k0 f8k0Var = g8k0Var.a;
        f8k0Var.getClass();
        HashMap h = kotlin.collections.b.h(new Pair("close_reason", str));
        if (str2 != null) {
            h.put("payment_type", str2);
        }
        x4e.B(f8k0Var.a, "Ride.SuggestChangePayment.Closed", h, 1);
    }

    @Override // defpackage.pb10
    public void release() {
        f fVar = (f) this.b;
        MediaCodec mediaCodec = (MediaCodec) this.a;
        try {
            int i = tw21.a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && fVar != null) {
                fVar.b(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (tw21.a >= 35 && fVar != null) {
                fVar.b(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.pb10
    public int s(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.a).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.pb10
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // defpackage.pb10
    public void setVideoScalingMode(int i) {
        ((MediaCodec) this.a).setVideoScalingMode(i);
    }

    public void u(qgv0 qgv0Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.a;
        if (!(qgv0Var instanceof ogv0)) {
            if (jl40.l(qgv0Var, pgv0.a)) {
                listItemComponent.clearTrailView();
                return;
            } else {
                w511.b();
                return;
            }
        }
        ogv0 ogv0Var = (ogv0) qgv0Var;
        ButtonComponent buttonComponent = (ButtonComponent) listItemComponent.getTrailViewAs(ButtonComponent.class);
        if (buttonComponent == null) {
            ButtonComponent buttonComponent2 = new ButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
            buttonComponent2.setTextSize(13.0f);
            buttonComponent2.setButtonSize(0);
            buttonComponent2.setTextTypeface(3);
            buttonComponent2.setButtonBackground(new bdc(xng0.controlMinor));
            buttonComponent2.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
            listItemComponent.setTrailView(buttonComponent2);
            Rect rect = xw31.a;
            c.D(buttonComponent2.getLayoutParams().width, -2, buttonComponent2);
            xw31.F(buttonComponent2, null, null, Integer.valueOf(tje.u(12, buttonComponent2.getContext())), null);
            xw31.F(buttonComponent2, Integer.valueOf(tje.u(8, buttonComponent2.getContext())), null, null, null);
            buttonComponent = buttonComponent2;
        }
        buttonComponent.setText(ogv0Var.a);
        buttonComponent.setContentDescription(ogv0Var.b);
        buttonComponent.setDebounceClickListener(new tpt0(16, this, ogv0Var));
    }

    public void v() {
        ((cne0) ((h) ((lux) this.a)).b).u("launch_actual", false);
        com.yandex.go.taxi.tariffs.internal.repository.a aVar = ((yvw) this.b).a;
        aVar.a.set(null);
        aVar.b.clear();
        prx0.a.a();
    }

    @Override // defpackage.pb10
    public int y() {
        return ((MediaCodec) this.a).dequeueInputBuffer(0L);
    }
}
