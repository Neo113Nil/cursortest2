package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f2248a;

    public a(SearchView searchView) {
        this.f2248a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f2248a;
        ImageView imageView = searchView.t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2157p;
        if (view == imageView) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f2142L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f2162v) {
            searchView.k();
            return;
        }
        if (view == searchView.f2161u) {
            searchView.o();
            return;
        }
        if (view != searchView.f2163w) {
            if (view == searchAutoComplete) {
                searchView.j();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f2153g0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.i(searchView.f2139I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f2138H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
