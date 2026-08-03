package m;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i1 extends m3.b implements View.OnClickListener {
    public static final /* synthetic */ int D = 0;
    public int A;
    public int B;
    public int C;

    /* renamed from: n, reason: collision with root package name */
    public final int f4347n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4348o;

    /* renamed from: p, reason: collision with root package name */
    public final LayoutInflater f4349p;

    /* renamed from: q, reason: collision with root package name */
    public final SearchView f4350q;

    /* renamed from: r, reason: collision with root package name */
    public final SearchableInfo f4351r;

    /* renamed from: s, reason: collision with root package name */
    public final Context f4352s;

    /* renamed from: t, reason: collision with root package name */
    public final WeakHashMap f4353t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4354u;

    /* renamed from: v, reason: collision with root package name */
    public int f4355v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f4356w;

    /* renamed from: x, reason: collision with root package name */
    public int f4357x;

    /* renamed from: y, reason: collision with root package name */
    public int f4358y;

    /* renamed from: z, reason: collision with root package name */
    public int f4359z;

    public i1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f4863h = true;
        this.f4864i = null;
        this.f4862g = false;
        this.f4865j = -1;
        this.f4866k = new m3.a(this);
        this.f4867l = new l0(1, this);
        this.f4348o = suggestionRowLayout;
        this.f4347n = suggestionRowLayout;
        this.f4349p = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f4355v = 1;
        this.f4357x = -1;
        this.f4358y = -1;
        this.f4359z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.f4350q = searchView;
        this.f4351r = searchableInfo;
        this.f4354u = searchView.getSuggestionCommitIconResId();
        this.f4352s = context;
        this.f4353t = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    @Override // m3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i10;
        int i11;
        Drawable f10;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        h1 h1Var = (h1) view.getTag();
        int i12 = this.C;
        int i13 = i12 != -1 ? cursor.getInt(i12) : 0;
        TextView textView = h1Var.f4307a;
        TextView textView2 = h1Var.f4308b;
        ImageView imageView = h1Var.f4311e;
        if (textView != null) {
            String h10 = h(cursor, this.f4357x);
            textView.setText(h10);
            if (TextUtils.isEmpty(h10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f4352s;
        if (textView2 != null) {
            String h11 = h(cursor, this.f4359z);
            if (h11 != null) {
                if (this.f4356w == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f4356w = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h11);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f4356w, null), 0, h11.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f4358y);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = h1Var.f4309c;
        if (imageView2 != null) {
            int i14 = this.A;
            if (i14 == -1) {
                f10 = null;
            } else {
                f10 = f(cursor.getString(i14));
                if (f10 == null) {
                    ComponentName searchActivity = this.f4351r.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f4353t;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f10 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.w("SuggestionsAdapter", e10.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                            } else {
                                f10 = drawable;
                                weakHashMap.put(flattenToShortString, f10 != null ? null : f10.getConstantState());
                            }
                        }
                        f10 = null;
                        weakHashMap.put(flattenToShortString, f10 != null ? null : f10.getConstantState());
                    }
                    if (f10 == null) {
                        f10 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f10);
            if (f10 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f10.setVisible(false, false);
                f10.setVisible(true, false);
            }
        }
        ImageView imageView3 = h1Var.f4310d;
        if (imageView3 != null) {
            int i15 = this.B;
            Drawable f11 = i15 == -1 ? null : f(cursor.getString(i15));
            imageView3.setImageDrawable(f11);
            if (f11 != null) {
                imageView3.setVisibility(0);
                f11.setVisible(false, false);
                i10 = 1;
                f11.setVisible(true, false);
                i11 = this.f4355v;
                if (i11 == 2 && (i11 != i10 || (i13 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i10 = 1;
        i11 = this.f4355v;
        if (i11 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // m3.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f4357x = cursor.getColumnIndex("suggest_text_1");
                this.f4358y = cursor.getColumnIndex("suggest_text_2");
                this.f4359z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // m3.b
    public final String c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        SearchableInfo searchableInfo = this.f4351r;
        if (searchableInfo.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    @Override // m3.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f4349p.inflate(this.f4347n, viewGroup, false);
        inflate.setTag(new h1(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f4354u);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f4352s.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f4353t;
        Context context = this.f4352s;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e10) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e10.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e11) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e11);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } finally {
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f4352s.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // m3.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f4349p.inflate(this.f4348o, viewGroup, false);
            if (inflate != null) {
                ((h1) inflate.getTag()).f4307a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // m3.b, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View d10 = d(viewGroup);
            ((h1) d10.getTag()).f4307a.setText(e10.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f4864i;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f4864i;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f4350q.n((CharSequence) tag);
        }
    }
}
