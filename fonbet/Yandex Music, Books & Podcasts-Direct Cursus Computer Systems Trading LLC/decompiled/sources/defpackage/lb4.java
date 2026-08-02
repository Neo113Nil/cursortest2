package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import com.yandex.payment.sdk.ui.view.EmailView;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class lb4 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ChallengerInputView.a((ChallengerInputView) obj, String.valueOf(editable));
                break;
            case 1:
                CvnInput cvnInput = (CvnInput) obj;
                cvnInput.g.invoke(new kne(fbs.CVN));
                cvnInput.b(false);
                break;
            case 2:
                int i2 = my6.h;
                ((my6) obj).b(false);
                break;
            case 3:
                t17.a((t17) obj, String.valueOf(editable));
                break;
            case 4:
                DKCvnInput dKCvnInput = (DKCvnInput) obj;
                dKCvnInput.i.invoke(new kne(fbs.CVN));
                dKCvnInput.b(false);
                boolean B = qdq.B(editable != null ? Boolean.valueOf(!StringsKt.U(editable)) : null);
                jtc jtcVar = dKCvnInput.a;
                if (!B) {
                    ((EditText) jtcVar.b).setHint(R.string.paymentsdk_prebuilt_card_cvn_hint);
                    break;
                } else {
                    ((EditText) jtcVar.b).setHint("");
                    break;
                }
            case 5:
                ((rf7) ((jp0) obj).g).invoke(String.valueOf(editable));
                break;
            case 6:
                Iterator it = ((j79) obj).o.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(editable);
                }
                break;
            case 8:
                int i3 = EmailView.f;
                ((EmailView) obj).a(false);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String cvn;
        ov8 ov8Var;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                f2a f2aVar = (f2a) this.b;
                g0c g0cVar = f2aVar.h;
                if (g0cVar != null) {
                    ((x60) g0cVar).a(gut.D(String.valueOf(charSequence != null ? Integer.valueOf(charSequence.length()) : null)));
                }
                ez6 ez6Var = f2aVar.g;
                cvn = f2aVar.getCvn();
                boolean z = i3 > 0;
                ez6Var.getClass();
                cvn.getClass();
                int i4 = 0;
                for (Object obj : (Iterable) ez6Var.c) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        u75.n();
                        throw null;
                    }
                    pv8 pv8Var = (pv8) obj;
                    if (ez6Var.c.size() - 1 == i4) {
                        ov8Var = new mv8(false);
                    } else if (cvn.length() == i4) {
                        ov8Var = lv8.a;
                    } else if (cvn.length() - 1 == i4 && z) {
                        ov8Var = new nv8(String.valueOf(cvn.length() == 0 ? null : Character.valueOf(cvn.charAt(cvn.length() - 1))));
                    } else {
                        ov8Var = cvn.length() > i4 ? lv8.b : lv8.d;
                    }
                    pv8Var.setState(ov8Var);
                    i4 = i5;
                }
                f2aVar.b(false);
                return;
            case 8:
                return;
            case 9:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.p.getText();
                searchView.E0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.v(!isEmpty);
                int i6 = 8;
                if (searchView.D0 && !searchView.w0 && isEmpty) {
                    searchView.u.setVisibility(8);
                    i6 = 0;
                }
                searchView.w.setVisibility(i6);
                searchView.r();
                searchView.u();
                charSequence.toString();
                return;
            default:
                ((com.google.android.material.search.SearchView) this.b).l.setVisibility(charSequence.length() > 0 ? 0 : 8);
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }
}
