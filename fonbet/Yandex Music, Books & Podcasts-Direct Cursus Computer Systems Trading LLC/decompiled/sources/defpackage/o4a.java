package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo4a;", "Landroidx/fragment/app/o;", "Lwe;", "Lytc;", "<init>", "()V", "flex-document-fragment_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public abstract class o4a extends o implements we, ytc {
    public final jyr g;
    public final jyr h;
    public o3a i;

    public o4a() {
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: n4a
            public final /* synthetic */ o4a b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle bundle;
                switch (i) {
                    case 0:
                        Bundle arguments = this.b.getArguments();
                        if (arguments == null || (bundle = arguments.getBundle("query")) == null) {
                            return null;
                        }
                        return gld.c0(bundle);
                    default:
                        Bundle arguments2 = this.b.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("document_label");
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.h = btf.b(new Function0(this) { // from class: n4a
            public final /* synthetic */ o4a b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle bundle;
                switch (i2) {
                    case 0:
                        Bundle arguments = this.b.getArguments();
                        if (arguments == null || (bundle = arguments.getBundle("query")) == null) {
                            return null;
                        }
                        return gld.c0(bundle);
                    default:
                        Bundle arguments2 = this.b.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("document_label");
                        }
                        return null;
                }
            }
        });
    }

    @Override // defpackage.we
    public final void c(md mdVar) {
        o3a y = y();
        if (y != null) {
            y.g(mdVar);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        getParentFragmentManager().o.add(this);
        Bundle arguments = getArguments();
        Bundle bundle = arguments != null ? arguments.getBundle("query") : null;
        t5a c0 = bundle != null ? gld.c0(bundle) : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("document_label") : null;
        q2a q2aVar = string != null ? (q2a) ((LinkedHashMap) n6a.b.a).get(string) : null;
        o3a y = y();
        if (y == null) {
            Timber.INSTANCE.e("Engine is null, check if arguments are correct", new Object[0]);
            return;
        }
        if (c0 != null) {
            o3a.i(y, c0, q2aVar);
        } else if (q2aVar == null) {
            Timber.INSTANCE.e("There is no document or query", new Object[0]);
        } else {
            nnk nnkVar = o3a.Q;
            y.o(q2aVar);
        }
    }

    @Override // defpackage.ytc
    public final void onBackStackChanged() {
        o3a y;
        if (!isStateSaved() && Intrinsics.d(CollectionsKt.Z(getParentFragmentManager().c.f()), this) && (y = y()) != null && y.J) {
            xq0.q("Can't trim document after destroy");
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        o3a y = y();
        if (y != null) {
            y.c(frameLayout, getViewLifecycleOwner());
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.o
    public void onDestroy() {
        StackTraceElement stackTraceElement;
        String str;
        String string;
        super.onDestroy();
        o3a y = y();
        if (y != null) {
            y.e();
        }
        if (h4a.B(this)) {
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("document_label")) != null) {
                n6a.b.n(string);
            }
            Bundle arguments2 = getArguments();
            Bundle bundle = arguments2 != null ? arguments2.getBundle("query") : null;
            t5a c0 = bundle != null ? gld.c0(bundle) : null;
            if (c0 != null) {
                u3a u3aVar = (u3a) u3a.c.getValue();
                u3aVar.getClass();
                ConcurrentHashMap concurrentHashMap = u3aVar.b;
                z75.x(concurrentHashMap.entrySet(), new c68(u3aVar, System.currentTimeMillis()));
                g06 g06Var = u3aVar.a;
                jyr a = fsg.a(new Pair("query", null), new Pair("engineStorageSize", Integer.valueOf(concurrentHashMap.size())), new Pair("tag", null));
                c5b c5bVar = c5b.a;
                htb htbVar = ((thc) g06Var.c).a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                vhc vhcVar = vhc.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    vhcVar = new vhc(fileName, methodName, str);
                }
                g06Var.N(yhc.DEBUG, "Outdated engines cleaned", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                if (concurrentHashMap.remove(c0) == null) {
                    return;
                }
                l1j.f();
            }
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDetach() {
        getParentFragmentManager().o.remove(this);
        super.onDetach();
    }

    public abstract o3a x();

    public final o3a y() {
        o3a o3aVar = this.i;
        if (o3aVar == null || o3aVar.J) {
            this.i = x();
        }
        return this.i;
    }
}
