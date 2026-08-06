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
import com.watchfacestudio.spraktum.R;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p.AbstractC0999a;

/* loaded from: classes.dex */
public final class d0 extends D.c implements View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f3224y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f3225i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3226j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f3227k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f3228l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f3229m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f3230n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f3231o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3232p;

    /* renamed from: q, reason: collision with root package name */
    public int f3233q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f3234r;

    /* renamed from: s, reason: collision with root package name */
    public int f3235s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f3236u;

    /* renamed from: v, reason: collision with root package name */
    public int f3237v;

    /* renamed from: w, reason: collision with root package name */
    public int f3238w;

    /* renamed from: x, reason: collision with root package name */
    public int f3239x;

    public d0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f202b = true;
        this.f203c = null;
        this.f201a = false;
        this.f204d = context;
        this.f205e = -1;
        this.f206f = new D.a(this);
        this.f207g = new D.b(0, this);
        this.f3226j = suggestionRowLayout;
        this.f3225i = suggestionRowLayout;
        this.f3227k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f3233q = 1;
        this.f3235s = -1;
        this.t = -1;
        this.f3236u = -1;
        this.f3237v = -1;
        this.f3238w = -1;
        this.f3239x = -1;
        this.f3228l = searchView;
        this.f3229m = searchableInfo;
        this.f3232p = searchView.getSuggestionCommitIconResId();
        this.f3230n = context;
        this.f3231o = weakHashMap;
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
    @Override // D.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        Drawable f2;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        c0 c0Var = (c0) view.getTag();
        int i2 = this.f3239x;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = c0Var.f3219a;
        if (textView != null) {
            String h2 = h(cursor, this.f3235s);
            textView.setText(h2);
            if (TextUtils.isEmpty(h2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        TextView textView2 = c0Var.f3220b;
        if (textView2 != null) {
            String h3 = h(cursor, this.f3236u);
            if (h3 != null) {
                if (this.f3234r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f204d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f3234r = this.f204d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h3);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3234r, null), 0, h3.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.t);
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
        ImageView imageView = c0Var.f3221c;
        if (imageView != null) {
            int i4 = this.f3237v;
            if (i4 == -1) {
                f2 = null;
            } else {
                f2 = f(cursor.getString(i4));
                if (f2 == null) {
                    ComponentName searchActivity = this.f3229m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f3231o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f2 = constantState == null ? null : constantState.newDrawable(this.f3230n.getResources());
                    } else {
                        PackageManager packageManager = this.f204d.getPackageManager();
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
                        f2 = this.f204d.getPackageManager().getDefaultActivityIcon();
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
        ImageView imageView2 = c0Var.f3222d;
        if (imageView2 != null) {
            int i5 = this.f3238w;
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
        int i6 = this.f3233q;
        ImageView imageView3 = c0Var.f3223e;
        if (i6 != 2 && (i6 != 1 || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // D.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f3235s = cursor.getColumnIndex("suggest_text_1");
                this.t = cursor.getColumnIndex("suggest_text_2");
                this.f3236u = cursor.getColumnIndex("suggest_text_2_url");
                this.f3237v = cursor.getColumnIndex("suggest_icon_1");
                this.f3238w = cursor.getColumnIndex("suggest_icon_2");
                this.f3239x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // D.c
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
        SearchableInfo searchableInfo = this.f3229m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    @Override // D.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f3227k.inflate(this.f3225i, viewGroup, false);
        inflate.setTag(new c0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f3232p);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f204d.getPackageManager().getResourcesForApplication(authority);
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
        WeakHashMap weakHashMap = this.f3231o;
        Context context = this.f3230n;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !CommonUrlParts.Values.FALSE_INTEGER.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable b2 = AbstractC0999a.b(context, parseInt);
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
        return this.f204d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // D.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f3227k.inflate(this.f3226j, viewGroup, false);
            if (inflate != null) {
                ((c0) inflate.getTag()).f3219a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // D.c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(viewGroup);
            ((c0) d2.getTag()).f3219a.setText(e2.toString());
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
        Cursor cursor = this.f203c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f203c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3228l.n((CharSequence) tag);
        }
    }
}
