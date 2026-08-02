package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.databases.user.UserDatabase;
import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class pm implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public pm(fvf fvfVar, sdr sdrVar, jx7 jx7Var, eoe eoeVar) {
        this.a = 13;
        float f = edo.a;
        this.b = fvfVar;
        this.c = sdrVar;
        this.d = jx7Var;
        this.e = eoeVar;
    }

    private final Object c(Object obj, Continuation continuation) {
        float floatValue = ((Number) obj).floatValue();
        String[] strArr = (String[]) this.d;
        vqn vqnVar = (vqn) this.c;
        uqn uqnVar = (uqn) this.b;
        if (floatValue < uqnVar.a) {
            IntRange B = xz0.B(strArr);
            ArrayList arrayList = new ArrayList();
            ype it = B.iterator();
            while (it.c) {
                Object next = it.next();
                if (((Number) next).intValue() != vqnVar.a) {
                    arrayList.add(next);
                }
            }
            phn.a.getClass();
            Integer num = (Integer) (arrayList.isEmpty() ? null : CollectionsKt.N(arrayList, phn.b.d(arrayList.size())));
            int intValue = num != null ? num.intValue() : 0;
            vqnVar.a = intValue;
            aqi aqiVar = (aqi) this.e;
            String str = (String) xz0.E(intValue, strArr);
            if (str == null) {
                str = "";
            }
            aqiVar.setValue(str);
        }
        uqnVar.a = floatValue;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(Object obj, Continuation continuation) {
        kcw kcwVar;
        int i;
        if (continuation instanceof kcw) {
            kcwVar = (kcw) continuation;
            int i2 = kcwVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kcwVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = kcwVar.j;
                nm6 nm6Var = nm6.a;
                i = kcwVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar = (rjc) this.b;
                    jcw jcwVar = (jcw) obj;
                    if (!Intrinsics.d(jcwVar.b, this.c) || !jcwVar.b((String) this.d)) {
                        String str = (String) this.e;
                        if (!jcwVar.d && !jcwVar.f.contains(str)) {
                            kcwVar.k = 1;
                            if (rjcVar.emit(obj, kcwVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        kcwVar = new kcw(this, continuation);
        Object obj22 = kcwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kcwVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(int[] iArr, Continuation continuation) {
        gat gatVar;
        int i;
        String[] strArr = (String[]) this.d;
        rjc rjcVar = (rjc) this.b;
        xqn xqnVar = (xqn) this.c;
        if (continuation instanceof gat) {
            gatVar = (gat) continuation;
            int i2 = gatVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gatVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gatVar.k;
                nm6 nm6Var = nm6.a;
                i = gatVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (xqnVar.a == null) {
                        Set Y = xz0.Y(strArr);
                        gatVar.j = iArr;
                        gatVar.m = 1;
                    } else {
                        int[] iArr2 = (int[]) this.e;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj2 = xqnVar.a;
                            if (obj2 == null) {
                                xq0.q("Required value was null.");
                                return null;
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj2)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set A0 = CollectionsKt.A0(arrayList);
                            gatVar.j = iArr;
                            gatVar.m = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = gatVar.j;
                    qgg.h0(obj);
                }
                xqnVar.a = iArr;
                return Unit.a;
            }
        }
        gatVar = new gat(this, continuation);
        Object obj3 = gatVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gatVar.m;
        if (i != 0) {
        }
        xqnVar.a = iArr;
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x03b0, code lost:
    
        if (r2.emit((defpackage.hxc) r13, r3) == r4) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0905, code lost:
    
        if (r0.emit((java.util.List) r2, r1) != r4) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x09b2, code lost:
    
        r1 = new java.lang.Integer(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09bb, code lost:
    
        if (r1.intValue() == (-1)) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x09be, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x09bf, code lost:
    
        if (r1 == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x09c1, code lost:
    
        r1 = r1.intValue();
        r5 = r10.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x09cb, code lost:
    
        if ((r5 instanceof defpackage.sy) == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09cd, code lost:
    
        r5 = (defpackage.sy) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x09d1, code lost:
    
        if (r5 != null) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:?, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x09d7, code lost:
    
        r5 = r5.a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x09e1, code lost:
    
        if (r5.hasNext() == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x09e3, code lost:
    
        r6 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x09e7, code lost:
    
        if (r9 < 0) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x09e9, code lost:
    
        r6 = (defpackage.u00) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x09ed, code lost:
    
        if ((r6 instanceof defpackage.s00) == false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x09f9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((defpackage.s00) r6).b.a, r0) == false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0a06, code lost:
    
        r0 = new java.lang.Integer(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a0f, code lost:
    
        if (r0.intValue() == (-1)) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0a11, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0a14, code lost:
    
        if (r15 == null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0a16, code lost:
    
        r14 = (defpackage.jx7) r14;
        r0 = ((defpackage.fvf) r13).f(((r1 + r15.intValue()) + ((r1 * 2) + 1)) + 1, -(r14.L(((defpackage.eoe) r11).d()) + r14.L(defpackage.edo.b)), r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0a44, code lost:
    
        if (r0 != defpackage.nm6.a) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:?, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0a13, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x09fc, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x09ff, code lost:
    
        defpackage.u75.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0a04, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0a05, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x09d0, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0a4c, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0c84, code lost:
    
        if (r10.emit(r0, r12) != r8) goto L484;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [eul, fvl, hwl, java.lang.String, java.util.Collection, java.util.Iterator, java.util.List, mqs, rjc] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:466:0x0bc3 -> B:461:0x0bd3). Please report as a decompilation issue!!! */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        om omVar;
        int i;
        rjc rjcVar;
        String str;
        List list;
        Iterator it;
        ArrayList arrayList;
        Object obj2;
        om omVar2;
        mqs mqsVar;
        int i2;
        int i3;
        int i4;
        rjc rjcVar2;
        int i5;
        Object c73Var;
        ?? r7;
        int i6;
        xc4 xc4Var;
        int i7;
        pm pmVar;
        x05 x05Var;
        int i8;
        int i9;
        rjc rjcVar3;
        boolean z;
        boolean z2;
        ?? r72;
        c7e c7eVar;
        int i10;
        e7e e7eVar;
        int i11;
        int i12;
        e7e e7eVar2;
        nm6 nm6Var;
        rjc rjcVar4;
        Object obj3;
        Object obj4;
        e7e e7eVar3;
        rjc rjcVar5;
        Map map;
        kp0 c;
        soh sohVar;
        int i13;
        rjc rjcVar6;
        rjc rjcVar7;
        x6i x6iVar;
        int i14;
        Object h6pVar;
        acn acnVar;
        int i15;
        cdn cdnVar;
        int i16;
        ild ildVar;
        d74 d74Var;
        Object obj5 = obj;
        int i17 = this.a;
        int i18 = 2;
        int i19 = 0;
        boolean z3 = false;
        r9 = 0;
        r9 = 0;
        int i20 = 0;
        Object obj6 = this.b;
        Object obj7 = this.e;
        int i21 = 1;
        Object obj8 = this.d;
        Object obj9 = this.c;
        boolean z4 = false;
        switch (i17) {
            case 0:
                mqs mqsVar2 = (mqs) obj8;
                String str2 = mqsVar2.c;
                rm rmVar = (rm) obj9;
                xdr xdrVar = rmVar.f;
                if (continuation instanceof om) {
                    omVar = (om) continuation;
                    int i22 = omVar.k;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        omVar.k = i22 - Integer.MIN_VALUE;
                        Object obj10 = omVar.j;
                        nm6 nm6Var2 = nm6.a;
                        i = omVar.k;
                        String str3 = StringUtil.SPACE;
                        String str4 = "AddTrackToPlaylistBlock";
                        if (i != 0) {
                            qgg.h0(obj10);
                            rjcVar = (rjc) obj6;
                            List list2 = (List) obj;
                            if (list2.isEmpty()) {
                                xdrVar.getClass();
                                xdrVar.m(null, gm.a);
                                ssg.a(3, "AddTrackToPlaylistBlock", "playlists is empty " + mqsVar2.d() + StringUtil.SPACE + str2, null);
                                c73Var = new c73(rmVar.a());
                                r7 = 0;
                                i6 = 0;
                                omVar.m = r7;
                                omVar.n = r7;
                                omVar.o = r7;
                                omVar.p = r7;
                                omVar.q = r7;
                                omVar.r = r7;
                                omVar.s = r7;
                                omVar.t = r7;
                                omVar.u = r7;
                                omVar.v = r7;
                                omVar.w = i6;
                                omVar.k = 2;
                            } else {
                                str = rmVar.a.c;
                                List list3 = list2;
                                ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                                list = list2;
                                it = list3.iterator();
                                arrayList = arrayList2;
                                obj2 = obj7;
                                omVar2 = omVar;
                                mqsVar = mqsVar2;
                                i2 = 0;
                                i3 = 0;
                                i4 = 0;
                                rjcVar2 = rjcVar;
                                i5 = 0;
                                if (it.hasNext()) {
                                }
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj10);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i23 = omVar.A;
                            int i24 = omVar.z;
                            int i25 = omVar.y;
                            int i26 = omVar.x;
                            int i27 = omVar.w;
                            hwl hwlVar = omVar.v;
                            eul eulVar = omVar.u;
                            Collection collection = omVar.t;
                            mqs mqsVar3 = omVar.s;
                            String str5 = omVar.r;
                            fvl fvlVar = omVar.q;
                            Iterator it2 = omVar.p;
                            Collection collection2 = omVar.o;
                            List list4 = omVar.n;
                            rjc rjcVar8 = omVar.m;
                            qgg.h0(obj10);
                            rjc rjcVar9 = rjcVar8;
                            int i28 = i27;
                            String str6 = str5;
                            Iterator it3 = it2;
                            ArrayList arrayList3 = collection2;
                            String str7 = StringUtil.SPACE;
                            rm rmVar2 = rmVar;
                            int i29 = i23;
                            obj2 = obj7;
                            om omVar3 = omVar;
                            int i30 = i24;
                            mqs mqsVar4 = mqsVar3;
                            String str8 = str2;
                            hwl hwlVar2 = hwlVar;
                            String str9 = "AddTrackToPlaylistBlock";
                            eul J = eulVar;
                            mqs mqsVar5 = mqsVar2;
                            fvl fvlVar2 = fvlVar;
                            xdr xdrVar2 = xdrVar;
                            Object o = obj10;
                            ArrayList arrayList4 = collection;
                            arrayList4.add(new xl(hwlVar2.a(J, i29, ((Boolean) o).booleanValue(), null), fvlVar2.b, fvlVar2.a));
                            arrayList = arrayList3;
                            it = it3;
                            str = str6;
                            mqsVar = mqsVar4;
                            i3 = i25;
                            i5 = i30;
                            omVar2 = omVar3;
                            i2 = i26;
                            rjcVar2 = rjcVar9;
                            str4 = str9;
                            mqsVar2 = mqsVar5;
                            str2 = str8;
                            str3 = str7;
                            xdrVar = xdrVar2;
                            rmVar = rmVar2;
                            list = list4;
                            i4 = i28;
                            if (it.hasNext()) {
                                mqsVar5 = mqsVar2;
                                fvlVar2 = (fvl) it.next();
                                str9 = str4;
                                J = bfg.J(fvlVar2.a);
                                str8 = str2;
                                hwlVar2 = rmVar.d;
                                str7 = str3;
                                i29 = fvlVar2.a.g;
                                xdrVar2 = xdrVar;
                                sy7 sy7Var = rmVar.e;
                                rmVar2 = rmVar;
                                nvl d = J.d();
                                omVar2.m = rjcVar2;
                                rjc rjcVar10 = rjcVar2;
                                omVar2.n = list;
                                ArrayList arrayList5 = arrayList;
                                omVar2.o = arrayList5;
                                omVar2.p = it;
                                omVar2.q = fvlVar2;
                                omVar2.r = str;
                                omVar2.s = mqsVar;
                                omVar2.t = arrayList5;
                                omVar2.u = J;
                                omVar2.v = hwlVar2;
                                omVar2.w = i4;
                                omVar2.x = i2;
                                omVar2.y = i3;
                                omVar2.z = i5;
                                omVar2.A = i29;
                                omVar2.k = 1;
                                o = ((t3g) ((u3g) sy7Var.a.getValue())).o(d, omVar2);
                                if (o != nm6Var2) {
                                    omVar3 = omVar2;
                                    i28 = i4;
                                    rjcVar9 = rjcVar10;
                                    list4 = list;
                                    i26 = i2;
                                    i30 = i5;
                                    it3 = it;
                                    i25 = i3;
                                    arrayList3 = arrayList;
                                    mqsVar4 = mqsVar;
                                    str6 = str;
                                    arrayList4 = arrayList3;
                                    arrayList4.add(new xl(hwlVar2.a(J, i29, ((Boolean) o).booleanValue(), null), fvlVar2.b, fvlVar2.a));
                                    arrayList = arrayList3;
                                    it = it3;
                                    str = str6;
                                    mqsVar = mqsVar4;
                                    i3 = i25;
                                    i5 = i30;
                                    omVar2 = omVar3;
                                    i2 = i26;
                                    rjcVar2 = rjcVar9;
                                    str4 = str9;
                                    mqsVar2 = mqsVar5;
                                    str2 = str8;
                                    str3 = str7;
                                    xdrVar = xdrVar2;
                                    rmVar = rmVar2;
                                    list = list4;
                                    i4 = i28;
                                    if (it.hasNext()) {
                                        String str10 = str2;
                                        xdr xdrVar3 = xdrVar;
                                        rjc rjcVar11 = rjcVar2;
                                        im imVar = new im(str, mqsVar, arrayList, (mwk) obj2);
                                        xdrVar3.getClass();
                                        xdrVar3.m(null, imVar);
                                        r7 = 0;
                                        ssg.a(3, str4, "got " + list.size() + " playlists " + mqsVar2.d() + str3 + str10, null);
                                        c73Var = new d73(rmVar.a());
                                        omVar = omVar2;
                                        i6 = i4;
                                        rjcVar = rjcVar11;
                                        omVar.m = r7;
                                        omVar.n = r7;
                                        omVar.o = r7;
                                        omVar.p = r7;
                                        omVar.q = r7;
                                        omVar.r = r7;
                                        omVar.s = r7;
                                        omVar.t = r7;
                                        omVar.u = r7;
                                        omVar.v = r7;
                                        omVar.w = i6;
                                        omVar.k = 2;
                                        break;
                                    }
                                }
                                return nm6Var2;
                            }
                        }
                    }
                }
                omVar = new om(this, continuation);
                Object obj102 = omVar.j;
                nm6 nm6Var22 = nm6.a;
                i = omVar.k;
                String str32 = StringUtil.SPACE;
                String str42 = "AddTrackToPlaylistBlock";
                if (i != 0) {
                }
            case 1:
                String str11 = (String) obj5;
                List list5 = (List) obj6;
                Iterator it4 = list5.iterator();
                int i31 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i31 = -1;
                        break;
                    } else {
                        Object next = it4.next();
                        if (i31 < 0) {
                            u75.n();
                            throw null;
                        }
                        if (((uy) next) instanceof sy) {
                            break;
                        } else {
                            i31++;
                        }
                    }
                }
            case 2:
                if (continuation instanceof xc4) {
                    xc4Var = (xc4) continuation;
                    int i32 = xc4Var.n;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        xc4Var.n = i32 - Integer.MIN_VALUE;
                        Object obj11 = xc4Var.l;
                        nm6 nm6Var3 = nm6.a;
                        i7 = xc4Var.n;
                        if (i7 != 0) {
                            qgg.h0(obj11);
                            r2f r2fVar = (r2f) ((xqn) obj9).a;
                            if (r2fVar != null) {
                                r2fVar.g(new fj4());
                                xc4Var.j = this;
                                xc4Var.k = obj5;
                                xc4Var.n = 1;
                                if (r2fVar.j0(xc4Var) == nm6Var3) {
                                    return nm6Var3;
                                }
                            }
                            pmVar = this;
                        } else {
                            if (i7 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj5 = xc4Var.k;
                            pmVar = xc4Var.j;
                            qgg.h0(obj11);
                        }
                        ((xqn) pmVar.c).a = x97.y((mm6) pmVar.d, null, pm6.d, new wc4((yc4) pmVar.e, (rjc) pmVar.b, obj5, null), 1);
                        return Unit.a;
                    }
                }
                xc4Var = new xc4(this, continuation);
                Object obj112 = xc4Var.l;
                nm6 nm6Var32 = nm6.a;
                i7 = xc4Var.n;
                if (i7 != 0) {
                }
                ((xqn) pmVar.c).a = x97.y((mm6) pmVar.d, null, pm6.d, new wc4((yc4) pmVar.e, (rjc) pmVar.b, obj5, null), 1);
                return Unit.a;
            case 3:
                if (continuation instanceof x05) {
                    x05Var = (x05) continuation;
                    int i33 = x05Var.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        x05Var.k = i33 - Integer.MIN_VALUE;
                        Object obj12 = x05Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i8 = x05Var.k;
                        if (i8 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar12 = (rjc) obj6;
                            String str12 = ((frt) l18.b.c(hag.I(frt.class))).c().a;
                            str12.getClass();
                            x05Var.m = rjcVar12;
                            i9 = 0;
                            x05Var.n = 0;
                            x05Var.k = 1;
                            Object V = x97.V(dm6.b, new xg((String) obj8, (e15) obj9, (Integer) obj7, str12, (Continuation) null, 4), x05Var);
                            if (V != nm6Var4) {
                                obj12 = V;
                                rjcVar3 = rjcVar12;
                            }
                            return nm6Var4;
                        }
                        if (i8 != 1) {
                            if (i8 == 2) {
                                qgg.h0(obj12);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i9 = x05Var.n;
                        rjcVar3 = x05Var.m;
                        qgg.h0(obj12);
                        x05Var.m = null;
                        x05Var.n = i9;
                        x05Var.k = 2;
                        break;
                    }
                }
                x05Var = new x05(this, continuation);
                Object obj122 = x05Var.j;
                nm6 nm6Var42 = nm6.a;
                i8 = x05Var.k;
                if (i8 != 0) {
                }
                x05Var.m = null;
                x05Var.n = i9;
                x05Var.k = 2;
            case 4:
                qbs qbsVar = (qbs) obj8;
                axf axfVar = (axf) obj6;
                if (((Boolean) obj5).booleanValue() && axfVar.b()) {
                    j66.H((lcs) obj9, axfVar, qbsVar.k(), (ide) obj7, qbsVar.b);
                } else {
                    j66.F(axfVar);
                }
                return Unit.a;
            case 5:
                tre treVar = (tre) obj5;
                vqn vqnVar = (vqn) obj8;
                vqn vqnVar2 = (vqn) obj9;
                vqn vqnVar3 = (vqn) obj6;
                if (treVar instanceof rqm) {
                    vqnVar3.a++;
                } else if (treVar instanceof sqm) {
                    vqnVar3.a--;
                } else if (treVar instanceof qqm) {
                    vqnVar3.a--;
                } else if (treVar instanceof k4e) {
                    vqnVar2.a++;
                } else if (treVar instanceof l4e) {
                    vqnVar2.a--;
                } else if (treVar instanceof poc) {
                    vqnVar.a++;
                } else if (treVar instanceof qoc) {
                    vqnVar.a--;
                }
                boolean z5 = vqnVar3.a > 0;
                boolean z6 = vqnVar2.a > 0;
                boolean z7 = vqnVar.a > 0;
                il7 il7Var = (il7) obj7;
                if (il7Var.p != z5) {
                    il7Var.p = z5;
                    z = true;
                } else {
                    z = false;
                }
                if (il7Var.q != z6) {
                    il7Var.q = z6;
                    z = true;
                }
                if (il7Var.r != z7) {
                    il7Var.r = z7;
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    vq1.Z(il7Var);
                }
                return Unit.a;
            case 6:
                Pair pair = (Pair) obj5;
                BottomsheetCollapsingTopBar bottomsheetCollapsingTopBar = (BottomsheetCollapsingTopBar) obj6;
                s2e s2eVar = (s2e) obj9;
                u1e u1eVar = (u1e) obj8;
                v2s v2sVar = (v2s) pair.a;
                re reVar = (re) pair.b;
                if (reVar != null) {
                    bottomsheetCollapsingTopBar.s(sqq.a(reVar.a), new mvd(4), new k1e(u1eVar, 1));
                    s2eVar.m(true);
                } else {
                    if (v2sVar == null) {
                        r72 = 0;
                        bottomsheetCollapsingTopBar.s(null, new mvd(5), new rea(16));
                        s2eVar.m(false);
                        rar y = x97.y(u1eVar.w, r72, r72, new ptd(u1eVar, v2sVar, r72, i18), 3);
                        rhp rhpVar = u1eVar.k;
                        s9f[] s9fVarArr = u1e.N;
                        rhpVar.d(s9fVarArr[1], y);
                        u1eVar.j.d(s9fVarArr[0], x97.y(u1eVar.w, r72, r72, new t1e(u1eVar, r72, i18), 3));
                        return Unit.a;
                    }
                    bottomsheetCollapsingTopBar.s(sqq.b(v2sVar), new ny2(28, v2sVar, (npq) obj7), new rea(15));
                    s2eVar.m(false);
                }
                r72 = 0;
                rar y2 = x97.y(u1eVar.w, r72, r72, new ptd(u1eVar, v2sVar, r72, i18), 3);
                rhp rhpVar2 = u1eVar.k;
                s9f[] s9fVarArr2 = u1e.N;
                rhpVar2.d(s9fVarArr2[1], y2);
                u1eVar.j.d(s9fVarArr2[0], x97.y(u1eVar.w, r72, r72, new t1e(u1eVar, r72, i18), 3));
                return Unit.a;
            case 7:
                if (continuation instanceof c7e) {
                    c7eVar = (c7e) continuation;
                    int i34 = c7eVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        c7eVar.k = i34 - Integer.MIN_VALUE;
                        Object obj13 = c7eVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i10 = c7eVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj13);
                            kp0 i35 = yk3.i((yk3) obj9, (kp0) obj5, (UUID) ((kkp) obj8).c, (h7e) obj7);
                            c7eVar.k = 1;
                            if (((rjc) obj6).emit(i35, c7eVar) == nm6Var5) {
                                return nm6Var5;
                            }
                        } else {
                            if (i10 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj13);
                        }
                        return Unit.a;
                    }
                }
                c7eVar = new c7e(this, continuation);
                Object obj132 = c7eVar.j;
                nm6 nm6Var52 = nm6.a;
                i10 = c7eVar.k;
                if (i10 != 0) {
                }
                return Unit.a;
            case 8:
                xqn xqnVar = (xqn) obj7;
                if (continuation instanceof e7e) {
                    e7eVar = (e7e) continuation;
                    int i36 = e7eVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        e7eVar.k = i36 - Integer.MIN_VALUE;
                        Object obj14 = e7eVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i11 = e7eVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj14);
                            rjc rjcVar13 = (rjc) obj6;
                            ij3 ij3Var = (ij3) obj5;
                            if (xqnVar.a == null) {
                                xqnVar.a = new qu7();
                            }
                            Object obj15 = xqnVar.a;
                            obj15.getClass();
                            qu7 qu7Var = (qu7) obj15;
                            ij3Var.getClass();
                            Object d0 = saf.d0(new jj3(ij3Var));
                            d0.getClass();
                            Map map2 = (Map) d0;
                            LinkedHashMap linkedHashMap = qu7Var.a;
                            LinkedHashMap linkedHashMap2 = qu7Var.b;
                            if (linkedHashMap2.isEmpty()) {
                                linkedHashMap.putAll(map2);
                                e7eVar2 = e7eVar;
                                nm6Var = nm6Var6;
                                rjcVar4 = rjcVar13;
                                i12 = 1;
                                obj3 = obj8;
                                obj4 = obj9;
                            } else {
                                Object obj16 = map2.get("incremental");
                                List list6 = obj16 instanceof List ? (List) obj16 : null;
                                if (list6 == null) {
                                    qu7Var.f = true;
                                    e7eVar2 = e7eVar;
                                    nm6Var = nm6Var6;
                                    rjcVar4 = rjcVar13;
                                    i12 = 1;
                                    obj3 = obj8;
                                    obj4 = obj9;
                                } else {
                                    qu7Var.f = false;
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it5 = list6.iterator();
                                    while (true) {
                                        i12 = i21;
                                        Iterator it6 = it5;
                                        if (it5.hasNext()) {
                                            Object obj17 = obj8;
                                            Map map3 = (Map) it6.next();
                                            Object obj18 = obj9;
                                            Map map4 = (Map) map3.get("data");
                                            nm6 nm6Var7 = nm6Var6;
                                            Object obj19 = map3.get("path");
                                            obj19.getClass();
                                            List list7 = (List) obj19;
                                            Object obj20 = linkedHashMap2.get("data");
                                            obj20.getClass();
                                            Map map5 = (Map) obj20;
                                            if (map4 != null) {
                                                for (Object obj21 : list7) {
                                                    rjc rjcVar14 = rjcVar13;
                                                    e7e e7eVar4 = e7eVar;
                                                    if (map5 instanceof List) {
                                                        obj21.getClass();
                                                        map = ((List) map5).get(((Integer) obj21).intValue());
                                                    } else {
                                                        map5.getClass();
                                                        map = map5.get(obj21);
                                                    }
                                                    map5 = map;
                                                    rjcVar13 = rjcVar14;
                                                    e7eVar = e7eVar4;
                                                }
                                                e7eVar3 = e7eVar;
                                                rjcVar5 = rjcVar13;
                                                map5.getClass();
                                                qu7.a(wct.n(map5), map4);
                                                qu7Var.c.add(new pu7(list7, (String) map3.get("label")));
                                            } else {
                                                e7eVar3 = e7eVar;
                                                rjcVar5 = rjcVar13;
                                            }
                                            Object obj22 = map3.get("errors");
                                            List list8 = obj22 instanceof List ? (List) obj22 : null;
                                            if (list8 != null) {
                                                z75.t(arrayList6, list8);
                                            }
                                            Object obj23 = map3.get("extensions");
                                            Map map6 = obj23 instanceof Map ? (Map) obj23 : null;
                                            if (map6 != null) {
                                                arrayList7.add(map6);
                                            }
                                            it5 = it6;
                                            nm6Var6 = nm6Var7;
                                            obj9 = obj18;
                                            i21 = i12;
                                            obj8 = obj17;
                                            rjcVar13 = rjcVar5;
                                            e7eVar = e7eVar3;
                                        } else {
                                            e7eVar2 = e7eVar;
                                            nm6Var = nm6Var6;
                                            rjcVar4 = rjcVar13;
                                            obj3 = obj8;
                                            obj4 = obj9;
                                            if (arrayList6.isEmpty()) {
                                                linkedHashMap.remove("errors");
                                            } else {
                                                linkedHashMap.put("errors", arrayList6);
                                            }
                                            if (arrayList7.isEmpty()) {
                                                linkedHashMap.remove("extensions");
                                            } else {
                                                linkedHashMap.put("extensions", tah.b(new Pair("incremental", arrayList7)));
                                            }
                                        }
                                    }
                                }
                                Boolean bool = (Boolean) map2.get("hasNext");
                                qu7Var.e = bool != null ? bool.booleanValue() : false;
                            }
                            Object obj24 = xqnVar.a;
                            obj24.getClass();
                            LinkedHashSet linkedHashSet = ((qu7) obj24).d;
                            Object obj25 = xqnVar.a;
                            obj25.getClass();
                            boolean z8 = !((qu7) obj25).e;
                            Object obj26 = xqnVar.a;
                            obj26.getClass();
                            if (((qu7) obj26).f) {
                                c = null;
                            } else {
                                bah bahVar = new bah(c5b.a, linkedHashMap2);
                                fx6 fx6Var = (fx6) obj3;
                                linkedHashSet.getClass();
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap3.putAll(fx6Var.b);
                                nsh c2 = fx6Var.a.c();
                                c2.c = linkedHashSet;
                                jp0 a = v5g.K((nuj) obj4, bahVar, new fx6(linkedHashMap3, c2.d())).a();
                                a.a = z8;
                                c = a.c();
                            }
                            if (c != null) {
                                e7e e7eVar5 = e7eVar2;
                                e7eVar5.k = i12;
                                nm6 nm6Var8 = nm6Var;
                                if (rjcVar4.emit(c, e7eVar5) == nm6Var8) {
                                    return nm6Var8;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj14);
                        }
                        return Unit.a;
                    }
                }
                e7eVar = new e7e(this, continuation);
                Object obj142 = e7eVar.j;
                nm6 nm6Var62 = nm6.a;
                i11 = e7eVar.k;
                if (i11 != 0) {
                }
                return Unit.a;
            case 9:
                float floatValue = ((Number) obj5).floatValue();
                z6g z6gVar = (z6g) obj6;
                long h = ((v6k) obj9).h();
                boolean booleanValue = ((Boolean) ((sdr) obj8).getValue()).booleanValue();
                float e = ((cjc) obj7).e();
                v6k v6kVar = z6gVar.e;
                t6k t6kVar = z6gVar.d;
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = uptimeMillis - z6gVar.g;
                if (j < 0) {
                    j = 0;
                }
                if (Math.abs((Math.abs(floatValue - z6gVar.f) * h) - (z6gVar.h ? j * z6gVar.i : 0.0f)) > 750) {
                    float c3 = yhn.c(floatValue, 0.0f, 1.0f);
                    t6kVar.h(c3);
                    v6kVar.i(SystemClock.uptimeMillis());
                    z6gVar.a(c3);
                } else {
                    t6kVar.h(Math.max(z6gVar.b(e, uptimeMillis, h, booleanValue), floatValue));
                    v6kVar.i(uptimeMillis);
                }
                z6gVar.f = floatValue;
                z6gVar.g = uptimeMillis;
                z6gVar.h = booleanValue;
                z6gVar.i = e;
                return Unit.a;
            case 10:
                Cursor query = ((UserDatabase) obj6).j().getWritableDatabase().query(tqi.a);
                try {
                    Cursor cursor = query;
                    n8g b = t75.b();
                    while (cursor.moveToNext()) {
                        b.add(new Object[]{cursor.getString(0), new Integer(cursor.getInt(1))});
                    }
                    n8g a2 = t75.a(b);
                    yd5.q(query, null);
                    MainDatabase mainDatabase = (MainDatabase) obj9;
                    Object N = tyf.N(mainDatabase, new c5h(mainDatabase, (Continuation) null, a2, (d5h) obj8, mainDatabase, (String) obj7), continuation);
                    return N == nm6.a ? N : Unit.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        yd5.q(query, th);
                        throw th2;
                    }
                }
            case 11:
                tqn tqnVar = (tqn) obj9;
                if (continuation instanceof soh) {
                    sohVar = (soh) continuation;
                    int i37 = sohVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        sohVar.k = i37 - Integer.MIN_VALUE;
                        Object obj27 = sohVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i13 = sohVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj27);
                            rjcVar6 = (rjc) obj6;
                            if (!((Boolean) obj5).booleanValue() && !tqnVar.a) {
                                ox1 ox1Var = new ox1((toh) obj7, z4 ? 1 : 0, 29);
                                bsd b2 = dm6.b();
                                sohVar.m = rjcVar6;
                                sohVar.n = 0;
                                sohVar.k = 1;
                                if (x97.V(b2, ox1Var, sohVar) != nm6Var9) {
                                    rjcVar7 = rjcVar6;
                                }
                                return nm6Var9;
                            }
                            sohVar.m = null;
                            sohVar.n = i20;
                            sohVar.k = 2;
                            break;
                        } else {
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    qgg.h0(obj27);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i20 = sohVar.n;
                            rjcVar7 = sohVar.m;
                            qgg.h0(obj27);
                        }
                        tqnVar.a = true;
                        rjcVar6 = rjcVar7;
                        sohVar.m = null;
                        sohVar.n = i20;
                        sohVar.k = 2;
                    }
                }
                sohVar = new soh(this, continuation);
                Object obj272 = sohVar.j;
                nm6 nm6Var92 = nm6.a;
                i13 = sohVar.k;
                if (i13 != 0) {
                }
                tqnVar.a = true;
                rjcVar6 = rjcVar7;
                sohVar.m = null;
                sohVar.n = i20;
                sohVar.k = 2;
                break;
            case 12:
                j7i j7iVar = (j7i) obj9;
                if (continuation instanceof x6i) {
                    x6iVar = (x6i) continuation;
                    int i38 = x6iVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        x6iVar.k = i38 - Integer.MIN_VALUE;
                        Object obj28 = x6iVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i14 = x6iVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj28);
                            rjc rjcVar15 = (rjc) obj6;
                            Pair pair2 = (Pair) obj5;
                            boolean booleanValue2 = ((Boolean) pair2.a).booleanValue();
                            n1p n1pVar = (n1p) pair2.b;
                            if (booleanValue2) {
                                h6pVar = i6p.a;
                            } else {
                                List list9 = j7iVar.F.a;
                                if (list9 == null) {
                                    list9 = c5b.a;
                                }
                                gcc gccVar = new gcc(j7i.K(list9));
                                boolean booleanValue3 = ((Boolean) j7iVar.D.getValue()).booleanValue();
                                bf5 bf5Var = (bf5) obj8;
                                asj asjVar = bf5Var instanceof asj ? (asj) bf5Var : null;
                                a0p a0pVar = (a0p) obj7;
                                h6pVar = new h6p(gccVar, n1pVar, booleanValue3, asjVar != null ? asjVar.e : null, a0pVar.b, a0pVar.c, !a0pVar.e);
                            }
                            x6iVar.k = 1;
                            if (rjcVar15.emit(h6pVar, x6iVar) == nm6Var10) {
                                return nm6Var10;
                            }
                        } else {
                            if (i14 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj28);
                        }
                        return Unit.a;
                    }
                }
                x6iVar = new x6i(this, continuation);
                Object obj282 = x6iVar.j;
                nm6 nm6Var102 = nm6.a;
                i14 = x6iVar.k;
                if (i14 != 0) {
                }
                return Unit.a;
            case 13:
                if (((Boolean) ((sdr) obj9).getValue()).booleanValue()) {
                    return Unit.a;
                }
                Object m = ((fvf) obj6).m(1, -((jx7) obj8).L(((eoe) obj7).d() + edo.b), continuation);
                nm6 nm6Var11 = nm6.a;
                if (m != nm6Var11) {
                    m = Unit.a;
                }
                return m == nm6Var11 ? m : Unit.a;
            case 14:
                n7q n7qVar = (n7q) obj9;
                if (continuation instanceof acn) {
                    acnVar = (acn) continuation;
                    int i39 = acnVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        acnVar.k = i39 - Integer.MIN_VALUE;
                        Object obj29 = acnVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i15 = acnVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj29);
                            rjc rjcVar16 = (rjc) obj6;
                            Pair pair3 = (Pair) obj5;
                            String str13 = (String) pair3.a;
                            String str14 = (String) pair3.b;
                            boolean booleanValue4 = ((Boolean) wdg.A(n7qVar, rwd.b)).booleanValue();
                            c94 c94Var = b94.a;
                            if (booleanValue4) {
                                g08 g08Var = (g08) obj7;
                                int ordinal = ((v84) obj8).ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        if (g08Var instanceof e08) {
                                            z3 = true;
                                        } else if (!(g08Var instanceof f08)) {
                                            b6e.s();
                                            return null;
                                        }
                                        c94Var = new a94(z3);
                                    } else if (ordinal != 2) {
                                        b6e.s();
                                        return null;
                                    }
                                } else if (g08Var instanceof f08) {
                                    c94Var = x84.a;
                                } else {
                                    if (!(g08Var instanceof e08)) {
                                        b6e.s();
                                        return null;
                                    }
                                    c94Var = new w84(((e08) g08Var).b);
                                }
                            }
                            l9n l9nVar = new l9n(str13, str14, c94Var, (k9n) wdg.A(n7qVar, mvn.i), (jxi) wdg.A(n7qVar, d51.j));
                            acnVar.k = 1;
                            if (rjcVar16.emit(l9nVar, acnVar) == nm6Var12) {
                                return nm6Var12;
                            }
                        } else {
                            if (i15 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj29);
                        }
                        return Unit.a;
                    }
                }
                acnVar = new acn(this, continuation);
                Object obj292 = acnVar.j;
                nm6 nm6Var122 = nm6.a;
                i15 = acnVar.k;
                if (i15 != 0) {
                }
                return Unit.a;
            case 15:
                n7q n7qVar2 = (n7q) obj9;
                if (continuation instanceof cdn) {
                    cdnVar = (cdn) continuation;
                    int i40 = cdnVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        cdnVar.k = i40 - Integer.MIN_VALUE;
                        Object obj30 = cdnVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i16 = cdnVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj30);
                            rjc rjcVar17 = (rjc) obj6;
                            Pair pair4 = (Pair) obj5;
                            String str15 = (String) pair4.a;
                            String str16 = (String) pair4.b;
                            if (((Boolean) wdg.A(n7qVar2, kjn.b)).booleanValue()) {
                                uz7 uz7Var = (uz7) obj8;
                                uz7Var.getClass();
                                boolean z9 = uz7Var instanceof tz7;
                                if (uz7Var instanceof sz7) {
                                    d74Var = new d74(R.drawable.ic_cast_24);
                                } else {
                                    if (!z9) {
                                        b6e.s();
                                        return null;
                                    }
                                    d74Var = new d74(((tz7) uz7Var).b);
                                }
                                ildVar = new q84(z9, d74Var);
                            } else {
                                ildVar = r84.m;
                            }
                            bdn bdnVar = new bdn(str15, str16, ildVar, ((Boolean) wdg.A(n7qVar2, mvt.j)).booleanValue(), (Uri) wdg.A(n7qVar2, new e88(19, (ybl) obj7)));
                            cdnVar.k = 1;
                            if (rjcVar17.emit(bdnVar, cdnVar) == nm6Var13) {
                                return nm6Var13;
                            }
                        } else {
                            if (i16 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj30);
                        }
                        return Unit.a;
                    }
                }
                cdnVar = new cdn(this, continuation);
                Object obj302 = cdnVar.j;
                nm6 nm6Var132 = nm6.a;
                i16 = cdnVar.k;
                if (i16 != 0) {
                }
                return Unit.a;
            case 16:
                iru iruVar = (iru) obj5;
                nru nruVar = (nru) obj6;
                if (iruVar instanceof hru) {
                    hsu hsuVar = ((hru) iruVar).a;
                    cvo cvoVar = cvo.i;
                    fxf.Q((y) obj9, o6m.b(wjb.BottomsheetScreen, null, 6), null, "OpenWaveActionsBottomSheet", (pu0) obj8, null, new wn5(new jv(20, hsuVar, nruVar), -607219931, true), 18);
                } else if (iruVar instanceof gru) {
                    gsu gsuVar = ((gru) iruVar).a;
                    cvo cvoVar2 = cvo.i;
                    sk3.V((y) obj9, o6m.b(wjb.BottomsheetScreen, null, 6), new sai(false), (r11 & 4) != 0 ? "BOTTOM_SHEET_DIALOG_TAG" : "OpenWaveRenameBottomSheet", (pu0) obj8, null, new wn5(new jv(21, gsuVar, nruVar), 1926715914, true));
                } else {
                    if (!(iruVar instanceof fru)) {
                        b6e.s();
                        return null;
                    }
                    y5g.n0((Context) obj7, R.string.auto_unknown_error_message, 0);
                }
                return Unit.a;
            case 17:
                return b((int[]) obj5, continuation);
            case 18:
                return c(obj, continuation);
            case 19:
                return d(obj, continuation);
            default:
                pqw pqwVar = (pqw) obj5;
                xqn xqnVar2 = (xqn) obj7;
                xqn xqnVar3 = (xqn) obj8;
                uqw uqwVar = pqwVar.c(((hgw) obj9).b).e;
                uqw l = pqwVar.b.l();
                boolean z10 = ((Boolean) uqwVar.e.getValue()).booleanValue() || uqwVar.equals(xqnVar3.a);
                boolean z11 = ((Boolean) l.e.getValue()).booleanValue() || l.equals(xqnVar2.a);
                xqnVar3.a = uqwVar;
                xqnVar2.a = l;
                fgw fgwVar = new fgw(pqwVar, !z10, !z11);
                if (z10 && z11) {
                    return Unit.a;
                }
                Object emit = ((rjc) obj6).emit(fgwVar, continuation);
                return emit == nm6.a ? emit : Unit.a;
        }
    }

    public pm(rjc rjcVar, yk3 yk3Var, kkp kkpVar, h7e h7eVar, long j) {
        this.a = 7;
        this.b = rjcVar;
        this.c = yk3Var;
        this.d = kkpVar;
        this.e = h7eVar;
    }

    public pm(xqn xqnVar, rjc rjcVar, String[] strArr, int[] iArr) {
        this.a = 17;
        this.c = xqnVar;
        this.b = rjcVar;
        this.d = strArr;
        this.e = iArr;
    }

    public /* synthetic */ pm(Object obj, Object obj2, Object obj3, rjc rjcVar, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = rjcVar;
    }

    public /* synthetic */ pm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public pm(List list, jx7 jx7Var, fvf fvfVar, eoe eoeVar) {
        this.a = 1;
        float f = edo.a;
        this.b = list;
        this.c = jx7Var;
        this.d = fvfVar;
        this.e = eoeVar;
    }
}
