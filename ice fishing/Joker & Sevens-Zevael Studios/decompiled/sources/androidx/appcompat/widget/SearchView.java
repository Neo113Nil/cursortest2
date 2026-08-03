package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import hc.f;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.a1;
import m.b1;
import m.c1;
import m.d1;
import m.e1;
import m.f1;
import m.g1;
import m.i0;
import m.i1;
import m.j0;
import m.m;
import m.w0;
import m.x0;
import m.y0;
import m.z0;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class SearchView extends i0 implements k.a {

    /* renamed from: m0, reason: collision with root package name */
    public static final f f437m0;
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final View D;
    public g1 E;
    public final Rect F;
    public final Rect G;
    public final int[] H;
    public final int[] I;
    public final ImageView J;
    public final Drawable K;
    public final int L;
    public final int M;
    public final Intent N;
    public final Intent O;
    public final CharSequence P;
    public View.OnFocusChangeListener Q;
    public View.OnClickListener R;
    public boolean S;
    public boolean T;
    public m3.b U;
    public boolean V;
    public CharSequence W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f438a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f439b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f440c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f441d0;

    /* renamed from: e0, reason: collision with root package name */
    public CharSequence f442e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f443f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f444g0;
    public SearchableInfo h0;

    /* renamed from: i0, reason: collision with root package name */
    public Bundle f445i0;

    /* renamed from: j0, reason: collision with root package name */
    public final x0 f446j0;

    /* renamed from: k0, reason: collision with root package name */
    public final x0 f447k0;

    /* renamed from: l0, reason: collision with root package name */
    public final WeakHashMap f448l0;

    /* renamed from: v, reason: collision with root package name */
    public final SearchAutoComplete f449v;

    /* renamed from: w, reason: collision with root package name */
    public final View f450w;

    /* renamed from: x, reason: collision with root package name */
    public final View f451x;

    /* renamed from: y, reason: collision with root package name */
    public final View f452y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f453z;

    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            f fVar2 = new f();
            fVar2.f2872a = null;
            fVar2.f2873b = null;
            fVar2.f2874c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                fVar2.f2872a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                fVar2.f2873b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                fVar2.f2874c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = fVar2;
        }
        f437m0 = fVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f449v;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f439b0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f449v;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f439b0 = false;
    }

    public int getImeOptions() {
        return this.f449v.getImeOptions();
    }

    public int getInputType() {
        return this.f449v.getInputType();
    }

    public int getMaxWidth() {
        return this.f440c0;
    }

    public CharSequence getQuery() {
        return this.f449v.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.h0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.P : getContext().getText(this.h0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.M;
    }

    public int getSuggestionRowLayout() {
        return this.L;
    }

    public m3.b getSuggestionsAdapter() {
        return this.U;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f442e0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f445i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.h0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f445i0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f449v;
        if (i10 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        f fVar = f437m0;
        fVar.getClass();
        f.a();
        Method method = fVar.f2872a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        f.a();
        Method method2 = fVar.f2873b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f449v;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.S) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i10) {
        int i11;
        String h10;
        Cursor cursor = this.U.f4864i;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = i1.D;
                String h11 = i1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.h0.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String h12 = i1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.h0.getSuggestIntentData();
                }
                if (h12 != null && (h10 = i1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h12 = h12 + "/" + Uri.encode(h10);
                }
                intent = h(h11, h12 == null ? null : Uri.parse(h12), i1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), i1.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f449v;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i10) {
        Editable text = this.f449v.getText();
        Cursor cursor = this.U.f4864i;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        String c3 = this.U.c(cursor);
        if (c3 != null) {
            setQuery(c3);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f449v;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.h0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f446j0);
        post(this.f447k0);
        super.onDetachedFromWindow();
    }

    @Override // m.i0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f449v;
            int[] iArr = this.H;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.I;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.F;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.G;
            rect2.set(i16, 0, i17, i18);
            g1 g1Var = this.E;
            if (g1Var == null) {
                g1 g1Var2 = new g1(rect2, rect, searchAutoComplete);
                this.E = g1Var2;
                setTouchDelegate(g1Var2);
            } else {
                g1Var.f4301b.set(rect2);
                Rect rect3 = g1Var.f4303d;
                rect3.set(rect2);
                int i19 = -g1Var.f4304e;
                rect3.inset(i19, i19);
                g1Var.f4302c.set(rect);
            }
        }
    }

    @Override // m.i0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.T) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f440c0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f440c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f440c0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f1 f1Var = (f1) parcelable;
        super.onRestoreInstanceState(f1Var.f5182g);
        u(f1Var.f4296i);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f1 f1Var = new f1(super.onSaveInstanceState());
        f1Var.f4296i = this.T;
        return f1Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f446j0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f449v.getText());
        int i10 = (!isEmpty || (this.S && !this.f443f0)) ? 0 : 8;
        ImageView imageView = this.B;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f449v.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f451x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f452y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.S;
        SearchAutoComplete searchAutoComplete = this.f449v;
        if (z10 && (drawable = this.K) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f439b0 || !isFocusable()) {
            return false;
        }
        if (this.T) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f449v.requestFocus(i10, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f452y.setVisibility(((this.V || this.f441d0) && !this.T && (this.A.getVisibility() == 0 || this.C.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f445i0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f449v;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        u(z10);
        r();
    }

    public void setImeOptions(int i10) {
        this.f449v.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f449v.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f440c0 = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.W = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f438a0 = z10;
        m3.b bVar = this.U;
        if (bVar instanceof i1) {
            ((i1) bVar).f4355v = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.h0 = searchableInfo;
        Intent intent = null;
        boolean z10 = true;
        SearchAutoComplete searchAutoComplete = this.f449v;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.h0.getImeOptions());
            int inputType = this.h0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.h0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            m3.b bVar = this.U;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.h0.getSuggestAuthority() != null) {
                i1 i1Var = new i1(getContext(), this, this.h0, this.f448l0);
                this.U = i1Var;
                searchAutoComplete.setAdapter(i1Var);
                ((i1) this.U).f4355v = this.f438a0 ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.h0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.h0.getVoiceSearchLaunchWebSearch()) {
                intent = this.N;
            } else if (this.h0.getVoiceSearchLaunchRecognizer()) {
                intent = this.O;
            }
            if (intent != null) {
            }
        }
        z10 = false;
        this.f441d0 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.T);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.V = z10;
        u(this.T);
    }

    public void setSuggestionsAdapter(m3.b bVar) {
        this.U = bVar;
        this.f449v.setAdapter(bVar);
    }

    public final void t(boolean z10) {
        boolean z11 = this.V;
        this.A.setVisibility((!z11 || !(z11 || this.f441d0) || this.T || !hasFocus() || (!z10 && this.f441d0)) ? 8 : 0);
    }

    public final void u(boolean z10) {
        this.T = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f449v.getText());
        this.f453z.setVisibility(i11);
        t(!isEmpty);
        this.f450w.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.J;
        imageView.setVisibility((imageView.getDrawable() == null || this.S) ? 8 : 0);
        p();
        if (this.f441d0 && !this.T && isEmpty) {
            this.A.setVisibility(8);
            i10 = 0;
        }
        this.C.setVisibility(i10);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new int[2];
        this.I = new int[2];
        this.f446j0 = new x0(this, 0);
        this.f447k0 = new x0(this, 1);
        this.f448l0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        a1 a1Var = new a1(this);
        b1 b1Var = new b1(this);
        j0 j0Var = new j0(1, this);
        w0 w0Var = new w0(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f2926q, i10, 0);
        a5.c cVar = new a5.c(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f449v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f450w = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f451x = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f452y = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f453z = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.A = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.B = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.C = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.J = imageView5;
        findViewById.setBackground(cVar.v(10));
        findViewById2.setBackground(cVar.v(14));
        imageView.setImageDrawable(cVar.v(13));
        imageView2.setImageDrawable(cVar.v(7));
        imageView3.setImageDrawable(cVar.v(4));
        imageView4.setImageDrawable(cVar.v(16));
        imageView5.setImageDrawable(cVar.v(13));
        this.K = cVar.v(12);
        imageView.setTooltipText(getResources().getString(R.string.abc_searchview_description_search));
        this.L = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(w0Var);
        searchAutoComplete.setOnEditorActionListener(a1Var);
        searchAutoComplete.setOnItemClickListener(b1Var);
        searchAutoComplete.setOnItemSelectedListener(j0Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new y0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.P = obtainStyledAttributes.getText(6);
        this.W = obtainStyledAttributes.getText(11);
        int i11 = obtainStyledAttributes.getInt(3, -1);
        if (i11 != -1) {
            setImeOptions(i11);
        }
        int i12 = obtainStyledAttributes.getInt(2, -1);
        if (i12 != -1) {
            setInputType(i12);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        cVar.F();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.N = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.O = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.D = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new z0(this));
        }
        u(this.S);
        r();
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static class SearchAutoComplete extends m {

        /* renamed from: j, reason: collision with root package name */
        public int f454j;

        /* renamed from: k, reason: collision with root package name */
        public SearchView f455k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f456l;

        /* renamed from: m, reason: collision with root package name */
        public final c f457m;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f457m = new c(this);
            this.f454j = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.f437m0;
            fVar.getClass();
            f.a();
            Method method = fVar.f2874c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f454j <= 0 || super.enoughToFilter();
        }

        @Override // m.m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f456l) {
                c cVar = this.f457m;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f455k;
            searchView.u(searchView.T);
            searchView.post(searchView.f446j0);
            if (searchView.f449v.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f455k.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f455k.hasFocus() && getVisibility() == 0) {
                this.f456l = true;
                Context context = getContext();
                f fVar = SearchView.f437m0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f457m;
            if (!z10) {
                this.f456l = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f456l = true;
                    return;
                }
                this.f456l = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f455k = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f454j = i10;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(c1 c1Var) {
    }

    public void setOnQueryTextListener(d1 d1Var) {
    }

    public void setOnSuggestionListener(e1 e1Var) {
    }
}
