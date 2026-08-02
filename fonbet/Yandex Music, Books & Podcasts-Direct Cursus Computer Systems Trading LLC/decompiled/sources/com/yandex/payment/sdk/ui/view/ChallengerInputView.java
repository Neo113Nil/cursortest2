package com.yandex.payment.sdk.ui.view;

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
import defpackage.c5b;
import defpackage.dag;
import defpackage.gb4;
import defpackage.hb4;
import defpackage.ib4;
import defpackage.jb4;
import defpackage.jj4;
import defpackage.kb4;
import defpackage.lb4;
import defpackage.ol;
import defpackage.phk;
import defpackage.u75;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ChallengerInputView extends RelativeLayout {
    public static final /* synthetic */ int k = 0;
    public final phk a;
    public jb4 b;
    public Function1 c;
    public final int d;
    public final int e;
    public List f;
    public List g;
    public boolean h;
    public final TranslateAnimation i;
    public final kb4 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengerInputView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_challenger_input_view, this);
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
                                                                                this.a = new phk(this, v, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, v2, v3, v4, v5, v6, v7, v8, editText);
                                                                                this.b = gb4.c;
                                                                                this.d = context.getColor(R.color.paymentsdk_inputTextColor);
                                                                                this.e = context.getColor(R.color.paymentsdk_inputErrorTextColor);
                                                                                c5b c5bVar = c5b.a;
                                                                                this.f = c5bVar;
                                                                                this.g = c5bVar;
                                                                                int i3 = 0;
                                                                                editText.addTextChangedListener(new lb4(i3, this));
                                                                                TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 2, 1.0f, 1, 0.0f, 1, 0.0f);
                                                                                translateAnimation.setDuration(1000L);
                                                                                translateAnimation.setInterpolator(new LinearInterpolator());
                                                                                translateAnimation.setRepeatMode(1);
                                                                                translateAnimation.setRepeatCount(-1);
                                                                                this.i = translateAnimation;
                                                                                kb4 kb4Var = new kb4(i3);
                                                                                kb4Var.c = true;
                                                                                this.j = kb4Var;
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
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static final void a(ChallengerInputView challengerInputView, String str) {
        kb4 kb4Var = challengerInputView.j;
        phk phkVar = challengerInputView.a;
        if (challengerInputView.h) {
            int i = challengerInputView.d;
            kb4Var.c = true;
            phkVar.q.setEnabled(true);
            challengerInputView.h = false;
            Iterator it = challengerInputView.f.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextColor(i);
            }
            challengerInputView.getDotTextView().setTextColor(i);
            challengerInputView.getCurrencyTextView().setText("");
        }
        jb4 jb4Var = challengerInputView.b;
        if (!(jb4Var instanceof ib4)) {
            if (str.length() >= jb4Var.b) {
                challengerInputView.getDotTextView().setText(StringUtils.COMMA);
            } else {
                challengerInputView.getDotTextView().setText("");
            }
        }
        int size = challengerInputView.f.size() - str.length();
        int i2 = 0;
        for (Object obj : CollectionsKt.j0(challengerInputView.f)) {
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
            ((TextView) challengerInputView.f.get(i5)).setText(String.valueOf(str.charAt(i4)));
            i4++;
            i5++;
        }
        challengerInputView.d(str.length());
        if (str.length() == challengerInputView.b.a) {
            Function1 function1 = challengerInputView.c;
            if (function1 != null) {
                function1.invoke(str);
            }
            Iterator it2 = challengerInputView.g.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setContentDescription("");
            }
            kb4Var.c = false;
            phkVar.a.setVisibility(0);
            phkVar.a.startAnimation(challengerInputView.i);
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
        kb4 kb4Var = this.j;
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
        if (u75.g(this.g) >= i) {
            int i2 = 0;
            for (Object obj : this.g) {
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
            View view2 = (View) this.g.get(i);
            kb4 kb4Var = this.j;
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

    public final void e(jb4 jb4Var, Function1 function1) {
        jb4Var.getClass();
        function1.getClass();
        this.b = jb4Var;
        this.c = function1;
        getInput().setFilters(new InputFilter[]{new InputFilter.LengthFilter(jb4Var.a)});
        setOnClickListener(new ol(3, this));
        boolean z = jb4Var instanceof ib4;
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
            this.f = u75.h(phkVar.b, phkVar.d, phkVar.e, phkVar.f, phkVar.h, textView2);
            this.g = u75.h(phkVar.j, view, phkVar.l, phkVar.m, phkVar.n, view3, view2);
            f("•", this.f);
            getDotTextView().setVisibility(0);
            phkVar.c.setVisibility(8);
            getDotCursorView().setVisibility(4);
            view.setVisibility(4);
            getCurrencyTextView().setVisibility(8);
        } else if (jb4Var instanceof hb4) {
            c();
            this.f = u75.h(phkVar.b, phkVar.e, phkVar.f);
            this.g = u75.h(phkVar.j, phkVar.l, phkVar.m, phkVar.n);
            f(CommonUrlParts.Values.FALSE_INTEGER, this.f);
            getDotCursorView().setVisibility(4);
            getDotTextView().setVisibility(0);
            getCurrencyTextView().setVisibility(0);
            getExtraTextView().setVisibility(8);
            getExtraCursorView().setVisibility(8);
        } else if (jb4Var instanceof gb4) {
            c();
            this.f = u75.h(phkVar.b, phkVar.c, phkVar.e, phkVar.f);
            this.g = u75.h(phkVar.j, phkVar.k, phkVar.l, phkVar.m, phkVar.n);
            f(CommonUrlParts.Values.FALSE_INTEGER, this.f);
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
        Iterator it = this.f.iterator();
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
        TranslateAnimation translateAnimation = this.i;
        translateAnimation.cancel();
        translateAnimation.reset();
        if (!(this.b instanceof ib4)) {
            getDotTextView().setText(StringUtils.COMMA);
            getDotTextView().setTextColor(i);
            getCurrencyTextView().setText("₽");
        }
        this.h = true;
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengerInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ChallengerInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengerInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
