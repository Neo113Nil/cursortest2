package androidx.appcompat.widget;

import android.R;
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
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int mCommitIconResId;
    public int mFlagsCol;
    public int mIconName1Col;
    public int mIconName2Col;
    public final WeakHashMap mOutsideDrawablesCache;
    public final Context mProviderContext;
    public int mQueryRefinement;
    public final SearchView mSearchView;
    public final SearchableInfo mSearchable;
    public int mText1Col;
    public int mText2Col;
    public int mText2UrlCol;
    public ColorStateList mUrlColor;

    public final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
            this.mText1 = (TextView) view.findViewById(R.id.text1);
            this.mText2 = (TextView) view.findViewById(R.id.text2);
            this.mIcon1 = (ImageView) view.findViewById(R.id.icon1);
            this.mIcon2 = (ImageView) view.findViewById(R.id.icon2);
            this.mIconRefine = (ImageView) view.findViewById(com.squareup.cash.R.id.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int i = searchView.mSuggestionRowLayout;
        init(context, null, 1);
        this.mDropDownLayout = i;
        this.mLayout = i;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.mQueryRefinement = 1;
        this.mText1Col = -1;
        this.mText2Col = -1;
        this.mText2UrlCol = -1;
        this.mIconName1Col = -1;
        this.mIconName2Col = -1;
        this.mFlagsCol = -1;
        this.mSearchView = searchView;
        this.mSearchable = searchableInfo;
        this.mCommitIconResId = searchView.mSuggestionCommitIconResId;
        this.mProviderContext = context;
        this.mOutsideDrawablesCache = weakHashMap;
    }

    public static String getStringOrNull(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    @Override // androidx.cursoradapter.widget.CursorAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, Cursor cursor) {
        int i;
        int i2;
        Drawable drawableFromResourceValue;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i3 = this.mFlagsCol;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        TextView textView = childViewCache.mText1;
        TextView textView2 = childViewCache.mText2;
        ImageView imageView = childViewCache.mIconRefine;
        if (textView != null) {
            String stringOrNull = getStringOrNull(cursor, this.mText1Col);
            textView.setText(stringOrNull);
            if (TextUtils.isEmpty(stringOrNull)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.mProviderContext;
        if (textView2 != null) {
            String stringOrNull2 = getStringOrNull(cursor, this.mText2UrlCol);
            if (stringOrNull2 != null) {
                if (this.mUrlColor == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(com.squareup.cash.R.attr.textColorSearchUrl, typedValue, true);
                    this.mUrlColor = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(stringOrNull2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.mUrlColor, null), 0, stringOrNull2.length(), 33);
                str = spannableString;
            } else {
                str = getStringOrNull(cursor, this.mText2Col);
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
        ImageView imageView2 = childViewCache.mIcon1;
        if (imageView2 != null) {
            int i5 = this.mIconName1Col;
            if (i5 == -1) {
                drawableFromResourceValue = null;
            } else {
                drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(i5));
                if (drawableFromResourceValue == null) {
                    ComponentName searchActivity = this.mSearchable.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.mOutsideDrawablesCache;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        drawableFromResourceValue = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(iconResource, "Invalid icon resource ", " for ");
                                m2m.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", m2m.toString());
                            } else {
                                drawableFromResourceValue = drawable;
                                weakHashMap.put(flattenToShortString, drawableFromResourceValue != null ? null : drawableFromResourceValue.getConstantState());
                            }
                        }
                        drawableFromResourceValue = null;
                        weakHashMap.put(flattenToShortString, drawableFromResourceValue != null ? null : drawableFromResourceValue.getConstantState());
                    }
                    if (drawableFromResourceValue == null) {
                        drawableFromResourceValue = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableFromResourceValue);
            if (drawableFromResourceValue == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableFromResourceValue.setVisible(false, false);
                drawableFromResourceValue.setVisible(true, false);
            }
        }
        ImageView imageView3 = childViewCache.mIcon2;
        if (imageView3 != null) {
            int i6 = this.mIconName2Col;
            Drawable drawableFromResourceValue2 = i6 == -1 ? null : getDrawableFromResourceValue(cursor.getString(i6));
            imageView3.setImageDrawable(drawableFromResourceValue2);
            if (drawableFromResourceValue2 != null) {
                imageView3.setVisibility(0);
                drawableFromResourceValue2.setVisible(false, false);
                i = 1;
                drawableFromResourceValue2.setVisible(true, false);
                i2 = this.mQueryRefinement;
                if (i2 == 2 && (i2 != i || (i4 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i = 1;
        i2 = this.mQueryRefinement;
        if (i2 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void changeCursor(Cursor cursor) {
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.mText1Col = cursor.getColumnIndex("suggest_text_1");
                this.mText2Col = cursor.getColumnIndex("suggest_text_2");
                this.mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
                this.mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
                this.mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
                this.mFlagsCol = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final String convertToString(Cursor cursor) {
        String stringOrNull;
        String stringOrNull2;
        if (cursor == null) {
            return null;
        }
        String stringOrNull3 = getStringOrNull(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (stringOrNull3 != null) {
            return stringOrNull3;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo.shouldRewriteQueryFromData() && (stringOrNull2 = getStringOrNull(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return stringOrNull2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (stringOrNull = getStringOrNull(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return stringOrNull;
    }

    public final Drawable getDrawableFromResourceUri(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.mProviderContext.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "More than two path segments: "));
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable getDrawableFromResourceValue(String str) {
        WeakHashMap weakHashMap = this.mOutsideDrawablesCache;
        Context context = this.mProviderContext;
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
                } catch (FileNotFoundException e) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = getDrawableFromResourceUri(parse);
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
                        } catch (IOException e2) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e2);
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

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.mInflater.inflate(this.mDropDownLayout, viewGroup, false);
            if (inflate != null) {
                ((ChildViewCache) inflate.getTag()).mText1.setText(e.toString());
            }
            return inflate;
        }
    }

    public final Cursor getSearchManagerSuggestions(SearchableInfo searchableInfo, String str) {
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
        return this.mProviderContext.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newView = this.newView(this.mProviderContext, this.mCursor, viewGroup);
            ((ChildViewCache) newView.getTag()).mText1.setText(e.toString());
            return newView;
        }
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new ChildViewCache(newView));
        ((ImageView) newView.findViewById(com.squareup.cash.R.id.edit_query)).setImageResource(this.mCommitIconResId);
        return newView;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.mCursor;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.mCursor;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.mSearchView.setQuery((CharSequence) tag);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.mSearchView;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                Cursor searchManagerSuggestions = getSearchManagerSuggestions(this.mSearchable, charSequence2);
                if (searchManagerSuggestions != null) {
                    searchManagerSuggestions.getCount();
                    return searchManagerSuggestions;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }
}
