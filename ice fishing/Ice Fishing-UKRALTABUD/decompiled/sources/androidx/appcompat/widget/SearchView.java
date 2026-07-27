package androidx.appcompat.widget;

import L.C0051b;
import a.AbstractC0069a;
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
import c.AbstractC0097a;
import com.icedrifter.arcticquest.R;
import f.InterfaceC0136a;
import h.AbstractC0154E;
import h.AbstractC0169m;
import h.C0155F;
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
import h.c0;
import h.d0;
import h.f0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w.x;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0154E implements InterfaceC0136a {

    /* renamed from: l0, reason: collision with root package name */
    public static final Y f1169l0;

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f1170A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f1171B;

    /* renamed from: C, reason: collision with root package name */
    public final View f1172C;

    /* renamed from: D, reason: collision with root package name */
    public d0 f1173D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f1174E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f1175F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f1176G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f1177H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f1178I;

    /* renamed from: J, reason: collision with root package name */
    public final Drawable f1179J;

    /* renamed from: K, reason: collision with root package name */
    public final int f1180K;

    /* renamed from: L, reason: collision with root package name */
    public final int f1181L;

    /* renamed from: M, reason: collision with root package name */
    public final Intent f1182M;

    /* renamed from: N, reason: collision with root package name */
    public final Intent f1183N;

    /* renamed from: O, reason: collision with root package name */
    public final CharSequence f1184O;

    /* renamed from: P, reason: collision with root package name */
    public View.OnFocusChangeListener f1185P;

    /* renamed from: Q, reason: collision with root package name */
    public View.OnClickListener f1186Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f1187R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1188S;
    public B.c T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1189U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f1190V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f1191W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1192a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1193b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1194c0;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f1195d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1196e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1197f0;

    /* renamed from: g0, reason: collision with root package name */
    public SearchableInfo f1198g0;

    /* renamed from: h0, reason: collision with root package name */
    public Bundle f1199h0;
    public final T i0;

    /* renamed from: j0, reason: collision with root package name */
    public final T f1200j0;
    public final WeakHashMap k0;

    /* renamed from: u, reason: collision with root package name */
    public final SearchAutoComplete f1201u;

    /* renamed from: v, reason: collision with root package name */
    public final View f1202v;

    /* renamed from: w, reason: collision with root package name */
    public final View f1203w;

    /* renamed from: x, reason: collision with root package name */
    public final View f1204x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f1205y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f1206z;

    public static class SearchAutoComplete extends AbstractC0169m {

        /* renamed from: i, reason: collision with root package name */
        public int f1207i;

        /* renamed from: j, reason: collision with root package name */
        public SearchView f1208j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1209k;

        /* renamed from: l, reason: collision with root package name */
        public final c f1210l;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1210l = new c(this);
            this.f1207i = getThreshold();
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
            return this.f1207i <= 0 || super.enoughToFilter();
        }

        @Override // h.AbstractC0169m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1209k) {
                c cVar = this.f1210l;
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
            SearchView searchView = this.f1208j;
            searchView.u(searchView.f1188S);
            searchView.post(searchView.i0);
            if (searchView.f1201u.hasFocus()) {
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
                        this.f1208j.clearFocus();
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
            if (z2 && this.f1208j.hasFocus() && getVisibility() == 0) {
                this.f1209k = true;
                Context context = getContext();
                Y y2 = SearchView.f1169l0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f1169l0.f2143c) == null) {
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
            c cVar = this.f1210l;
            if (!z2) {
                this.f1209k = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1209k = true;
                    return;
                }
                this.f1209k = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1208j = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1207i = i2;
        }
    }

    static {
        Y y2 = new Y();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            y2.f2141a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            y2.f2142b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            y2.f2143c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f1169l0 = y2;
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
        SearchAutoComplete searchAutoComplete = this.f1201u;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1192a0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1201u;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1192a0 = false;
    }

    public int getImeOptions() {
        return this.f1201u.getImeOptions();
    }

    public int getInputType() {
        return this.f1201u.getInputType();
    }

    public int getMaxWidth() {
        return this.f1193b0;
    }

    public CharSequence getQuery() {
        return this.f1201u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1190V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1198g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1184O : getContext().getText(this.f1198g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1181L;
    }

    public int getSuggestionRowLayout() {
        return this.f1180K;
    }

    public B.c getSuggestionsAdapter() {
        return this.T;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1195d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1199h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1198g0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1199h0;
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
        SearchAutoComplete searchAutoComplete = this.f1201u;
        if (i2 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        Y y2 = f1169l0;
        Method method = y2.f2141a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = y2.f2142b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f1201u;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1187R) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int i3;
        String h2;
        Cursor cursor = this.T.f46h;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = f0.f2162D;
                String h3 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f1198g0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f1198g0.getSuggestIntentData();
                }
                if (h4 != null && (h2 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = h(h3, h4 == null ? null : Uri.parse(h4), f0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), f0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
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
        SearchAutoComplete searchAutoComplete = this.f1201u;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        Editable text = this.f1201u.getText();
        Cursor cursor = this.T.f46h;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String c2 = this.T.c(cursor);
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
        SearchAutoComplete searchAutoComplete = this.f1201u;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1198g0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.i0);
        post(this.f1200j0);
        super.onDetachedFromWindow();
    }

    @Override // h.AbstractC0154E, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f1176G;
            SearchAutoComplete searchAutoComplete = this.f1201u;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1177H;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f1174E;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f1175F;
            rect2.set(i8, 0, i9, i10);
            d0 d0Var = this.f1173D;
            if (d0Var == null) {
                d0 d0Var2 = new d0(rect2, rect, searchAutoComplete);
                this.f1173D = d0Var2;
                setTouchDelegate(d0Var2);
            } else {
                d0Var.f2150b.set(rect2);
                Rect rect3 = d0Var.f2152d;
                rect3.set(rect2);
                int i11 = -d0Var.f2153e;
                rect3.inset(i11, i11);
                d0Var.f2151c.set(rect);
            }
        }
    }

    @Override // h.AbstractC0154E, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1188S) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1193b0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1193b0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1193b0) > 0) {
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
        if (!(parcelable instanceof c0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c0 c0Var = (c0) parcelable;
        super.onRestoreInstanceState(c0Var.f55a);
        u(c0Var.f2148c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c0 c0Var = new c0(super.onSaveInstanceState());
        c0Var.f2148c = this.f1188S;
        return c0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.i0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f1201u.getText());
        int i2 = (!isEmpty || (this.f1187R && !this.f1196e0)) ? 0 : 8;
        ImageView imageView = this.f1170A;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f1201u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1203w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1204x.getBackground();
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
        boolean z2 = this.f1187R;
        SearchAutoComplete searchAutoComplete = this.f1201u;
        if (z2 && (drawable = this.f1179J) != null) {
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
        if (this.f1192a0 || !isFocusable()) {
            return false;
        }
        if (this.f1188S) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f1201u.requestFocus(i2, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f1204x.setVisibility(((this.f1189U || this.f1194c0) && !this.f1188S && (this.f1206z.getVisibility() == 0 || this.f1171B.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1199h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f1201u;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1186Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f1187R == z2) {
            return;
        }
        this.f1187R = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i2) {
        this.f1201u.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1201u.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f1193b0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1185P = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1186Q = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1190V = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f1191W = z2;
        B.c cVar = this.T;
        if (cVar instanceof f0) {
            ((f0) cVar).f2173v = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1198g0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f1201u;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1198g0.getImeOptions());
            int inputType = this.f1198g0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1198g0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            B.c cVar = this.T;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f1198g0.getSuggestAuthority() != null) {
                f0 f0Var = new f0(getContext(), this, this.f1198g0, this.k0);
                this.T = f0Var;
                searchAutoComplete.setAdapter(f0Var);
                ((f0) this.T).f2173v = this.f1191W ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f1198g0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1198g0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1182M;
            } else if (this.f1198g0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1183N;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f1194c0 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f1188S);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f1189U = z2;
        u(this.f1188S);
    }

    public void setSuggestionsAdapter(B.c cVar) {
        this.T = cVar;
        this.f1201u.setAdapter(cVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.f1189U;
        this.f1206z.setVisibility((!z3 || !(z3 || this.f1194c0) || this.f1188S || !hasFocus() || (!z2 && this.f1194c0)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.f1188S = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f1201u.getText());
        this.f1205y.setVisibility(i3);
        t(!isEmpty);
        this.f1202v.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f1178I;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1187R) ? 8 : 0);
        p();
        if (this.f1194c0 && !this.f1188S && isEmpty) {
            this.f1206z.setVisibility(8);
            i2 = 0;
        }
        this.f1171B.setVisibility(i2);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1174E = new Rect();
        this.f1175F = new Rect();
        this.f1176G = new int[2];
        this.f1177H = new int[2];
        this.i0 = new T(this, 0);
        this.f1200j0 = new T(this, 1);
        this.k0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        W w2 = new W(this);
        X x2 = new X(this);
        C0155F c0155f = new C0155F(1, this);
        S s2 = new S(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f1645q, i2, 0);
        C0051b c0051b = new C0051b(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1201u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1202v = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1203w = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1204x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1205y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1206z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1170A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1171B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1178I = imageView5;
        Drawable x3 = c0051b.x(10);
        Field field = x.f3069a;
        findViewById.setBackground(x3);
        findViewById2.setBackground(c0051b.x(14));
        imageView.setImageDrawable(c0051b.x(13));
        imageView2.setImageDrawable(c0051b.x(7));
        imageView3.setImageDrawable(c0051b.x(4));
        imageView4.setImageDrawable(c0051b.x(16));
        imageView5.setImageDrawable(c0051b.x(13));
        this.f1179J = c0051b.x(12);
        AbstractC0069a.F(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1180K = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1181L = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(s2);
        searchAutoComplete.setOnEditorActionListener(w2);
        searchAutoComplete.setOnItemClickListener(x2);
        searchAutoComplete.setOnItemSelectedListener(c0155f);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new U(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1184O = obtainStyledAttributes.getText(6);
        this.f1190V = obtainStyledAttributes.getText(11);
        int i3 = obtainStyledAttributes.getInt(3, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = obtainStyledAttributes.getInt(2, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        c0051b.H();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1182M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1183N = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1172C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new V(this));
        }
        u(this.f1187R);
        r();
    }

    public void setOnCloseListener(Z z2) {
    }

    public void setOnQueryTextListener(a0 a0Var) {
    }

    public void setOnSuggestionListener(b0 b0Var) {
    }
}
