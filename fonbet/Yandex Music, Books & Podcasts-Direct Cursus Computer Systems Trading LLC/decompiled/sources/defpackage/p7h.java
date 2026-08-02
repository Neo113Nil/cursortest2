package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.internal.view.BackHandlingFrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp7h;", "Landroidx/fragment/app/o;", "<init>", "()V", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class p7h extends o {
    public ia0 g;

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int i, int i2, Intent intent) {
        fi4 fi4Var;
        mmo mmoVar;
        nnk nnkVar;
        super.onActivityResult(i, i2, intent);
        ia0 ia0Var = this.g;
        if (ia0Var == null || (fi4Var = (fi4) ia0Var.m) == null || (mmoVar = fi4Var.u) == null || (nnkVar = (nnk) mmoVar.g) == null || ((ValueCallback) nnkVar.b) == null || i != 9797) {
            return;
        }
        Uri data = (i2 != -1 || intent == null) ? null : intent.getData();
        ValueCallback valueCallback = (ValueCallback) nnkVar.b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(data != null ? new Uri[]{data} : new Uri[0]);
        }
        nnkVar.b = null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ia0 ia0Var = this.g;
        if (ia0Var == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.msg_fr_websdk, viewGroup, false);
        inflate.getClass();
        BackHandlingFrameLayout backHandlingFrameLayout = (BackHandlingFrameLayout) inflate;
        ((MessengerParams) ia0Var.e).getClass();
        View findViewById = backHandlingFrameLayout.findViewById(R.id.msg_webview_error);
        findViewById.setOnClickListener(new pw3(1));
        ia0Var.h = findViewById;
        View findViewById2 = backHandlingFrameLayout.findViewById(R.id.msg_webview_progress);
        findViewById2.setOnClickListener(new pw3(1));
        ia0Var.i = findViewById2;
        ia0Var.j = (TextView) backHandlingFrameLayout.findViewById(R.id.msg_webview_error_text);
        ia0Var.k = (TextView) backHandlingFrameLayout.findViewById(R.id.msg_webview_error_btn);
        return backHandlingFrameLayout;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        ia0 ia0Var = this.g;
        if (ia0Var != null) {
            fi4 fi4Var = (fi4) ia0Var.m;
            if (fi4Var != null) {
                kh4 kh4Var = (kh4) ia0Var.c;
                p7h p7hVar = (p7h) ia0Var.a;
                kh4Var.getClass();
                ih4 ih4Var = kh4Var.d;
                jh4 jh4Var = ih4Var instanceof jh4 ? (jh4) ih4Var : null;
                if (jh4Var == null || !Intrinsics.d(jh4Var.g(), fi4Var)) {
                    qdc qdcVar = kh4Var.a;
                    qdcVar.getClass();
                    dwt.b(new zya(18, qdcVar, "wm_foreground_only_detaching"));
                    fi4Var.d();
                    fi4Var.c();
                } else {
                    kh4Var.b(jh4Var.e(p7hVar));
                }
            }
            ia0Var.m = null;
            ia0Var.n = null;
            qdc qdcVar2 = (qdc) ia0Var.d;
            k5r.t(qdcVar2, qdcVar2, "wm_chat_frame_destroyed");
        }
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        ia0 ia0Var = this.g;
        if (ia0Var != null) {
            if (((Context) ia0Var.n) == null) {
                t requireActivity = ((p7h) ia0Var.a).requireActivity();
                requireActivity.getClass();
                ((MessengerParams) ia0Var.e).getClass();
                jyr jyrVar = dwt.a;
                ia0Var.n = requireActivity;
            }
            Context context = (Context) ia0Var.n;
            LayoutInflater from = context != null ? LayoutInflater.from(context) : null;
            if (from != null) {
                return from;
            }
        }
        LayoutInflater layoutInflater = getLayoutInflater(bundle);
        layoutInflater.getClass();
        return layoutInflater;
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        fi4 fi4Var;
        dzd dzdVar;
        super.onPause();
        ia0 ia0Var = this.g;
        if (ia0Var == null || (fi4Var = (fi4) ia0Var.m) == null || (dzdVar = fi4Var.v) == null) {
            return;
        }
        dzdVar.b = false;
        dzdVar.h();
    }

    @Override // androidx.fragment.app.o
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        fi4 fi4Var;
        mmo mmoVar;
        x0 x0Var;
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        ia0 ia0Var = this.g;
        if (ia0Var == null || (fi4Var = (fi4) ia0Var.m) == null || (mmoVar = fi4Var.u) == null || (x0Var = (x0) mmoVar.e) == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) x0Var.d;
        vkk vkkVar = (vkk) sparseArray.get(i);
        if (vkkVar == null) {
            return;
        }
        sparseArray.remove(i);
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == 0) {
                arrayList.add(strArr[i2]);
            }
        }
        vkkVar.a.i(arrayList);
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        fi4 fi4Var;
        dzd dzdVar;
        super.onResume();
        ia0 ia0Var = this.g;
        if (ia0Var == null || (fi4Var = (fi4) ia0Var.m) == null || (dzdVar = fi4Var.v) == null) {
            return;
        }
        dzdVar.b = true;
        dzdVar.h();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        ChatRequest rh4Var;
        view.getClass();
        super.onViewCreated(view, bundle);
        ia0 ia0Var = this.g;
        if (ia0Var != null) {
            qdc qdcVar = (qdc) ia0Var.d;
            p7h p7hVar = (p7h) ia0Var.a;
            Bundle requireArguments = p7hVar.requireArguments();
            requireArguments.getClass();
            String string = requireArguments.getString(ph4.class.getSimpleName());
            if (string != null) {
                rh4Var = new ph4(string);
            } else {
                String string2 = requireArguments.getString(oh4.class.getSimpleName());
                if (string2 != null) {
                    rh4Var = new oh4(string2);
                } else {
                    String string3 = requireArguments.getString(rh4.class.getSimpleName());
                    rh4Var = string3 != null ? new rh4(string3) : null;
                }
            }
            yh4 yh4Var = rh4Var != null ? yh4.b : yh4.a;
            ((vbv) ia0Var.b).r.sendEvent("wm_chat_start_frame_init", tah.b(new Pair("intent_page", yh4Var.name())));
            yes yesVar = (yes) ((jyr) ia0Var.g).getValue();
            fi4 fi4Var = (fi4) ia0Var.m;
            if (fi4Var != null) {
                int i = yesVar.d;
                ngv f = fi4Var.f();
                if (f != null) {
                    f.x(i);
                }
            }
            View view2 = (View) ia0Var.i;
            if (view2 == null) {
                Intrinsics.j("progressContainer");
                throw null;
            }
            int i2 = yesVar.d;
            int i3 = yesVar.b;
            view2.setBackgroundColor(i2);
            View view3 = (View) ia0Var.h;
            if (view3 == null) {
                Intrinsics.j("errorContainer");
                throw null;
            }
            view3.setBackgroundColor(i2);
            View requireView = p7hVar.requireView();
            requireView.setBackgroundColor(i2);
            ((TextView) requireView.findViewById(R.id.msg_webview_error_text)).setTextColor(i3);
            ((TextView) requireView.findViewById(R.id.msg_webview_error_btn)).setTextColor(yesVar.c);
            ((ProgressBar) requireView.findViewById(R.id.msg_webview_progress_bar)).setIndeterminateTintList(ColorStateList.valueOf(yesVar.a));
            ((TextView) requireView.findViewById(R.id.msg_webview_progress_text)).setTextColor(i3);
            kh4 kh4Var = (kh4) ia0Var.c;
            kh4Var.getClass();
            jh4 c = kh4Var.d.c(p7hVar, ia0Var, yh4Var);
            kh4Var.b(c);
            ia0Var.m = c.g();
            qdcVar.sendEvent("wm_load_main_page", tah.b(new Pair("intent_page", yh4Var.name())));
            String string4 = requireArguments.getString("STATE_KEY_META");
            fi4 fi4Var2 = (fi4) ia0Var.m;
            if (rh4Var != null) {
                if (fi4Var2 != null) {
                    String str = (String) ia0Var.l;
                    wdq wdqVar = new wdq();
                    wdqVar.a = rh4Var;
                    wdqVar.b = string4;
                    wdqVar.c = str;
                    fi4Var2.s = wdqVar;
                    fi4Var2.h();
                }
            } else if (fi4Var2 != null) {
                fi4Var2.s = new xdq();
                fi4Var2.h();
            }
            ia0Var.l = null;
            qdcVar.sendEvent("wm_chat_frame_created", tah.b(new Pair("intent_page", yh4Var.name())));
        }
    }
}
