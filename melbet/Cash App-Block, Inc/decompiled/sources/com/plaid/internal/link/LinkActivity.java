package com.plaid.internal.link;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowMetrics;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.face.internal.zzm;
import com.plaid.internal.AbstractActivityC0291t4;
import com.plaid.internal.AbstractC0282s4;
import com.plaid.internal.AbstractC0341z0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0200j2;
import com.plaid.internal.C0209k2;
import com.plaid.internal.C0218l2;
import com.plaid.internal.C0241n7;
import com.plaid.internal.C0300u4;
import com.plaid.internal.C0345z4;
import com.plaid.internal.C1;
import com.plaid.internal.C3;
import com.plaid.internal.D6;
import com.plaid.internal.E3;
import com.plaid.internal.EnumC0151d7;
import com.plaid.internal.EnumC0170g;
import com.plaid.internal.F6;
import com.plaid.internal.G1;
import com.plaid.internal.G2;
import com.plaid.internal.J5;
import com.plaid.internal.J6;
import com.plaid.internal.L2;
import com.plaid.internal.P7;
import com.plaid.internal.U0;
import com.plaid.internal.X7;
import com.plaid.internal.Y6;
import com.plaid.internal.p8;
import com.plaid.internal.v8;
import com.plaid.internal.w8;
import com.plaid.link.Plaid;
import com.plaid.link.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/link/LinkActivity;", "Lcom/plaid/internal/t4;", "Lcom/plaid/internal/w8;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class LinkActivity extends AbstractActivityC0291t4 implements w8 {
    public static final /* synthetic */ int e = 0;
    public final ViewModelLazy c;
    public final ViewModelLazy d;

    @DebugMetadata(c = "com.plaid.internal.link.LinkActivity$onBackPressed$1", f = "LinkActivity.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkActivity.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return LinkActivity.this.new a((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0200j2 c0200j2 = (C0200j2) LinkActivity.this.c.getValue();
                this.a = 1;
                obj = c0200j2.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                LinkActivity.super.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AbstractC0341z0, Unit> {
        public b(LinkActivity linkActivity) {
            super(1, 0, LinkActivity.class, linkActivity, "navigate", "navigate(Lcom/plaid/internal/workflow/model/Destination;)V");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            AbstractC0341z0 abstractC0341z0 = (AbstractC0341z0) obj;
            abstractC0341z0.getClass();
            LinkActivity linkActivity = (LinkActivity) this.receiver;
            int i = LinkActivity.e;
            linkActivity.a(abstractC0341z0);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0<ViewModelProvider$Factory> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new C0300u4(((C0200j2) LinkActivity.this.c.getValue()).a);
        }
    }

    public static final class d extends Lambda implements Function0<ViewModelStore> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkActivity.this.getViewModelStore();
        }
    }

    public static final class e extends Lambda implements Function0<CreationExtras> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends Lambda implements Function0<ViewModelStore> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkActivity.this.getViewModelStore();
        }
    }

    public static final class g extends Lambda implements Function0<CreationExtras> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends Lambda implements Function0<ViewModelProvider$Factory> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            LinkActivity linkActivity = LinkActivity.this;
            linkActivity.getClass();
            Plaid plaid = Plaid.INSTANCE;
            Application application = linkActivity.getApplication();
            application.getClass();
            return new C0218l2(plaid.provideLinkTokenComponent$link_sdk_release(application));
        }
    }

    public LinkActivity() {
        h hVar = new h();
        ReflectionFactory reflectionFactory = Reflection.factory;
        this.c = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(C0200j2.class), new d(), hVar, new e());
        this.d = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(C0345z4.class), new f(), new c(), new g());
    }

    public final void a(AbstractC0341z0 abstractC0341z0) {
        C0095a6.a.a(C0095a6.a, "Navigating to " + abstractC0341z0);
        try {
            if (Intrinsics.areEqual(abstractC0341z0, AbstractC0341z0.e.a)) {
                C3 c3 = new C3();
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                backStackRecord.replace(R.id.fragment_container, null, c3);
                backStackRecord.commitInternal(true, true);
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.i) {
                Fragment fragment = (Fragment) ((AbstractC0341z0.i.a.C0056a) ((AbstractC0341z0.i) abstractC0341z0).a()).invoke(((AbstractC0341z0.i) abstractC0341z0).b());
                fragment.getClass();
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                supportFragmentManager2.getClass();
                BackStackRecord backStackRecord2 = new BackStackRecord(supportFragmentManager2);
                backStackRecord2.replace(R.id.fragment_container, null, fragment);
                backStackRecord2.commitInternal(true, true);
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.j) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 96171, ((AbstractC0341z0.j) abstractC0341z0).a());
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.d) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, ((AbstractC0341z0.d) abstractC0341z0).a());
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.f) {
                String a2 = ((AbstractC0341z0.f) abstractC0341z0).a();
                Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("url", a2));
                mapOf.getClass();
                F6.a.a("Opening url in default browser", mapOf, J6.INFO);
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(a2)));
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.g) {
                a(((AbstractC0341z0.g) abstractC0341z0).a());
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.a) {
                c();
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.k) {
                EnumC0151d7 a3 = ((AbstractC0341z0.k) abstractC0341z0).a();
                a3.getClass();
                P7 p7 = new P7();
                Bundle bundle = new Bundle();
                bundle.putSerializable("smsAutofillType", a3);
                p7.setArguments(bundle);
                FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                supportFragmentManager3.getClass();
                BackStackRecord backStackRecord3 = new BackStackRecord(supportFragmentManager3);
                backStackRecord3.replace(R.id.fragment_container, null, p7);
                backStackRecord3.commitInternal(true, true);
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.h) {
                JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new G1(this, null), 3);
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.b) {
                ((C0345z4) this.d.getValue()).a(((AbstractC0341z0.b) abstractC0341z0).a());
                return;
            }
            if (abstractC0341z0 instanceof AbstractC0341z0.c) {
                U0 a4 = U0.a.a(((AbstractC0341z0.c) abstractC0341z0).a());
                a4.getClass();
                FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                supportFragmentManager4.getClass();
                BackStackRecord backStackRecord4 = new BackStackRecord(supportFragmentManager4);
                backStackRecord4.replace(R.id.fragment_container, null, a4);
                backStackRecord4.commitInternal(true, true);
            }
        } catch (Exception e2) {
            C0095a6.a.b(C0095a6.a, e2, "Error occurred while trying to render: " + abstractC0341z0);
            Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, L2.b(e2, null));
        }
    }

    @Override // com.plaid.internal.w8
    public final E3 b() {
        return new E3(((C0200j2) this.c.getValue()).a);
    }

    public final void c() {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:null")));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        JobKt.launch$default(ViewModelKt.getViewModelScope((C0200j2) this.c.getValue()), null, null, new a(null), 3);
    }

    @Override // com.plaid.internal.AbstractActivityC0291t4, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C0095a6.a.getClass();
        C0095a6.a.a("OnCreate", true);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        F6.a.b(emptyMap, "LinkActivity onCreate");
        C0241n7.a(this);
        setRequestedOrientation(1);
        setContentView(R.layout.plaid_activity_link);
        C0200j2 c0200j2 = (C0200j2) this.c.getValue();
        b bVar = new b(this);
        G2 g2 = c0200j2.b;
        if (g2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
            throw null;
        }
        g2.a.observe(this, new C0200j2.a(bVar));
        C0200j2 c0200j22 = (C0200j2) this.c.getValue();
        if (c0200j22.f == null) {
            c0200j22.f = JobKt.launch$default(ViewModelKt.getViewModelScope(c0200j22), Dispatchers.Default, null, new C0209k2(c0200j22, null), 2);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        F6.a.b(emptyMap, "LinkActivity onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        C0095a6.a.getClass();
        C0095a6.a.a("OnPause", true);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        F6.a.b(emptyMap, "LinkActivity onPause");
        super.onPause();
    }

    @Override // com.plaid.internal.AbstractActivityC0291t4, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        C0095a6.a.getClass();
        C0095a6.a.a("OnResume", true);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        F6.a.b(emptyMap, "LinkActivity onResume");
        super.onResume();
    }

    public static final void c(LinkActivity linkActivity) {
        linkActivity.b = true;
    }

    public static final C0345z4 a(LinkActivity linkActivity) {
        return (C0345z4) linkActivity.d.getValue();
    }

    @Override // com.plaid.internal.AbstractActivityC0291t4
    public final void a(Intent intent) {
        D6 a2 = intent != null ? C1.a(intent) : null;
        if (a2 != null) {
            C0095a6.a.a(C0095a6.a, "onIntentReady with redirectState: " + a2);
            F6.a.a("LinkActivity onIntentReady with redirectState: " + a2);
        }
        ((C0200j2) this.c.getValue()).a(a2);
    }

    public final void a(AbstractC0282s4 abstractC0282s4) {
        int i;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        F6.a.b(emptyMap, "Opening URL within webview session");
        if (abstractC0282s4 instanceof AbstractC0282s4.d) {
            String str = abstractC0282s4.a;
            int i2 = ((AbstractC0282s4.d) abstractC0282s4).b;
            PackageManager packageManager = getPackageManager();
            packageManager.getClass();
            packageManager.getClass();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            queryIntentServices.getClass();
            if (queryIntentServices.isEmpty()) {
                C0095a6.a.b(C0095a6.a, "Can't open custom tab -- custom tabs are not supported on this device");
                J5 j5 = Y6.a;
                if (j5 != null) {
                    j5.a("Can't open custom tab -- custom tabs are not supported on this device");
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                maximumWindowMetrics.getClass();
                i = maximumWindowMetrics.getBounds().height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                i = displayMetrics.heightPixels;
            }
            if (i2 != 0) {
                if (i <= i2) {
                    i2 = i;
                }
                i = i2;
            }
            Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("url", str));
            mapOf.getClass();
            F6.a.a("Opening custom tab with url", mapOf, J6.INFO);
            zzm zzmVar = new zzm();
            Intent intent = (Intent) zzmVar.zzb;
            if (i > 0) {
                intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 2);
                Intent intent2 = (Intent) zzmVar.build().val$videoEncoderSession;
                intent2.getClass();
                intent2.addFlags(1073741824);
                intent2.setData(Uri.parse(str));
                startActivityForResult(intent2, 0);
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Invalid value for the initialHeightPx argument");
            return;
        }
        if (abstractC0282s4 instanceof AbstractC0282s4.c) {
            a(abstractC0282s4.a);
            return;
        }
        if (abstractC0282s4 instanceof AbstractC0282s4.b) {
            String str2 = abstractC0282s4.a;
            Map mapOf2 = MapsKt__MapsJVMKt.mapOf(new Pair("url", str2));
            mapOf2.getClass();
            F6.a.a("Opening url in default browser", mapOf2, J6.INFO);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public final void a(String str) {
        PackageManager packageManager = getPackageManager();
        packageManager.getClass();
        packageManager.getClass();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        queryIntentServices.getClass();
        if (queryIntentServices.isEmpty()) {
            C0095a6.a.b(C0095a6.a, "Can't open custom tab -- custom tabs are not supported on this device");
            J5 j5 = Y6.a;
            if (j5 != null) {
                j5.a("Can't open custom tab -- custom tabs are not supported on this device");
                return;
            }
            return;
        }
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("url", str));
        mapOf.getClass();
        F6.a.a("Opening custom tab with url", mapOf, J6.INFO);
        new zzm().build().launchUrl(this, Uri.parse(str));
    }

    @Override // com.plaid.internal.w8
    public final v8 a(p8.a aVar) {
        aVar.getClass();
        return new v8(aVar, ((C0200j2) this.c.getValue()).a);
    }

    @Override // com.plaid.internal.w8
    public final X7 a() {
        return new X7(((C0200j2) this.c.getValue()).a);
    }
}
