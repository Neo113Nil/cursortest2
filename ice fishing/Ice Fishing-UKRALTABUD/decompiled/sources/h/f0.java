package h;

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
import com.icedrifter.arcticquest.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import n.AbstractC0219a;

/* loaded from: classes.dex */
public final class f0 extends B.c implements View.OnClickListener {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f2162D = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f2163A;

    /* renamed from: B, reason: collision with root package name */
    public int f2164B;

    /* renamed from: C, reason: collision with root package name */
    public int f2165C;

    /* renamed from: n, reason: collision with root package name */
    public final int f2166n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2167o;

    /* renamed from: p, reason: collision with root package name */
    public final LayoutInflater f2168p;

    /* renamed from: q, reason: collision with root package name */
    public final SearchView f2169q;
    public final SearchableInfo r;

    /* renamed from: s, reason: collision with root package name */
    public final Context f2170s;

    /* renamed from: t, reason: collision with root package name */
    public final WeakHashMap f2171t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2172u;

    /* renamed from: v, reason: collision with root package name */
    public int f2173v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f2174w;

    /* renamed from: x, reason: collision with root package name */
    public int f2175x;

    /* renamed from: y, reason: collision with root package name */
    public int f2176y;

    /* renamed from: z, reason: collision with root package name */
    public int f2177z;

    public f0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f45g = true;
        this.f46h = null;
        this.f44f = false;
        this.f47i = context;
        this.f48j = -1;
        this.f49k = new B.a(this);
        this.f50l = new B.b(0, this);
        this.f2167o = suggestionRowLayout;
        this.f2166n = suggestionRowLayout;
        this.f2168p = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2173v = 1;
        this.f2175x = -1;
        this.f2176y = -1;
        this.f2177z = -1;
        this.f2163A = -1;
        this.f2164B = -1;
        this.f2165C = -1;
        this.f2169q = searchView;
        this.r = searchableInfo;
        this.f2172u = searchView.getSuggestionCommitIconResId();
        this.f2170s = context;
        this.f2171t = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    @Override // B.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        Drawable f2;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        e0 e0Var = (e0) view.getTag();
        int i2 = this.f2165C;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = e0Var.f2155a;
        if (textView != null) {
            String h2 = h(cursor, this.f2175x);
            textView.setText(h2);
            if (TextUtils.isEmpty(h2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        TextView textView2 = e0Var.f2156b;
        if (textView2 != null) {
            String h3 = h(cursor, this.f2177z);
            if (h3 != null) {
                if (this.f2174w == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f47i.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f2174w = this.f47i.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h3);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2174w, null), 0, h3.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f2176y);
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
        ImageView imageView = e0Var.f2157c;
        if (imageView != null) {
            int i4 = this.f2163A;
            if (i4 == -1) {
                f2 = null;
            } else {
                f2 = f(cursor.getString(i4));
                if (f2 == null) {
                    ComponentName searchActivity = this.r.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f2171t;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f2 = constantState == null ? null : constantState.newDrawable(this.f2170s.getResources());
                    } else {
                        PackageManager packageManager = this.f47i.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.w("SuggestionsAdapter", e2.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                            } else {
                                f2 = drawable;
                                weakHashMap.put(flattenToShortString, f2 != null ? null : f2.getConstantState());
                            }
                        }
                        f2 = null;
                        weakHashMap.put(flattenToShortString, f2 != null ? null : f2.getConstantState());
                    }
                    if (f2 == null) {
                        f2 = this.f47i.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(f2);
            if (f2 == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                f2.setVisible(false, false);
                f2.setVisible(true, false);
            }
        }
        ImageView imageView2 = e0Var.f2158d;
        if (imageView2 != null) {
            int i5 = this.f2164B;
            Drawable f3 = i5 == -1 ? null : f(cursor.getString(i5));
            imageView2.setImageDrawable(f3);
            if (f3 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                f3.setVisible(false, false);
                f3.setVisible(true, false);
            }
        }
        int i6 = this.f2173v;
        ImageView imageView3 = e0Var.f2159e;
        if (i6 != 2 && (i6 != 1 || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // B.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f2175x = cursor.getColumnIndex("suggest_text_1");
                this.f2176y = cursor.getColumnIndex("suggest_text_2");
                this.f2177z = cursor.getColumnIndex("suggest_text_2_url");
                this.f2163A = cursor.getColumnIndex("suggest_icon_1");
                this.f2164B = cursor.getColumnIndex("suggest_icon_2");
                this.f2165C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // B.c
    public final String c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        SearchableInfo searchableInfo = this.r;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    @Override // B.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f2168p.inflate(this.f2166n, viewGroup, false);
        inflate.setTag(new e0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f2172u);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f47i.getPackageManager().getResourcesForApplication(authority);
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
        WeakHashMap weakHashMap = this.f2171t;
        Context context = this.f2170s;
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
                Drawable b2 = AbstractC0219a.b(context, parseInt);
                if (b2 != null) {
                    weakHashMap.put(str2, b2.getConstantState());
                }
                return b2;
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
                } catch (FileNotFoundException e2) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e2.getMessage());
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
                        } catch (IOException e3) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e3);
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
        return this.f47i.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // B.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f2168p.inflate(this.f2167o, viewGroup, false);
            if (inflate != null) {
                ((e0) inflate.getTag()).f2155a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // B.c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(viewGroup);
            ((e0) d2.getTag()).f2155a.setText(e2.toString());
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f46h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f46h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2169q.n((CharSequence) tag);
        }
    }
}
