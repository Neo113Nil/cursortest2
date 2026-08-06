package androidx.appcompat.widget;

import S1.i;
import a.AbstractC0083a;
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
import c.AbstractC0131a;
import com.watchfacestudio.spraktum.R;
import f.InterfaceC0146a;
import h.AbstractC0197D;
import h.AbstractC0217m;
import h.C0198E;
import h.Q;
import h.S;
import h.T;
import h.U;
import h.V;
import h.W;
import h.X;
import h.Y;
import h.Z;
import h.a0;
import h.b0;
import h.d0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import y.x;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0197D implements InterfaceC0146a {

    /* renamed from: l0, reason: collision with root package name */
    public static final i f2131l0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f2132A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f2133B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f2134C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f2135D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f2136E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2137F;
    public final int G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f2138H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f2139I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f2140J;

    /* renamed from: K, reason: collision with root package name */
    public View.OnFocusChangeListener f2141K;

    /* renamed from: L, reason: collision with root package name */
    public View.OnClickListener f2142L;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2143R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2144S;

    /* renamed from: T, reason: collision with root package name */
    public D.c f2145T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f2146U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f2147V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2148W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2149a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f2150b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2151c0;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f2152d0;
    public boolean e0;
    public int f0;

    /* renamed from: g0, reason: collision with root package name */
    public SearchableInfo f2153g0;

    /* renamed from: h0, reason: collision with root package name */
    public Bundle f2154h0;

    /* renamed from: i0, reason: collision with root package name */
    public final S f2155i0;

    /* renamed from: j0, reason: collision with root package name */
    public final S f2156j0;
    public final WeakHashMap k0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f2157p;

    /* renamed from: q, reason: collision with root package name */
    public final View f2158q;

    /* renamed from: r, reason: collision with root package name */
    public final View f2159r;

    /* renamed from: s, reason: collision with root package name */
    public final View f2160s;
    public final ImageView t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f2161u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f2162v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f2163w;

    /* renamed from: x, reason: collision with root package name */
    public final View f2164x;

    /* renamed from: y, reason: collision with root package name */
    public b0 f2165y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f2166z;

    public static class SearchAutoComplete extends AbstractC0217m {

        /* renamed from: d, reason: collision with root package name */
        public int f2167d;

        /* renamed from: e, reason: collision with root package name */
        public SearchView f2168e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2169f;

        /* renamed from: g, reason: collision with root package name */
        public final c f2170g;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2170g = new c(this);
            this.f2167d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2167d <= 0 || super.enoughToFilter();
        }

        @Override // h.AbstractC0217m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2169f) {
                c cVar = this.f2170g;
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
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f2168e;
            searchView.u(searchView.f2144S);
            searchView.post(searchView.f2155i0);
            if (searchView.f2157p.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
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
                        this.f2168e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            Method method;
            super.onWindowFocusChanged(z2);
            if (z2 && this.f2168e.hasFocus() && getVisibility() == 0) {
                this.f2169f = true;
                Context context = getContext();
                i iVar = SearchView.f2131l0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f2131l0.f1788c) == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f2170g;
            if (!z2) {
                this.f2169f = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2169f = true;
                    return;
                }
                this.f2169f = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2168e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f2167d = i2;
        }
    }

    static {
        i iVar = new i();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            iVar.f1786a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            iVar.f1787b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            iVar.f1788c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f2131l0 = iVar;
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
        SearchAutoComplete searchAutoComplete = this.f2157p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f2149a0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2157p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2149a0 = false;
    }

    public int getImeOptions() {
        return this.f2157p.getImeOptions();
    }

    public int getInputType() {
        return this.f2157p.getInputType();
    }

    public int getMaxWidth() {
        return this.f2150b0;
    }

    public CharSequence getQuery() {
        return this.f2157p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2147V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2153g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2140J : getContext().getText(this.f2153g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.f2137F;
    }

    public D.c getSuggestionsAdapter() {
        return this.f2145T;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2152d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2154h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2153g0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2154h0;
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
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2157p;
        if (i2 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        i iVar = f2131l0;
        Method method = iVar.f1786a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = iVar.f1787b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f2157p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2143R) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int i3;
        String h2;
        Cursor cursor = this.f2145T.f203c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = d0.f3224y;
                String h3 = d0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f2153g0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = d0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f2153g0.getSuggestIntentData();
                }
                if (h4 != null && (h2 = d0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = h(h3, h4 == null ? null : Uri.parse(h4), d0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), d0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2157p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        Editable text = this.f2157p.getText();
        Cursor cursor = this.f2145T.f203c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String c2 = this.f2145T.c(cursor);
        if (c2 != null) {
            setQuery(c2);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f2157p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f2153g0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2155i0);
        post(this.f2156j0);
        super.onDetachedFromWindow();
    }

    @Override // h.AbstractC0197D, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f2133B;
            SearchAutoComplete searchAutoComplete = this.f2157p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2134C;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f2166z;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f2132A;
            rect2.set(i8, 0, i9, i10);
            b0 b0Var = this.f2165y;
            if (b0Var == null) {
                b0 b0Var2 = new b0(rect2, rect, searchAutoComplete);
                this.f2165y = b0Var2;
                setTouchDelegate(b0Var2);
            } else {
                b0Var.f3212b.set(rect2);
                Rect rect3 = b0Var.f3214d;
                rect3.set(rect2);
                int i11 = -b0Var.f3215e;
                rect3.inset(i11, i11);
                b0Var.f3213c.set(rect);
            }
        }
    }

    @Override // h.AbstractC0197D, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f2144S) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f2150b0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2150b0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f2150b0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        super.onRestoreInstanceState(a0Var.f307a);
        u(a0Var.f3209c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        a0Var.f3209c = this.f2144S;
        return a0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f2155i0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f2157p.getText());
        int i2 = (!isEmpty || (this.f2143R && !this.e0)) ? 0 : 8;
        ImageView imageView = this.f2162v;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f2157p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2159r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2160s.getBackground();
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
        boolean z2 = this.f2143R;
        SearchAutoComplete searchAutoComplete = this.f2157p;
        if (z2 && (drawable = this.f2136E) != null) {
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
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f2149a0 || !isFocusable()) {
            return false;
        }
        if (this.f2144S) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f2157p.requestFocus(i2, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f2160s.setVisibility(((this.f2146U || this.f2151c0) && !this.f2144S && (this.f2161u.getVisibility() == 0 || this.f2163w.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2154h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f2157p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2142L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f2143R == z2) {
            return;
        }
        this.f2143R = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i2) {
        this.f2157p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f2157p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f2150b0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2141K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2142L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2147V = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f2148W = z2;
        D.c cVar = this.f2145T;
        if (cVar instanceof d0) {
            ((d0) cVar).f3233q = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2153g0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f2157p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f2153g0.getImeOptions());
            int inputType = this.f2153g0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f2153g0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            D.c cVar = this.f2145T;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f2153g0.getSuggestAuthority() != null) {
                d0 d0Var = new d0(getContext(), this, this.f2153g0, this.k0);
                this.f2145T = d0Var;
                searchAutoComplete.setAdapter(d0Var);
                ((d0) this.f2145T).f3233q = this.f2148W ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f2153g0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f2153g0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f2138H;
            } else if (this.f2153g0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2139I;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f2151c0 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f2144S);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f2146U = z2;
        u(this.f2144S);
    }

    public void setSuggestionsAdapter(D.c cVar) {
        this.f2145T = cVar;
        this.f2157p.setAdapter(cVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.f2146U;
        this.f2161u.setVisibility((!z3 || !(z3 || this.f2151c0) || this.f2144S || !hasFocus() || (!z2 && this.f2151c0)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.f2144S = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f2157p.getText());
        this.t.setVisibility(i3);
        t(!isEmpty);
        this.f2158q.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f2135D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f2143R) ? 8 : 0);
        p();
        if (this.f2151c0 && !this.f2144S && isEmpty) {
            this.f2161u.setVisibility(8);
            i2 = 0;
        }
        this.f2163w.setVisibility(i2);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2166z = new Rect();
        this.f2132A = new Rect();
        this.f2133B = new int[2];
        this.f2134C = new int[2];
        this.f2155i0 = new S(this, 0);
        this.f2156j0 = new S(this, 1);
        this.k0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        V v2 = new V(this);
        W w2 = new W(this);
        C0198E c0198e = new C0198E(1, this);
        Q q2 = new Q(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2634q, i2, 0);
        I0.b bVar2 = new I0.b(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2157p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2158q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f2159r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f2160s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2161u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2162v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2163w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2135D = imageView5;
        Drawable A2 = bVar2.A(10);
        Field field = x.f8596a;
        findViewById.setBackground(A2);
        findViewById2.setBackground(bVar2.A(14));
        imageView.setImageDrawable(bVar2.A(13));
        imageView2.setImageDrawable(bVar2.A(7));
        imageView3.setImageDrawable(bVar2.A(4));
        imageView4.setImageDrawable(bVar2.A(16));
        imageView5.setImageDrawable(bVar2.A(13));
        this.f2136E = bVar2.A(12);
        AbstractC0083a.q(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f2137F = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(q2);
        searchAutoComplete.setOnEditorActionListener(v2);
        searchAutoComplete.setOnItemClickListener(w2);
        searchAutoComplete.setOnItemSelectedListener(c0198e);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new T(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2140J = obtainStyledAttributes.getText(6);
        this.f2147V = obtainStyledAttributes.getText(11);
        int i3 = obtainStyledAttributes.getInt(3, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = obtainStyledAttributes.getInt(2, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        bVar2.K();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2138H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2139I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2164x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new U(this));
        }
        u(this.f2143R);
        r();
    }

    public void setOnCloseListener(X x2) {
    }

    public void setOnQueryTextListener(Y y2) {
    }

    public void setOnSuggestionListener(Z z2) {
    }
}
