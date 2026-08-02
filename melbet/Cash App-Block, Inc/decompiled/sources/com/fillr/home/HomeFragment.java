package com.fillr.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.core.BaseFragment;
import com.fillr.home.adapter.FProfileHomeListViewAdapter;
import com.fillr.n;
import com.squareup.cash.R;
import java.util.ArrayList;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Schema_;

/* loaded from: classes4.dex */
public abstract class HomeFragment extends BaseFragment implements View.OnClickListener {
    public RecyclerView listView = null;
    public FProfileHomeListViewAdapter adapter = null;
    public ProfileStore_ profileStore = null;
    public Schema_ schema = null;
    public final n.b onItemClicked = new n.b(this, 16);

    /* renamed from: -$$Nest$mhideFeedbackView, reason: not valid java name */
    public static void m1942$$Nest$mhideFeedbackView(HomeFragment homeFragment) {
        SharedPreferences sharedPreferences = homeFragment.mPreferenceStore.mPreferences;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("F_FEEDBACK_FORM", false);
            edit.apply();
        }
        FProfileHomeListViewAdapter fProfileHomeListViewAdapter = homeFragment.adapter;
        fProfileHomeListViewAdapter.getClass();
        fProfileHomeListViewAdapter.notifyDataSetChanged();
    }

    @Override // com.fillr.core.BaseFragment
    public void onBackStackChanged() {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f_fragment_home, viewGroup, false);
        this.listView = (RecyclerView) inflate.findViewById(R.id.f_home_listview);
        this.schema = Schema_.getInstance_(getActivity());
        this.listView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.profileStore = ProfileStore_.getInstance_(getActivity());
        ArrayList arrayList = new ArrayList((ArrayList) this.schema.rootElements);
        FProfileHomeListViewAdapter fProfileHomeListViewAdapter = this.adapter;
        if (fProfileHomeListViewAdapter == null) {
            FragmentActivity activity = getActivity();
            FProfileHomeListViewAdapter fProfileHomeListViewAdapter2 = new FProfileHomeListViewAdapter(0);
            new ArrayList();
            fProfileHomeListViewAdapter2.mContext = activity;
            fProfileHomeListViewAdapter2.elements = arrayList;
            fProfileHomeListViewAdapter2.inflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            fProfileHomeListViewAdapter2.onItemclickedListener = this.onItemClicked;
            this.adapter = fProfileHomeListViewAdapter2;
            this.listView.setAdapter(fProfileHomeListViewAdapter2);
        } else {
            fProfileHomeListViewAdapter.elements = arrayList;
            fProfileHomeListViewAdapter.notifyDataSetChanged();
        }
        getMainActivity();
        final FProfileHomeListViewAdapter fProfileHomeListViewAdapter3 = this.adapter;
        RecyclerView recyclerView = this.listView;
        fProfileHomeListViewAdapter3.getClass();
        new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: com.fillr.home.adapter.BaseProfileHomeListViewAdapter$1
            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public final int getMovementFlags(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, viewHolder instanceof BaseProfileHomeListViewAdapter$ProfileHomeViewHolder ? 0 : 12);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public final boolean onMove(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                return true;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder instanceof BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder) {
                    FProfileHomeListViewAdapter fProfileHomeListViewAdapter4 = FProfileHomeListViewAdapter.this;
                    fProfileHomeListViewAdapter4.getClass();
                    fProfileHomeListViewAdapter4.notifyDataSetChanged();
                }
            }
        }).attachToRecyclerView(recyclerView);
        return inflate;
    }
}
