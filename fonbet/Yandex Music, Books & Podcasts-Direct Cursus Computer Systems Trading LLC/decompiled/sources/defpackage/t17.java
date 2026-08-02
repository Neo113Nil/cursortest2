package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class t17 extends RelativeLayout {
    public static final /* synthetic */ int l = 0;
    public final phk a;
    public s17 b;
    public mt4 c;
    public final int d;
    public final int e;
    public final int f;
    public List g;
    public List h;
    public boolean i;
    public final TranslateAnimation j;
    public final kb4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t17(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_dk_challenger_input_view, this);
        int i2 = R.id.blur;
        View v = dag.v(R.id.blur, this);
        if (v != null) {
            i2 = R.id.code1;
            TextView textView = (TextView) dag.v(R.id.code1, this);
            if (textView != null) {
                i2 = R.id.code2;
                TextView textView2 = (TextView) dag.v(R.id.code2, this);
                if (textView2 != null) {
                    i2 = R.id.code3;
                    TextView textView3 = (TextView) dag.v(R.id.code3, this);
                    if (textView3 != null) {
                        i2 = R.id.code4;
                        TextView textView4 = (TextView) dag.v(R.id.code4, this);
                        if (textView4 != null) {
                            i2 = R.id.code5;
                            TextView textView5 = (TextView) dag.v(R.id.code5, this);
                            if (textView5 != null) {
                                i2 = R.id.code6;
                                TextView textView6 = (TextView) dag.v(R.id.code6, this);
                                if (textView6 != null) {
                                    i2 = R.id.code7;
                                    TextView textView7 = (TextView) dag.v(R.id.code7, this);
                                    if (textView7 != null) {
                                        i2 = R.id.code8;
                                        TextView textView8 = (TextView) dag.v(R.id.code8, this);
                                        if (textView8 != null) {
                                            i2 = R.id.cursor0;
                                            View v2 = dag.v(R.id.cursor0, this);
                                            if (v2 != null) {
                                                i2 = R.id.cursor1;
                                                View v3 = dag.v(R.id.cursor1, this);
                                                if (v3 != null) {
                                                    i2 = R.id.cursor2;
                                                    View v4 = dag.v(R.id.cursor2, this);
                                                    if (v4 != null) {
                                                        i2 = R.id.cursor3;
                                                        View v5 = dag.v(R.id.cursor3, this);
                                                        if (v5 != null) {
                                                            i2 = R.id.cursor4;
                                                            View v6 = dag.v(R.id.cursor4, this);
                                                            if (v6 != null) {
                                                                i2 = R.id.cursor7;
                                                                View v7 = dag.v(R.id.cursor7, this);
                                                                if (v7 != null) {
                                                                    i2 = R.id.cursor8;
                                                                    View v8 = dag.v(R.id.cursor8, this);
                                                                    if (v8 != null) {
                                                                        i2 = R.id.editCodeReal;
                                                                        EditText editText = (EditText) dag.v(R.id.editCodeReal, this);
                                                                        if (editText != null) {
                                                                            i2 = R.id.llCodeWrapper;
                                                                            if (((LinearLayout) dag.v(R.id.llCodeWrapper, this)) != null) {
                                                                                i2 = R.id.mainContainer;
                                                                                if (((RelativeLayout) dag.v(R.id.mainContainer, this)) != null) {
                                                                                    this.a = new phk(this, v, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, v2, v3, v4, v5, v6, v7, v8, editText);
                                                                                    this.b = p17.d;
                                                                                    this.d = context.getColor(R.color.paymentsdk_divkit_primary_text_color);
                                                                                    this.e = context.getColor(R.color.paymentsdk_divkit_error_text_color);
                                                                                    this.f = context.getColor(R.color.paymentsdk_divkit_success_cvv_color);
                                                                                    c5b c5bVar = c5b.a;
                                                                                    this.g = c5bVar;
                                                                                    this.h = c5bVar;
                                                                                    editText.addTextChangedListener(new lb4(3, this));
                                                                                    setBackgroundResource(R.drawable.paymentsdk_bg_challenger_input);
                                                                                    TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 2, 1.0f, 1, 0.0f, 1, 0.0f);
                                                                                    translateAnimation.setDuration(700L);
                                                                                    translateAnimation.setInterpolator(new LinearInterpolator());
                                                                                    translateAnimation.setRepeatMode(1);
                                                                                    translateAnimation.setRepeatCount(-1);
                                                                                    this.j = translateAnimation;
                                                                                    kb4 kb4Var = new kb4(2);
                                                                                    kb4Var.c = true;
                                                                                    this.k = kb4Var;
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static final void a(t17 t17Var, String str) {
        kb4 kb4Var = t17Var.k;
        phk phkVar = t17Var.a;
        if (t17Var.i) {
            int i = t17Var.d;
            kb4Var.c = true;
            phkVar.q.setEnabled(true);
            t17Var.i = false;
            Iterator it = t17Var.g.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextColor(i);
            }
            t17Var.getDotTextView().setTextColor(i);
            t17Var.getCurrencyTextView().setText("");
        }
        s17 s17Var = t17Var.b;
        if (!(s17Var instanceof r17)) {
            if (str.length() >= s17Var.c) {
                t17Var.getDotTextView().setText(StringUtils.COMMA);
            } else {
                t17Var.getDotTextView().setText("");
            }
        }
        int size = t17Var.g.size() - str.length();
        int i2 = 0;
        for (Object obj : CollectionsKt.j0(t17Var.g)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            TextView textView = (TextView) obj;
            if (i2 < size) {
                textView.setText("");
            }
            i2 = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            ((TextView) t17Var.g.get(i5)).setText(String.valueOf(str.charAt(i4)));
            i4++;
            i5++;
        }
        t17Var.d(str.length());
        if (str.length() == t17Var.b.b) {
            mt4 mt4Var = t17Var.c;
            if (mt4Var != null) {
                mt4Var.invoke(str);
            }
            Iterator it2 = t17Var.h.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setContentDescription("");
            }
            kb4Var.c = false;
            phkVar.a.setVisibility(0);
            phkVar.a.startAnimation(t17Var.j);
            phkVar.q.setEnabled(false);
        }
    }

    public static void f(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setHint(str);
        }
    }

    private final TextView getCurrencyTextView() {
        return this.a.g;
    }

    private final View getDotCursorView() {
        return this.a.m;
    }

    private final TextView getDotTextView() {
        return this.a.d;
    }

    private final View getExtraCursorView() {
        return this.a.k;
    }

    private final TextView getExtraTextView() {
        return this.a.c;
    }

    private final EditText getInput() {
        return this.a.q;
    }

    public final void b() {
        EditText input = getInput();
        input.requestFocus();
        Object systemService = input.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(input, 2);
        }
        input.setSelection(input.getText().length());
        kb4 kb4Var = this.k;
        if (kb4Var.c) {
            return;
        }
        kb4Var.c = true;
        d(input.getText().length());
    }

    public final void c() {
        phk phkVar = this.a;
        phkVar.h.setVisibility(8);
        phkVar.i.setVisibility(8);
        phkVar.o.setVisibility(8);
        phkVar.p.setVisibility(8);
    }

    public final void d(int i) {
        if (u75.g(this.h) >= i) {
            int i2 = 0;
            for (Object obj : this.h) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    u75.n();
                    throw null;
                }
                View view = (View) obj;
                if (i2 == i) {
                    view.setContentDescription("s");
                } else {
                    view.setContentDescription("");
                }
                i2 = i3;
            }
            View view2 = (View) this.h.get(i);
            kb4 kb4Var = this.k;
            kb4Var.getClass();
            view2.getClass();
            View view3 = kb4Var.b;
            if (view3 != null) {
                view3.setVisibility(4);
            }
            kb4Var.b = view2;
            kb4Var.a(view2);
        }
    }

    public final void e(s17 s17Var, mt4 mt4Var) {
        this.b = s17Var;
        this.c = mt4Var;
        getInput().setFilters(new InputFilter[]{new InputFilter.LengthFilter(s17Var.b)});
        setOnClickListener(new ol(8, this));
        boolean z = s17Var instanceof r17;
        phk phkVar = this.a;
        if (z) {
            TextView textView = phkVar.h;
            View view = phkVar.k;
            View view2 = phkVar.p;
            View view3 = phkVar.o;
            TextView textView2 = phkVar.i;
            textView.setVisibility(0);
            textView2.setVisibility(0);
            view3.setVisibility(4);
            view2.setVisibility(4);
            this.g = u75.h(phkVar.b, phkVar.d, phkVar.e, phkVar.f, phkVar.h, textView2);
            this.h = u75.h(phkVar.j, view, phkVar.l, phkVar.m, phkVar.n, view3, view2);
            f(null, this.g);
            getDotTextView().setVisibility(0);
            phkVar.c.setVisibility(8);
            getDotCursorView().setVisibility(4);
            view.setVisibility(4);
            getCurrencyTextView().setVisibility(8);
        } else if (s17Var instanceof q17) {
            c();
            this.g = u75.h(phkVar.b, phkVar.e, phkVar.f);
            this.h = u75.h(phkVar.j, phkVar.l, phkVar.m, phkVar.n);
            f(CommonUrlParts.Values.FALSE_INTEGER, this.g);
            getDotCursorView().setVisibility(4);
            getDotTextView().setVisibility(0);
            getCurrencyTextView().setVisibility(0);
            getExtraTextView().setVisibility(8);
            getExtraCursorView().setVisibility(8);
        } else if (s17Var instanceof p17) {
            c();
            this.g = u75.h(phkVar.b, phkVar.c, phkVar.e, phkVar.f);
            this.h = u75.h(phkVar.j, phkVar.k, phkVar.l, phkVar.m, phkVar.n);
            f(CommonUrlParts.Values.FALSE_INTEGER, this.g);
            getDotTextView().setVisibility(0);
            getDotCursorView().setVisibility(4);
            getCurrencyTextView().setVisibility(0);
            getExtraTextView().setVisibility(0);
            getExtraCursorView().setVisibility(4);
        }
        getInput().setText("");
        b();
    }

    public final void g() {
        int i;
        phk phkVar = this.a;
        phkVar.q.setEnabled(true);
        Iterator it = this.g.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = this.e;
            if (!hasNext) {
                break;
            } else {
                ((TextView) it.next()).setTextColor(i);
            }
        }
        phkVar.a.setVisibility(8);
        TranslateAnimation translateAnimation = this.j;
        translateAnimation.cancel();
        translateAnimation.reset();
        if (!(this.b instanceof r17)) {
            getDotTextView().setText(StringUtils.COMMA);
            getDotTextView().setTextColor(i);
            getCurrencyTextView().setText("₽");
        }
        this.i = true;
        b();
    }

    public final void h() {
        int i;
        this.a.a.setVisibility(8);
        TranslateAnimation translateAnimation = this.j;
        translateAnimation.cancel();
        translateAnimation.reset();
        Iterator it = this.g.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = this.f;
            if (!hasNext) {
                break;
            } else {
                ((TextView) it.next()).setTextColor(i);
            }
        }
        if (this.b instanceof r17) {
            return;
        }
        getDotTextView().setTextColor(i);
        getCurrencyTextView().setText("₽");
        getCurrencyTextView().setTextColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t17(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ t17(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t17(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
