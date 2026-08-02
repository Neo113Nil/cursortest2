package ru.kinopoisk.sdk.easylogin.internal;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aj2;
import defpackage.auc;
import defpackage.bqi;
import defpackage.exi;
import defpackage.iuc;
import defpackage.jsc;
import defpackage.li;
import defpackage.ni2;
import defpackage.otc;
import defpackage.ri2;
import defpackage.su4;
import defpackage.u75;
import defpackage.uif;
import defpackage.uuc;
import defpackage.v75;
import defpackage.vyn;
import defpackage.xdr;
import defpackage.yi2;
import defpackage.ytc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 n2\u00020\u0001:\u0001oB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J1\u00103\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u000200H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001dH\u0004¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0014¢\u0006\u0004\b<\u0010=J#\u0010A\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\n\u0010@\u001a\u00060>j\u0002`?H\u0014¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0002¢\u0006\u0004\bC\u0010\"J\u000f\u0010D\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010\"J\u000f\u0010E\u001a\u00020\u000fH\u0002¢\u0006\u0004\bE\u0010\"J\u0013\u0010F\u001a\u00020\u001d*\u00020:H\u0002¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bR\u0010SR&\u0010V\u001a\u0012\u0012\u0004\u0012\u00020#0Tj\b\u0012\u0004\u0012\u00020#`U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010[\u001a\f\u0012\b\u0012\u00060Yj\u0002`Z0X8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R*\u0010_\u001a\n\u0018\u00010Yj\u0004\u0018\u0001`Z8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010f\u001a\u00020e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020j8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/z4;", "Lru/kinopoisk/sdk/easylogin/internal/K6;", "Landroidx/fragment/app/t;", "activity", "", "containerId", "Landroidx/fragment/app/y;", "fragmentManager", "Lotc;", "fragmentFactory", "<init>", "(Landroidx/fragment/app/t;ILandroidx/fragment/app/y;Lotc;)V", "", "Lru/kinopoisk/sdk/easylogin/internal/Z0;", "commands", "", "applyCommands", "([Lru/kinopoisk/sdk/easylogin/internal/Z0;)V", NetcastTVService.UDAP_API_COMMAND, "applyCommand", "(Lru/kinopoisk/sdk/easylogin/internal/Z0;)V", "Ljsc;", "forward", "(Ljsc;)V", "Lvyn;", "replace", "(Lvyn;)V", "Liuc;", "screen", "", "addToBackStack", "commitNewFragmentScreen", "(Liuc;Z)V", "back", "()V", "Lru/kinopoisk/sdk/easylogin/internal/J6;", "holder", "addNavigationStateHolder", "(Lru/kinopoisk/sdk/easylogin/internal/J6;)V", "removeNavigationStateHolder", "Laj2;", "backTo", "(Laj2;)V", "Lyi2;", "backOrReplaceRoot", "(Lyi2;)V", "Luuc;", "fragmentTransaction", "Landroidx/fragment/app/o;", "currentFragment", "nextFragment", "setupFragmentTransaction", "(Liuc;Luuc;Landroidx/fragment/app/o;Landroidx/fragment/app/o;)V", "dismissIfDialogFragment", "()Z", "Lli;", "checkAndStartActivity", "(Lli;)V", "Landroid/content/Intent;", "activityIntent", "unexistingActivity", "(Lli;Landroid/content/Intent;)V", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "error", "errorOnApplyCommand", "(Lru/kinopoisk/sdk/easylogin/internal/Z0;Ljava/lang/RuntimeException;)V", "backToRoot", "actualizeBackStack", "actualizeNavigationStateInHolders", "isSameActivity", "(Landroid/content/Intent;)Z", "Landroidx/fragment/app/t;", "getActivity", "()Landroidx/fragment/app/t;", "I", "getContainerId", "()I", "Landroidx/fragment/app/y;", "getFragmentManager", "()Landroidx/fragment/app/y;", "Lotc;", "getFragmentFactory", "()Lotc;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "stateHolders", "Ljava/util/HashSet;", "", "", "Lru/kinopoisk/base/navigation/core/model/ScreenKey;", "backStackCopy", "Ljava/util/List;", "getBackStackCopy", "()Ljava/util/List;", "rootScreenKey", "Ljava/lang/String;", "getRootScreenKey", "()Ljava/lang/String;", "setRootScreenKey", "(Ljava/lang/String;)V", "Lru/kinopoisk/sdk/easylogin/internal/m6;", "logger", "Lru/kinopoisk/sdk/easylogin/internal/m6;", "getLogger$libs_android_navigation_impl", "()Lru/kinopoisk/sdk/easylogin/internal/m6;", "Lru/kinopoisk/sdk/easylogin/internal/I6;", "getNavigationState", "()Lru/kinopoisk/sdk/easylogin/internal/I6;", "navigationState", "Companion", "c", "libs_android_navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1309z4 implements K6 {

    @NotNull
    private final androidx.fragment.app.t activity;

    @NotNull
    private final List<String> backStackCopy;
    private final int containerId;

    @NotNull
    private final otc fragmentFactory;

    @NotNull
    private final androidx.fragment.app.y fragmentManager;

    @NotNull
    private final InterfaceC1135m6 logger;
    private String rootScreenKey;

    @NotNull
    private HashSet<J6> stateHolders;

    @NotNull
    private static final c Companion = new c(null);
    public static final int $stable = 8;

    @NotNull
    private static final Set<String> globallyKnownRootScreenKeys = new LinkedHashSet();

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$a */
    public static final class a extends uif implements Function1<InterfaceC1177p6, String> {
        public final /* synthetic */ androidx.fragment.app.o a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(1);
            this.a = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            InterfaceC1177p6 interfaceC1177p6 = (InterfaceC1177p6) obj;
            interfaceC1177p6.getClass();
            return interfaceC1177p6.a("onAttachFragment", new C1296y4(this.a));
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$b */
    public static final class b implements ytc {

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$b$a */
        public static final class a extends uif implements Function1<InterfaceC1177p6, String> {
            public final /* synthetic */ androidx.fragment.app.o a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.fragment.app.o oVar) {
                super(1);
                this.a = oVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC1177p6 interfaceC1177p6 = (InterfaceC1177p6) obj;
                interfaceC1177p6.getClass();
                return interfaceC1177p6.a("onBackStackChangeCommitted", new A4(this.a));
            }
        }

        public b() {
        }

        @Override // defpackage.ytc
        public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
        }

        @Override // defpackage.ytc
        public final void onBackStackChangeCommitted(androidx.fragment.app.o oVar, boolean z) {
            oVar.getClass();
            C1309z4.this.getLogger().a(EnumC1051g6.b, new a(oVar));
            C1309z4.this.actualizeBackStack();
            C1309z4.this.actualizeNavigationStateInHolders();
        }

        @Override // defpackage.ytc
        public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(@NonNull ri2 ri2Var) {
        }

        @Override // defpackage.ytc
        public /* bridge */ /* synthetic */ void onBackStackChangeStarted(@NonNull androidx.fragment.app.o oVar, boolean z) {
        }

        @Override // defpackage.ytc
        public final void onBackStackChanged() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/z4$c;", "", "", "", "globallyKnownRootScreenKeys", "Ljava/util/Set;", "libs_android_navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$c */
    public static final class c {
        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$d */
    public static final class d extends uif implements Function1<InterfaceC1177p6, String> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((InterfaceC1177p6) obj).getClass();
            return String.format("actualizeNavigationStateInHolders %s", Arrays.copyOf(new Object[]{C1309z4.this.getNavigationState()}, 1));
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$e */
    public static final class e extends uif implements Function1<InterfaceC1177p6, String> {
        public final /* synthetic */ Z0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Z0 z0) {
            super(1);
            this.a = z0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            InterfaceC1177p6 interfaceC1177p6 = (InterfaceC1177p6) obj;
            interfaceC1177p6.getClass();
            return interfaceC1177p6.a("applyCommand", new B4(this.a));
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$f */
    public static final class f extends uif implements Function1<InterfaceC1177p6, String> {
        public final /* synthetic */ Z0[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Z0[] z0Arr) {
            super(1);
            this.a = z0Arr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            InterfaceC1177p6 interfaceC1177p6 = (InterfaceC1177p6) obj;
            interfaceC1177p6.getClass();
            return interfaceC1177p6.a("applyCommands", new C4(this.a));
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$g */
    public static final class g extends uif implements Function1<InterfaceC1177p6, String> {
        public final /* synthetic */ IllegalStateException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(IllegalStateException illegalStateException) {
            super(1);
            this.a = illegalStateException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((InterfaceC1177p6) obj).getClass();
            return this.a.toString();
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z4$h */
    public static final class h extends uif implements Function1<InterfaceC1177p6, String> {
        public final /* synthetic */ Z0 a;
        public final /* synthetic */ RuntimeException b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Z0 z0, RuntimeException runtimeException) {
            super(1);
            this.a = z0;
            this.b = runtimeException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((InterfaceC1177p6) obj).getClass();
            return String.format("errorOnApplyCommand %s: %s", Arrays.copyOf(new Object[]{this.a, this.b}, 2));
        }
    }

    public C1309z4(@NotNull androidx.fragment.app.t tVar, int i, @NotNull androidx.fragment.app.y yVar, @NotNull otc otcVar) {
        tVar.getClass();
        yVar.getClass();
        otcVar.getClass();
        this.activity = tVar;
        this.containerId = i;
        this.fragmentManager = yVar;
        this.fragmentFactory = otcVar;
        this.stateHolders = new HashSet<>();
        this.backStackCopy = new ArrayList();
        this.logger = new C1163o6("FragmentsNavigator", null, 2, null);
        if (getFragmentManager().H() > 0) {
            actualizeBackStack();
            actualizeNavigationStateInHolders();
        }
        androidx.fragment.app.y fragmentManager = getFragmentManager();
        fragmentManager.q.add(new com.yandex.plus.pay.ui.common.api.log.d(1, this));
        androidx.fragment.app.y fragmentManager2 = getFragmentManager();
        fragmentManager2.o.add(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(C1309z4 c1309z4, androidx.fragment.app.y yVar, androidx.fragment.app.o oVar) {
        yVar.getClass();
        oVar.getClass();
        c1309z4.logger.a(EnumC1051g6.b, new a(oVar));
        c1309z4.actualizeBackStack();
        c1309z4.actualizeNavigationStateInHolders();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actualizeBackStack() {
        this.backStackCopy.clear();
        int H = getFragmentManager().H();
        for (int i = 0; i < H; i++) {
            String str = getFragmentManager().G(i).k;
            if (str != null) {
                this.backStackCopy.add(str);
            }
        }
        List f2 = getFragmentManager().c.f();
        f2.getClass();
        boolean isEmpty = f2.isEmpty();
        if (this.backStackCopy.isEmpty()) {
            List<androidx.fragment.app.o> f3 = getFragmentManager().c.f();
            f3.getClass();
            ArrayList arrayList = new ArrayList(v75.o(f3, 10));
            for (androidx.fragment.app.o oVar : f3) {
                String tag = oVar.getTag();
                if (tag == null) {
                    tag = oVar.getClass().getName();
                }
                arrayList.add(tag);
            }
            String str2 = (String) CollectionsKt.firstOrNull(arrayList);
            if (str2 != null) {
                globallyKnownRootScreenKeys.add(str2);
            }
            this.rootScreenKey = str2;
        }
        if (isEmpty || this.rootScreenKey != null) {
            return;
        }
        for (String str3 : globallyKnownRootScreenKeys) {
            if (getFragmentManager().D(str3) != null && !this.backStackCopy.contains(str3)) {
                this.rootScreenKey = str3;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actualizeNavigationStateInHolders() {
        xdr xdrVar;
        Object value;
        this.logger.b(EnumC1051g6.c, new d());
        for (J6 j6 : this.stateHolders) {
            I6 navigationState = getNavigationState();
            j6.getClass();
            navigationState.getClass();
            bqi bqiVar = j6.a;
            do {
                xdrVar = (xdr) bqiVar;
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, navigationState));
        }
    }

    private final void backToRoot() {
        this.backStackCopy.clear();
        List f2 = getFragmentManager().c.f();
        f2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f2) {
            if (obj instanceof androidx.fragment.app.i) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.i) it.next()).dismiss();
        }
        androidx.fragment.app.y fragmentManager = getFragmentManager();
        fragmentManager.getClass();
        fragmentManager.x(new auc(fragmentManager, null, -1, 1), false);
    }

    private final boolean isSameActivity(Intent intent) {
        ComponentName component = intent.getComponent();
        return Intrinsics.d(component != null ? component.getClassName() : null, getActivity().getComponentName().getClassName());
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.K6
    public void addNavigationStateHolder(@NotNull J6 holder) {
        xdr xdrVar;
        Object value;
        holder.getClass();
        this.stateHolders.add(holder);
        I6 navigationState = getNavigationState();
        holder.getClass();
        navigationState.getClass();
        bqi bqiVar = holder.a;
        do {
            xdrVar = (xdr) bqiVar;
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, navigationState));
    }

    public void applyCommand(@NotNull Z0 command) {
        command.getClass();
        this.logger.a(EnumC1051g6.b, new e(command));
        if (command instanceof exi) {
            applyCommand(null);
            return;
        }
        if (command instanceof jsc) {
            forward((jsc) command);
            return;
        }
        if (command instanceof vyn) {
            replace((vyn) command);
            return;
        }
        if (command instanceof aj2) {
            backTo((aj2) command);
        } else if (command instanceof ni2) {
            back();
        } else if (command instanceof yi2) {
            backOrReplaceRoot((yi2) command);
        }
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.K6
    public void applyCommands(@NotNull Z0[] commands) {
        commands.getClass();
        this.logger.a(EnumC1051g6.b, new f(commands));
        try {
            androidx.fragment.app.y fragmentManager = getFragmentManager();
            fragmentManager.z(true);
            fragmentManager.E();
        } catch (IllegalStateException e2) {
            this.logger.b(EnumC1051g6.c, new g(e2));
        }
        actualizeBackStack();
        for (Z0 z0 : commands) {
            try {
                applyCommand(z0);
            } catch (RuntimeException e3) {
                errorOnApplyCommand(z0, e3);
            }
        }
        actualizeNavigationStateInHolders();
    }

    public void back() {
        if (dismissIfDialogFragment()) {
            return;
        }
        if (this.backStackCopy.isEmpty()) {
            getActivity().finish();
            return;
        }
        getFragmentManager().T();
        List<String> list = this.backStackCopy;
        list.remove(u75.g(list));
    }

    public void backOrReplaceRoot(@NotNull yi2 command) {
        command.getClass();
        InterfaceC1274w8 interfaceC1274w8 = command.a;
        if (!(interfaceC1274w8 instanceof li) || dismissIfDialogFragment()) {
            return;
        }
        if (!this.backStackCopy.isEmpty()) {
            getFragmentManager().T();
            List<String> list = this.backStackCopy;
            list.remove(u75.g(list));
            return;
        }
        if (getActivity().isTaskRoot()) {
            li liVar = (li) interfaceC1274w8;
            if (!isSameActivity(liVar.b(getActivity()))) {
                checkAndStartActivity(liVar);
                getActivity().finish();
                return;
            }
        }
        getActivity().finish();
    }

    public void backTo(@NotNull aj2 command) {
        command.getClass();
        InterfaceC1274w8 interfaceC1274w8 = command.a;
        if (interfaceC1274w8 == null) {
            backToRoot();
            return;
        }
        String b2 = interfaceC1274w8.b();
        Iterator<String> it = this.backStackCopy.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.d(it.next(), b2)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            backToRoot();
            return;
        }
        List<String> list = this.backStackCopy;
        List<String> subList = list.subList(i, list.size());
        androidx.fragment.app.y fragmentManager = getFragmentManager();
        String str = ((String) CollectionsKt.Q(subList)).toString();
        fragmentManager.getClass();
        fragmentManager.x(new auc(fragmentManager, str, -1, 0), false);
        subList.clear();
    }

    public void checkAndStartActivity(@NotNull li screen) {
        screen.getClass();
        Intent b2 = screen.b(getActivity());
        try {
            getActivity().startActivity(b2, null);
        } catch (ActivityNotFoundException unused) {
            unexistingActivity(screen, b2);
        }
    }

    public void commitNewFragmentScreen(@NotNull iuc screen, boolean addToBackStack) {
        screen.getClass();
        androidx.fragment.app.o a2 = screen.a(getFragmentFactory());
        if (a2 instanceof androidx.fragment.app.i) {
            ((androidx.fragment.app.i) a2).show(getFragmentManager(), screen.b());
            this.backStackCopy.add(screen.b());
            return;
        }
        androidx.fragment.app.y fragmentManager = getFragmentManager();
        androidx.fragment.app.a l = su4.l(fragmentManager, fragmentManager);
        l.r = true;
        setupFragmentTransaction(screen, l, getFragmentManager().C(getContainerId()), a2);
        if (screen.a()) {
            l.e(getContainerId(), a2, screen.b());
        } else {
            l.d(getContainerId(), a2, screen.b(), 1);
        }
        if (addToBackStack) {
            l.c(screen.b());
            this.backStackCopy.add(screen.b());
        }
        l.j();
    }

    public final boolean dismissIfDialogFragment() {
        androidx.fragment.app.i iVar;
        Object obj;
        List f2 = getFragmentManager().c.f();
        f2.getClass();
        ListIterator listIterator = f2.listIterator(f2.size());
        while (true) {
            iVar = null;
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((androidx.fragment.app.o) obj).isVisible()) {
                break;
            }
        }
        androidx.fragment.app.i iVar2 = obj instanceof androidx.fragment.app.i ? (androidx.fragment.app.i) obj : null;
        if (iVar2 != null) {
            iVar2.dismiss();
            List<String> list = this.backStackCopy;
            list.remove(u75.g(list));
            iVar = iVar2;
        }
        return iVar != null;
    }

    public void errorOnApplyCommand(@NotNull Z0 command, @NotNull RuntimeException error) {
        command.getClass();
        error.getClass();
        this.logger.a(EnumC1051g6.c, new h(command, error));
    }

    public void forward(@NotNull jsc command) {
        command.getClass();
        InterfaceC1274w8 interfaceC1274w8 = command.a;
        if (interfaceC1274w8 instanceof li) {
            checkAndStartActivity((li) interfaceC1274w8);
        } else if (interfaceC1274w8 instanceof iuc) {
            commitNewFragmentScreen((iuc) interfaceC1274w8, true);
        }
    }

    @NotNull
    public androidx.fragment.app.t getActivity() {
        return this.activity;
    }

    @NotNull
    public final List<String> getBackStackCopy() {
        return this.backStackCopy;
    }

    public int getContainerId() {
        return this.containerId;
    }

    @NotNull
    public otc getFragmentFactory() {
        return this.fragmentFactory;
    }

    @NotNull
    public androidx.fragment.app.y getFragmentManager() {
        return this.fragmentManager;
    }

    @NotNull
    /* renamed from: getLogger$libs_android_navigation_impl, reason: from getter */
    public final InterfaceC1135m6 getLogger() {
        return this.logger;
    }

    @NotNull
    public final I6 getNavigationState() {
        return new I6(this.rootScreenKey, this.backStackCopy);
    }

    public final String getRootScreenKey() {
        return this.rootScreenKey;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.K6
    public void removeNavigationStateHolder(@NotNull J6 holder) {
        holder.getClass();
        this.stateHolders.remove(holder);
    }

    public void replace(@NotNull vyn command) {
        command.getClass();
        InterfaceC1274w8 interfaceC1274w8 = command.a;
        if (interfaceC1274w8 instanceof li) {
            checkAndStartActivity((li) interfaceC1274w8);
            getActivity().finish();
        } else if (interfaceC1274w8 instanceof iuc) {
            if (this.backStackCopy.isEmpty()) {
                commitNewFragmentScreen((iuc) interfaceC1274w8, false);
                return;
            }
            getFragmentManager().T();
            List<String> list = this.backStackCopy;
            list.remove(u75.g(list));
            commitNewFragmentScreen((iuc) interfaceC1274w8, true);
        }
    }

    public final void setRootScreenKey(String str) {
        this.rootScreenKey = str;
    }

    public void setupFragmentTransaction(@NotNull iuc screen, @NotNull uuc fragmentTransaction, androidx.fragment.app.o currentFragment, @NotNull androidx.fragment.app.o nextFragment) {
        screen.getClass();
        fragmentTransaction.getClass();
        nextFragment.getClass();
    }

    public void unexistingActivity(@NotNull li screen, @NotNull Intent activityIntent) {
        screen.getClass();
        activityIntent.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1309z4(androidx.fragment.app.t tVar, int i, androidx.fragment.app.y yVar, otc otcVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, i, yVar, otcVar);
        if ((i2 & 4) != 0) {
            yVar = tVar.getSupportFragmentManager();
            yVar.getClass();
        }
        if ((i2 & 8) != 0) {
            otcVar = yVar.J();
            otcVar.getClass();
        }
    }
}
