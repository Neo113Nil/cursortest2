package defpackage;

import android.R;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.bullfinch.BullfinchActivity;
import ru.yandex.music.common.activity.TabsViewStub;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.data.sql.YMContentProvider;

/* loaded from: classes5.dex */
public abstract class np2 extends gnb implements sya {
    public static final /* synthetic */ int u = 0;
    public ou0 b;
    public final frt c;
    public le3 d;
    public final rrc e;
    public final dgj f;
    public final un7 g;
    public ip2 h;
    public final jyr i;
    public final jyr j;
    public final o6m k;
    public final lum l;
    public boolean m;
    public final jyr n;
    public final jyr o;
    public boolean p;
    public PlaybackScope q;
    public final jyr r;
    public final jyr s;
    public final jyr t;

    public np2() {
        try {
            l18 l18Var = l18.b;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            this.c = (frt) qdcVar.C(I);
            bdt I2 = hag.I(rrc.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            this.e = (rrc) qdcVar2.C(I2);
            bdt I3 = hag.I(dgj.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            this.f = (dgj) qdcVar3.C(I3);
            bdt I4 = hag.I(un7.class);
            qdc qdcVar4 = l18Var.a;
            qdcVar4.getClass();
            this.g = (un7) qdcVar4.C(I4);
            final int i = 0;
            this.i = btf.b(new Function0(this) { // from class: ep2
                public final /* synthetic */ np2 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            y supportFragmentManager = this.b.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            return new zzf(supportFragmentManager);
                        case 1:
                            np2 np2Var = this.b;
                            l18 l18Var2 = l18.b;
                            bdt I5 = hag.I(b4g.class);
                            qdc qdcVar5 = l18Var2.a;
                            qdcVar5.getClass();
                            b4g b4gVar = (b4g) qdcVar5.C(I5);
                            y supportFragmentManager2 = np2Var.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            e00 e00Var = b4gVar.a;
                            e00Var.getClass();
                            bdt I6 = hag.I(g4g.class);
                            qdc qdcVar6 = e00Var.a;
                            qdcVar6.getClass();
                            g4g g4gVar = (g4g) qdcVar6.C(I6);
                            i4g i4gVar = (i4g) e00Var.b;
                            return new n4g(supportFragmentManager2, g4gVar, (pjc) i4gVar.d.getValue(), (p4g) i4gVar.e.getValue(), i4gVar.f);
                        case 2:
                            np2 np2Var2 = this.b;
                            l18 l18Var3 = l18.b;
                            bdt I7 = hag.I(zza.class);
                            qdc qdcVar7 = l18Var3.a;
                            qdcVar7.getClass();
                            return ((zza) qdcVar7.C(I7)).b(np2Var2);
                        default:
                            String canonicalName = this.b.getClass().getCanonicalName();
                            canonicalName.getClass();
                            l18 l18Var4 = l18.b;
                            return new qke(canonicalName, l18Var4.b(hag.I(tke.class), true), l18Var4.b(hag.I(mle.class), true));
                    }
                }
            });
            final int i2 = 1;
            this.j = btf.b(new Function0(this) { // from class: ep2
                public final /* synthetic */ np2 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            y supportFragmentManager = this.b.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            return new zzf(supportFragmentManager);
                        case 1:
                            np2 np2Var = this.b;
                            l18 l18Var2 = l18.b;
                            bdt I5 = hag.I(b4g.class);
                            qdc qdcVar5 = l18Var2.a;
                            qdcVar5.getClass();
                            b4g b4gVar = (b4g) qdcVar5.C(I5);
                            y supportFragmentManager2 = np2Var.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            e00 e00Var = b4gVar.a;
                            e00Var.getClass();
                            bdt I6 = hag.I(g4g.class);
                            qdc qdcVar6 = e00Var.a;
                            qdcVar6.getClass();
                            g4g g4gVar = (g4g) qdcVar6.C(I6);
                            i4g i4gVar = (i4g) e00Var.b;
                            return new n4g(supportFragmentManager2, g4gVar, (pjc) i4gVar.d.getValue(), (p4g) i4gVar.e.getValue(), i4gVar.f);
                        case 2:
                            np2 np2Var2 = this.b;
                            l18 l18Var3 = l18.b;
                            bdt I7 = hag.I(zza.class);
                            qdc qdcVar7 = l18Var3.a;
                            qdcVar7.getClass();
                            return ((zza) qdcVar7.C(I7)).b(np2Var2);
                        default:
                            String canonicalName = this.b.getClass().getCanonicalName();
                            canonicalName.getClass();
                            l18 l18Var4 = l18.b;
                            return new qke(canonicalName, l18Var4.b(hag.I(tke.class), true), l18Var4.b(hag.I(mle.class), true));
                    }
                }
            });
            this.k = new o6m(6);
            m5 m5Var = new m5(1, this, np2.class, "userChanged", "userChanged(Lcom/yandex/music/shared/auth/api/FullUserInfo;)V", 0, 22);
            lum lumVar = new lum();
            lumVar.a = m5Var;
            lumVar.b = l18.b.b(hag.I(frt.class), false);
            this.l = lumVar;
            this.n = l18Var.b(hag.I(g3m.class), true);
            this.o = l18Var.b(hag.I(zju.class), true);
            this.r = btf.b(new uu1(21));
            final int i3 = 2;
            this.s = btf.b(new Function0(this) { // from class: ep2
                public final /* synthetic */ np2 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            y supportFragmentManager = this.b.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            return new zzf(supportFragmentManager);
                        case 1:
                            np2 np2Var = this.b;
                            l18 l18Var2 = l18.b;
                            bdt I5 = hag.I(b4g.class);
                            qdc qdcVar5 = l18Var2.a;
                            qdcVar5.getClass();
                            b4g b4gVar = (b4g) qdcVar5.C(I5);
                            y supportFragmentManager2 = np2Var.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            e00 e00Var = b4gVar.a;
                            e00Var.getClass();
                            bdt I6 = hag.I(g4g.class);
                            qdc qdcVar6 = e00Var.a;
                            qdcVar6.getClass();
                            g4g g4gVar = (g4g) qdcVar6.C(I6);
                            i4g i4gVar = (i4g) e00Var.b;
                            return new n4g(supportFragmentManager2, g4gVar, (pjc) i4gVar.d.getValue(), (p4g) i4gVar.e.getValue(), i4gVar.f);
                        case 2:
                            np2 np2Var2 = this.b;
                            l18 l18Var3 = l18.b;
                            bdt I7 = hag.I(zza.class);
                            qdc qdcVar7 = l18Var3.a;
                            qdcVar7.getClass();
                            return ((zza) qdcVar7.C(I7)).b(np2Var2);
                        default:
                            String canonicalName = this.b.getClass().getCanonicalName();
                            canonicalName.getClass();
                            l18 l18Var4 = l18.b;
                            return new qke(canonicalName, l18Var4.b(hag.I(tke.class), true), l18Var4.b(hag.I(mle.class), true));
                    }
                }
            });
            final int i4 = 3;
            this.t = btf.b(new Function0(this) { // from class: ep2
                public final /* synthetic */ np2 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            y supportFragmentManager = this.b.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            return new zzf(supportFragmentManager);
                        case 1:
                            np2 np2Var = this.b;
                            l18 l18Var2 = l18.b;
                            bdt I5 = hag.I(b4g.class);
                            qdc qdcVar5 = l18Var2.a;
                            qdcVar5.getClass();
                            b4g b4gVar = (b4g) qdcVar5.C(I5);
                            y supportFragmentManager2 = np2Var.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            e00 e00Var = b4gVar.a;
                            e00Var.getClass();
                            bdt I6 = hag.I(g4g.class);
                            qdc qdcVar6 = e00Var.a;
                            qdcVar6.getClass();
                            g4g g4gVar = (g4g) qdcVar6.C(I6);
                            i4g i4gVar = (i4g) e00Var.b;
                            return new n4g(supportFragmentManager2, g4gVar, (pjc) i4gVar.d.getValue(), (p4g) i4gVar.e.getValue(), i4gVar.f);
                        case 2:
                            np2 np2Var2 = this.b;
                            l18 l18Var3 = l18.b;
                            bdt I7 = hag.I(zza.class);
                            qdc qdcVar7 = l18Var3.a;
                            qdcVar7.getClass();
                            return ((zza) qdcVar7.C(I7)).b(np2Var2);
                        default:
                            String canonicalName = this.b.getClass().getCanonicalName();
                            canonicalName.getClass();
                            l18 l18Var4 = l18.b;
                            return new qke(canonicalName, l18Var4.b(hag.I(tke.class), true), l18Var4.b(hag.I(mle.class), true));
                    }
                }
            });
        } catch (NullPointerException e) {
            throw new IllegalStateException(vz1.p("Di not initialized in Activity. Process=", Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "unknown", "; isMainProcess=", YMContentProvider.a), e);
        }
    }

    @Override // defpackage.hq0, androidx.core.app.i, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        this.k.getClass();
        keyEvent.getClass();
        return (keyEvent.getKeyCode() == 82 && keyEvent.getAction() == 1) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            ssg.a(6, null, "dispatchTouchEvent error", e);
            return false;
        }
    }

    public fii k() {
        Intent intent = getIntent();
        intent.getClass();
        return new bz2(this, intent.getBooleanExtra("extraFromUrlScheme", false), 9);
    }

    public final ke3 l() {
        le3 le3Var = this.d;
        if (le3Var != null) {
            return le3Var;
        }
        Assertions.throwOrSkip("BaseActivity", new FailedAssertionException("mBottomNavigationPlugin was not initialized"));
        return new e3s(28);
    }

    public boolean m() {
        return this instanceof BullfinchActivity;
    }

    public boolean n() {
        return ((hrq) ((byb) l18.b.c(hag.I(byb.class))).b(hrq.class)).h();
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if ("Can not perform this action after onSaveInstanceState".equals(e.getMessage())) {
                ssg.a(7, "BaseActivity", "state loss", e);
            } else {
                Assertions.throwOrSkip("BaseActivity", new FailedAssertionException("other than state loss", e));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x006a, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    @Override // defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        dqg dqgVar;
        String language;
        ou0.a.getClass();
        ou0 Z = klx.Z(this);
        this.b = Z;
        setTheme(v(Z));
        hag.k(this);
        g3m g3mVar = (g3m) this.n.getValue();
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        g3mVar.getClass();
        otc J = supportFragmentManager.J();
        J.getClass();
        supportFragmentManager.B = new f3m(g3mVar, J);
        super.onCreate(bundle);
        nyf lifecycle = getLifecycle();
        lifecycle.getClass();
        lifecycle.a(new jzf());
        un7 un7Var = this.g;
        un7Var.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 33) {
                Object c = rq0.c();
                if (c != null) {
                    dqgVar = dqg.d(qq0.a(c));
                    if (dqgVar.c()) {
                        rdb rdbVar = htr.l;
                        ArrayList arrayList = new ArrayList(v75.o(rdbVar, 10));
                        Iterator it = rdbVar.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((htr) it.next()).a);
                        }
                        Set A0 = CollectionsKt.A0(arrayList);
                        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                        dqg d = dqg.d(LocaleList.getDefault());
                        int size = d.a.a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Locale b = d.b(i2);
                            if (b != null && (language = b.getLanguage()) != null) {
                                linkedHashSet.add(language);
                            }
                        }
                        Set set = A0;
                        if (CollectionsKt.U(set, linkedHashSet).isEmpty()) {
                            quk qukVar = htr.f;
                            if (!linkedHashSet.isEmpty()) {
                                for (String str : linkedHashSet) {
                                    qukVar.getClass();
                                    str.getClass();
                                    int hashCode = str.hashCode();
                                    if (hashCode != 3139) {
                                        if (hashCode != 3645) {
                                            if (hashCode == 3734 && str.equals("uk")) {
                                                Locale locale = new Locale("ru");
                                                ot0.A(un7Var.a, "app_locale_switch", uah.e(new Pair("system_languages", CollectionsKt.X(linkedHashSet, null, null, null, null, 63)), new Pair("supported_languages", CollectionsKt.X(set, null, null, null, null, 63)), new Pair("target", locale.getLanguage())));
                                                dqg d2 = dqg.d(new LocaleList(locale));
                                                if (Build.VERSION.SDK_INT >= 33) {
                                                    Object c2 = rq0.c();
                                                    if (c2 != null) {
                                                        qq0.b(c2, pq0.a(d2.a.a.toLanguageTags()));
                                                    }
                                                } else if (!d2.equals(rq0.c)) {
                                                    synchronized (rq0.h) {
                                                        rq0.c = d2;
                                                        rq0.b();
                                                    }
                                                }
                                            }
                                        } else if (str.equals("ro")) {
                                            Locale locale2 = new Locale("ru");
                                            ot0.A(un7Var.a, "app_locale_switch", uah.e(new Pair("system_languages", CollectionsKt.X(linkedHashSet, null, null, null, null, 63)), new Pair("supported_languages", CollectionsKt.X(set, null, null, null, null, 63)), new Pair("target", locale2.getLanguage())));
                                            dqg d22 = dqg.d(new LocaleList(locale2));
                                            if (Build.VERSION.SDK_INT >= 33) {
                                            }
                                        }
                                    } else if (str.equals("be")) {
                                        Locale locale22 = new Locale("ru");
                                        ot0.A(un7Var.a, "app_locale_switch", uah.e(new Pair("system_languages", CollectionsKt.X(linkedHashSet, null, null, null, null, 63)), new Pair("supported_languages", CollectionsKt.X(set, null, null, null, null, 63)), new Pair("target", locale22.getLanguage())));
                                        dqg d222 = dqg.d(new LocaleList(locale22));
                                        if (Build.VERSION.SDK_INT >= 33) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                dqgVar = dqg.b;
                if (dqgVar.c()) {
                }
            } else {
                dqgVar = rq0.c;
            }
        }
        if (!this.m) {
            s(bundle);
        }
        ox6.B(zsd.b0(zsd.M0(new kp2(v3g.D(this.c), 0), new l1((Continuation) null, this, 8))), wyf.F(getLifecycle()), new ri(19, this));
        sqi.b = (sqi.c || sqi.a) ? false : true;
        sqi.c = true;
        ssg.a(4, "BaseActivity", "initializeEasyLogin activity launcher ".concat(((h0b) this.s.getValue()).getClass().getSimpleName()), null);
        View findViewById = findViewById(R.id.content);
        findViewById.getClass();
        qdq.d(findViewById, true, false, true, false);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onDestroy() {
        ((pke) this.t.getValue()).onDestroy();
        this.f.e.remove(this.h);
        super.onDestroy();
    }

    @Override // defpackage.hq0, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        rrc rrcVar = this.e;
        if (i == 24) {
            i8l i8lVar = (i8l) rrcVar.a.invoke();
            if (i8lVar != null) {
                i8lVar.F(1);
                return true;
            }
        } else if (i != 25) {
            rrcVar.getClass();
        } else {
            i8l i8lVar2 = (i8l) rrcVar.a.invoke();
            if (i8lVar2 != null) {
                i8lVar2.N(1);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.hq0, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    @Override // defpackage.gnb, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        dyd dydVar;
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        le3 le3Var = this.d;
        if (le3Var == null || (dydVar = (dyd) le3Var.b) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("key.intent.action.executed", dydVar.c);
        dydVar.d(bundle2, dydVar.b);
        bundle.putBundle(dydVar.a, bundle2);
    }

    @Override // defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        Continuation continuation = null;
        if (((Boolean) this.r.getValue()).booleanValue()) {
            n4g n4gVar = (n4g) this.j.getValue();
            n4gVar.f = x97.y(n4gVar.e, null, null, new j4g(n4gVar, continuation, 0), 3);
        } else {
            zzf zzfVar = (zzf) this.i.getValue();
            int ordinal = ((vzf) zzfVar.c.getValue()).a().ordinal();
            if (ordinal == 0) {
                qld.I(1000L, new v1e(26, zzfVar));
            } else if (ordinal == 1) {
                rar rarVar = zzfVar.d;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                njf njfVar = new njf(zsd.b0(((t3g) zzfVar.b.getValue()).c), zzfVar, 2);
                bsd b = dm6.b();
                g.a.getClass();
                b.getClass();
                zzfVar.d = ox6.B(njfVar, new tf6(b), new otd(21, zzfVar));
            } else if (ordinal != 2) {
                b6e.s();
                return;
            }
        }
        lum lumVar = this.l;
        za8 m = q6k.m(((frt) ((jyr) lumVar.b).getValue()).j(), new h4t(21), q6k.g);
        bsd b2 = dm6.b();
        g.a.getClass();
        b2.getClass();
        lumVar.c = ox6.B(m, new tf6(b2), new lot(1, lumVar));
        this.f.a();
        ((pke) this.t.getValue()).b();
    }

    @Override // defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onStop() {
        ((pke) this.t.getValue()).onStop();
        super.onStop();
        if (((Boolean) this.r.getValue()).booleanValue()) {
            rar rarVar = ((n4g) this.j.getValue()).f;
            if (rarVar != null) {
                rarVar.g(null);
            }
        } else {
            rar rarVar2 = ((zzf) this.i.getValue()).d;
            if (rarVar2 != null) {
                rarVar2.g(null);
            }
        }
        rar rarVar3 = (rar) this.l.c;
        if (rarVar3 != null) {
            rarVar3.g(null);
        }
    }

    @Override // defpackage.hq0
    public boolean onSupportNavigateUp() {
        supportFinishAfterTransition();
        return super.onSupportNavigateUp();
    }

    public final void p() {
        if (this.p) {
            dfi.r("View already set", "BaseActivity");
        }
        this.m = true;
    }

    public int q() {
        return ru.yandex.music.R.layout.base_activity;
    }

    public final PlaybackScope r() {
        PlaybackScope playbackScope = this.q;
        if (playbackScope == null || playbackScope.equals(PlaybackScope.a)) {
            Intent intent = getIntent();
            intent.getClass();
            a aVar = PlaybackScope.a;
            aVar.getClass();
            this.q = sj2.w(intent, aVar);
        }
        PlaybackScope playbackScope2 = this.q;
        playbackScope2.getClass();
        return playbackScope2;
    }

    public void s(Bundle bundle) {
        np2 np2Var;
        Bundle bundle2;
        setContentView(q());
        TabsViewStub tabsViewStub = (TabsViewStub) findViewById(ru.yandex.music.R.id.bottom_tabs);
        dyd dydVar = null;
        dydVar = null;
        if (tabsViewStub == null) {
            np2Var = this;
        } else {
            if (this.b == null) {
                Intrinsics.j("appTheme");
                throw null;
            }
            ViewParent parent = tabsViewStub.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                xq0.q("ViewStub must have a non-null ViewGroup viewParent");
                return;
            }
            getResources().getConfiguration().getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            np2Var = this;
            kii kiiVar = new kii(np2Var, null, 0, 6, null);
            int indexOfChild = viewGroup.indexOfChild(tabsViewStub);
            viewGroup.removeViewInLayout(tabsViewStub);
            viewGroup.addView(kiiVar, indexOfChild);
        }
        kii kiiVar2 = (kii) findViewById(ru.yandex.music.R.id.bottom_tabs);
        l18 l18Var = l18.b;
        bdt I = hag.I(wst.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        wst wstVar = (wst) qdcVar.C(I);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        le3 le3Var = new le3();
        le3Var.a = kiiVar2;
        if (kiiVar2 != null) {
            kiiVar2.setTabsProvider(new n(4, wstVar));
        }
        if (bundle != null && (bundle2 = bundle.getBundle("HighlightBottomTabAction.tab.current")) != null) {
            rf3 rf3Var = (rf3) bundle2.getSerializable("CurrentTabHighlighter.key.tab");
            dyd dydVar2 = new dyd(rf3Var != null ? new dw6(rf3Var) : null);
            dydVar2.c = bundle2.getBoolean("key.intent.action.executed", false);
            dydVar = dydVar2;
        }
        if (kiiVar2 != null && dydVar != null && !dydVar.c) {
            dw6 dw6Var = (dw6) dydVar.b;
            dw6Var.getClass();
            rf3 rf3Var2 = dw6Var.a;
            kiiVar2.getClass();
            rf3Var2.getClass();
            kiiVar2.t(rf3Var2, true);
            dydVar.c = true;
        }
        le3Var.b = dydVar;
        fii k = k();
        if (kiiVar2 != null) {
            kiiVar2.setNavigationListener(k);
        }
        ip2 ip2Var = new ip2(le3Var);
        dgj dgjVar = np2Var.f;
        dgjVar.getClass();
        dgjVar.e.add(ip2Var);
        dgjVar.a();
        np2Var.d = le3Var;
        np2Var.h = ip2Var;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr) {
        intentArr.getClass();
        x((Intent[]) Arrays.copyOf(intentArr, intentArr.length));
        for (Intent intent : intentArr) {
            v3g.x(this, intent);
        }
        super.startActivities(intentArr);
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        x(intent);
        v3g.x(this, intent);
        super.startActivityForResult(intent, i);
    }

    public void t(boolean z) {
        if (z) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) BullfinchActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    public final void u(rf3 rf3Var) {
        rf3Var.getClass();
        le3 le3Var = this.d;
        le3Var.getClass();
        le3Var.b(rf3Var);
    }

    public int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? ru.yandex.music.R.style.AppTheme_EdgeToEdge : ru.yandex.music.R.style.AppTheme_Dark_EdgeToEdge;
    }

    public void w(yxc yxcVar) {
        drt drtVar;
        drt drtVar2;
        if (!m() && (yxcVar == null || (drtVar2 = yxcVar.a) == null || !drtVar2.d)) {
            finish();
            return;
        }
        if (yxcVar == null || (drtVar = yxcVar.a) == null || !drtVar.d || n() || yxcVar.h) {
            return;
        }
        finish();
    }

    public final void x(Intent... intentArr) {
        le3 le3Var;
        Intent intent = getIntent();
        intent.getClass();
        boolean booleanExtra = intent.getBooleanExtra("extraFromUrlScheme", false);
        for (Intent intent2 : intentArr) {
            intent2.getClass();
            if (sj2.C(this, intent2) && (le3Var = this.d) != null) {
                le3Var.y(intent2);
            }
            if (booleanExtra) {
                intent2.putExtra("extraFromUrlScheme", true);
            }
        }
    }

    @Override // defpackage.gnb, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        intentArr.getClass();
        x((Intent[]) Arrays.copyOf(intentArr, intentArr.length));
        for (Intent intent : intentArr) {
            v3g.x(this, intent);
        }
        super.startActivities(intentArr, bundle);
    }
}
