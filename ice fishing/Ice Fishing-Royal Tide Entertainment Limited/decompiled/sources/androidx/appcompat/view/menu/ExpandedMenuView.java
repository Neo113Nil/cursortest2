package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishKtorAdMob;
import kotlin.text.CatchingFishLiveDataPayPal;
import kotlin.text.CatchingFishOkHttpPicasso;
import kotlin.text.CatchingFishSharedFlowAdMob;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements CatchingFishLiveDataPayPal, CatchingFishOkHttpPicasso, AdapterView.OnItemClickListener {
    public static final int[] CatchingFishDaggerWebsocket = {R.attr.background, R.attr.divider};
    public CatchingFishSharedFlowAdMob CatchingFishReduxKtor;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, CatchingFishDaggerWebsocket, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(CatchingFishRecyclerView.CatchingFishMutableLiveData(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(CatchingFishRecyclerView.CatchingFishMutableLiveData(1));
        }
        CatchingFishRecyclerView.CatchingFishAnimation();
    }

    @Override // kotlin.text.CatchingFishLiveDataPayPal
    public final boolean CatchingFishCoroutine(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return this.CatchingFishReduxKtor.CatchingFishRoomDatabase(catchingFishKtorAdMob, null, 0);
    }

    @Override // kotlin.text.CatchingFishOkHttpPicasso
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        this.CatchingFishReduxKtor = catchingFishSharedFlowAdMob;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CatchingFishCoroutine((CatchingFishKtorAdMob) getAdapter().getItem(i));
    }
}
