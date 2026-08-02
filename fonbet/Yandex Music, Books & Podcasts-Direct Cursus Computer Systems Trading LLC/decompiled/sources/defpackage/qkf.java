package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.music.myvibe.settings.ui.view.LandingWaveSettingMoodView;
import com.yandex.music.myvibe.settings.ui.view.LandingWaveSettingsDiversityView;
import com.yandex.music.myvibe.settings.ui.view.YaRotatingProgress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qkf extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zkf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkf(Continuation continuation, zkf zkfVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = zkfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                qkf qkfVar = new qkf(continuation, this.l, 0);
                qkfVar.k = obj;
                return qkfVar;
            default:
                qkf qkfVar2 = new qkf(continuation, this.l, 1);
                qkfVar2.k = obj;
                return qkfVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((qkf) create(obj, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        boolean z;
        Iterator it;
        ?? r16;
        ArrayList arrayList2;
        char c;
        ValueAnimator valueAnimator;
        int i = this.j;
        final zkf zkfVar = this.l;
        char c2 = 2;
        ValueAnimator valueAnimator2 = null;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                Object obj2 = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                clf clfVar = (clf) obj2;
                if (clfVar instanceof alf) {
                    alf alfVar = (alf) clfVar;
                    final List list = alfVar.a;
                    ahn ahnVar = alfVar.b;
                    list.getClass();
                    ahnVar.getClass();
                    Map map = ahnVar.a;
                    Map map2 = ahnVar.b;
                    int i4 = 8;
                    if (map.isEmpty() && list.isEmpty()) {
                        ((TextView) zkfVar.c.a(zkf.q[0])).setVisibility(8);
                        zkfVar.c().setVisibility(8);
                        for (l7o l7oVar : zkfVar.a()) {
                            l7oVar.a.setVisibility(8);
                            l7oVar.a(8);
                        }
                        zkfVar.b().setVisibility(8);
                        ((YaRotatingProgress) zkfVar.k.a(zkf.q[6])).setVisibility(0);
                    } else {
                        zgn zgnVar = (zgn) map2.get("language");
                        wgn wgnVar = (wgn) map.get("language");
                        if (wgnVar != null) {
                            ArrayList arrayList3 = wgnVar.b;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (obj3 instanceof xgn) {
                                    arrayList4.add(obj3);
                                }
                            }
                            arrayList = new ArrayList(v75.o(arrayList4, 10));
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                xgn xgnVar = (xgn) it2.next();
                                arrayList.add(new ufn(xgnVar, Intrinsics.d(xgnVar, zgnVar)));
                                c2 = c2;
                            }
                        } else {
                            arrayList = null;
                        }
                        char c3 = c2;
                        final List list2 = arrayList;
                        if (arrayList == null) {
                            list2 = c5b.a;
                        }
                        TextView textView = (TextView) zkfVar.e.a(zkf.q[c3]);
                        wgn wgnVar2 = (wgn) map.get("language");
                        textView.setText(wgnVar2 != null ? wgnVar2.a : null);
                        zkfVar.i.d.b(list2, new Runnable() { // from class: wkf
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5;
                                switch (i3) {
                                    case 0:
                                        List list3 = list2;
                                        boolean z2 = !list3.isEmpty();
                                        zkf zkfVar2 = zkfVar;
                                        wxf.K(zkfVar2.e(), z2);
                                        wxf.K((TextView) zkfVar2.e.a(zkf.q[2]), z2);
                                        Iterator it3 = list3.iterator();
                                        int i6 = 0;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                i6 = -1;
                                            } else if (!((ufn) it3.next()).b) {
                                                i6++;
                                            }
                                        }
                                        Integer valueOf = Integer.valueOf(i6);
                                        if (i6 < 0) {
                                            valueOf = null;
                                        }
                                        if (valueOf != null) {
                                            zkfVar2.e().z0(valueOf.intValue());
                                            break;
                                        }
                                        break;
                                    default:
                                        List list4 = list2;
                                        boolean z3 = !list4.isEmpty();
                                        zkf zkfVar3 = zkfVar;
                                        wxf.K(zkfVar3.d(), z3);
                                        wxf.K(zkfVar3.c(), z3);
                                        Iterator it4 = list4.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                nfn nfnVar = (nfn) it4.next();
                                                i5 = (nfnVar.b || nfnVar.a.f) ? 0 : i5 + 1;
                                            } else {
                                                i5 = -1;
                                            }
                                        }
                                        Integer valueOf2 = Integer.valueOf(i5);
                                        if (i5 < 0) {
                                            valueOf2 = null;
                                        }
                                        if (valueOf2 != null) {
                                            zkfVar3.d().z0(valueOf2.intValue());
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        zkfVar.p = list;
                        zkfVar.h.d.b(list, new Runnable() { // from class: wkf
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5;
                                switch (i2) {
                                    case 0:
                                        List list3 = list;
                                        boolean z2 = !list3.isEmpty();
                                        zkf zkfVar2 = zkfVar;
                                        wxf.K(zkfVar2.e(), z2);
                                        wxf.K((TextView) zkfVar2.e.a(zkf.q[2]), z2);
                                        Iterator it3 = list3.iterator();
                                        int i6 = 0;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                i6 = -1;
                                            } else if (!((ufn) it3.next()).b) {
                                                i6++;
                                            }
                                        }
                                        Integer valueOf = Integer.valueOf(i6);
                                        if (i6 < 0) {
                                            valueOf = null;
                                        }
                                        if (valueOf != null) {
                                            zkfVar2.e().z0(valueOf.intValue());
                                            break;
                                        }
                                        break;
                                    default:
                                        List list4 = list;
                                        boolean z3 = !list4.isEmpty();
                                        zkf zkfVar3 = zkfVar;
                                        wxf.K(zkfVar3.d(), z3);
                                        wxf.K(zkfVar3.c(), z3);
                                        Iterator it4 = list4.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                nfn nfnVar = (nfn) it4.next();
                                                i5 = (nfnVar.b || nfnVar.a.f) ? 0 : i5 + 1;
                                            } else {
                                                i5 = -1;
                                            }
                                        }
                                        Integer valueOf2 = Integer.valueOf(i5);
                                        if (i5 < 0) {
                                            valueOf2 = null;
                                        }
                                        if (valueOf2 != null) {
                                            zkfVar3.d().z0(valueOf2.intValue());
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        zkfVar.g(false);
                        if (!Intrinsics.d(zkfVar.o, map)) {
                            zkfVar.o = map;
                            Iterator it3 = map.entrySet().iterator();
                            int i5 = 0;
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    ?? r162 = valueAnimator2;
                                    u75.n();
                                    throw r162;
                                }
                                Map.Entry entry = (Map.Entry) next;
                                String str = (String) entry.getKey();
                                wgn wgnVar3 = (wgn) entry.getValue();
                                l7o l7oVar2 = (l7o) CollectionsKt.S(zkfVar.a(), i5);
                                if (l7oVar2 != null) {
                                    ykf ykfVar = new ykf(i3, zkfVar);
                                    TextView textView2 = l7oVar2.a;
                                    wgnVar3.getClass();
                                    str.getClass();
                                    l7oVar2.b = str;
                                    r16 = valueAnimator2;
                                    ArrayList C = b85.C(wgnVar3.b, xgn.class);
                                    if (C.isEmpty()) {
                                        it = it3;
                                        int i7 = i4;
                                        textView2.setVisibility(i7);
                                        l7oVar2.a(i7);
                                    } else {
                                        textView2.setVisibility(i3);
                                        l7oVar2.a(i3);
                                        String lowerCase = wgnVar3.a.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        textView2.setText(lowerCase);
                                        int i8 = i3;
                                        for (Object obj4 : l7oVar2.e) {
                                            int i9 = i8 + 1;
                                            if (i8 < 0) {
                                                u75.n();
                                                throw r16;
                                            }
                                            final m7o m7oVar = (m7o) obj4;
                                            final String str2 = l7oVar2.b;
                                            final ucm ucmVar = new ucm(15, ykfVar);
                                            m7oVar.getClass();
                                            final xgn xgnVar2 = (xgn) CollectionsKt.S(C, i8);
                                            m7oVar.b = xgnVar2;
                                            mkf mkfVar = m7oVar.a;
                                            Iterator it4 = it3;
                                            if (xgnVar2 != null) {
                                                String str3 = xgnVar2.d;
                                                if (str2 != null) {
                                                    arrayList2 = C;
                                                    mkfVar.setVisibility(0);
                                                    mkfVar.setOnTouchListener(new View.OnTouchListener() { // from class: k7o
                                                        @Override // android.view.View.OnTouchListener
                                                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                            mkf mkfVar2 = m7o.this.a;
                                                            int action = motionEvent.getAction();
                                                            if (action == 0) {
                                                                mkfVar2.b();
                                                                return true;
                                                            }
                                                            if (action == 1) {
                                                                mkfVar2.getClass();
                                                                mkfVar2.b = kkf.b;
                                                                mkfVar2.c(true);
                                                                ucmVar.invoke(str2, xgnVar2);
                                                                return true;
                                                            }
                                                            if (action != 3) {
                                                                return true;
                                                            }
                                                            mkfVar2.getClass();
                                                            mkfVar2.b = kkf.c;
                                                            mkfVar2.c(false);
                                                            return true;
                                                        }
                                                    });
                                                    mkfVar.setName(xgnVar2.a);
                                                    mkfVar.setPosition(i8);
                                                    if (mkfVar instanceof LandingWaveSettingsDiversityView) {
                                                        bfg.H(((LandingWaveSettingsDiversityView) mkfVar).getIcon(), str3);
                                                    } else if (mkfVar instanceof LandingWaveSettingMoodView) {
                                                        bfg.H(((LandingWaveSettingMoodView) mkfVar).getIcon(), str3);
                                                    }
                                                    c = '\b';
                                                    i8 = i9;
                                                    it3 = it4;
                                                    C = arrayList2;
                                                }
                                            }
                                            arrayList2 = C;
                                            c = '\b';
                                            mkfVar.setVisibility(8);
                                            i8 = i9;
                                            it3 = it4;
                                            C = arrayList2;
                                        }
                                        it = it3;
                                    }
                                } else {
                                    it = it3;
                                    r16 = valueAnimator2;
                                }
                                i5 = i6;
                                valueAnimator2 = r16;
                                it3 = it;
                                i3 = 0;
                                i4 = 8;
                            }
                            List a = zkfVar.a();
                            int size = zkfVar.a().size() - map.size();
                            if (size < 0) {
                                size = 0;
                            }
                            for (l7o l7oVar3 : CollectionsKt.r0(a, size)) {
                                l7oVar3.a.setVisibility(8);
                                l7oVar3.a(8);
                            }
                        }
                        if (!Intrinsics.d(zkfVar.n, map2)) {
                            zkfVar.n = map2;
                            for (l7o l7oVar4 : zkfVar.a()) {
                                zgn zgnVar2 = (zgn) map2.get(l7oVar4.b);
                                mmo mmoVar = l7oVar4.d;
                                for (m7o m7oVar2 : l7oVar4.e) {
                                    mkf mkfVar2 = m7oVar2.a;
                                    xgn xgnVar3 = m7oVar2.b;
                                    if (xgnVar3 == null || !xgnVar3.equals(zgnVar2)) {
                                        mkfVar2.setBorderActivated(false);
                                        mmoVar.getClass();
                                        ((HashSet) mmoVar.b).remove(mkfVar2);
                                    } else {
                                        mkfVar2.setBorderActivated(true);
                                        mmoVar.getClass();
                                        ((HashSet) mmoVar.b).add(mkfVar2);
                                    }
                                }
                            }
                        }
                        List list3 = list;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                if (((nfn) it5.next()).b) {
                                    z = true;
                                    zkfVar.b().setEnabled(z);
                                }
                            }
                        }
                        Collection values = map2.values();
                        if (!(values instanceof Collection) || !values.isEmpty()) {
                            Iterator it6 = values.iterator();
                            while (it6.hasNext()) {
                                if (((zgn) it6.next()) instanceof xgn) {
                                    z = true;
                                    zkfVar.b().setEnabled(z);
                                }
                            }
                        }
                        z = false;
                        zkfVar.b().setEnabled(z);
                    }
                } else {
                    if (!Intrinsics.d(clfVar, blf.a)) {
                        b6e.s();
                        return null;
                    }
                    s9f[] s9fVarArr = zkf.q;
                    zkfVar.g(true);
                }
                return Unit.a;
            default:
                Object obj5 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                boolean booleanValue = ((Boolean) obj5).booleanValue();
                mmo mmoVar2 = zkfVar.a;
                if (booleanValue) {
                    ValueAnimator valueAnimator3 = (ValueAnimator) mmoVar2.c;
                    if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                        ValueAnimator valueAnimator4 = (ValueAnimator) mmoVar2.d;
                        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                            valueAnimator2 = valueAnimator4;
                        }
                        ValueAnimator ofInt = ValueAnimator.ofInt(KotlinVersion.MAX_COMPONENT_VALUE, 77);
                        ofInt.setRepeatMode(2);
                        ofInt.setRepeatCount(-1);
                        ofInt.setDuration(800L);
                        ofInt.addUpdateListener((hr2) mmoVar2.e);
                        ofInt.addListener((ahg) mmoVar2.f);
                        mmoVar2.c = ofInt;
                        if (valueAnimator2 != null) {
                            valueAnimator2.addListener(new i4a(2, ofInt));
                        } else {
                            ofInt.start();
                        }
                    }
                } else {
                    ValueAnimator valueAnimator5 = (ValueAnimator) mmoVar2.d;
                    if ((valueAnimator5 == null || !valueAnimator5.isRunning()) && (valueAnimator = (ValueAnimator) mmoVar2.c) != null) {
                        if (!valueAnimator.isRunning()) {
                            valueAnimator = null;
                        }
                        if (valueAnimator != null) {
                            mmoVar2.c = null;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            int intValue = ((Integer) animatedValue).intValue();
                            valueAnimator.cancel();
                            ValueAnimator valueAnimator6 = (ValueAnimator) mmoVar2.d;
                            if (valueAnimator6 != null) {
                                valueAnimator6.cancel();
                            }
                            ValueAnimator ofInt2 = ValueAnimator.ofInt(intValue, KotlinVersion.MAX_COMPONENT_VALUE);
                            ofInt2.setRepeatCount(0);
                            ofInt2.setDuration((long) ((1.0f - (intValue / 255.0f)) * 800));
                            ofInt2.addUpdateListener((hr2) mmoVar2.e);
                            ofInt2.addListener((ahg) mmoVar2.g);
                            ofInt2.start();
                            mmoVar2.d = ofInt2;
                        }
                    }
                }
                return Unit.a;
        }
    }
}
