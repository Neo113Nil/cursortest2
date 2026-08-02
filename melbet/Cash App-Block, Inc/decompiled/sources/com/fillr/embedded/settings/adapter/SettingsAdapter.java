package com.fillr.embedded.settings.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.m1;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.workflow.a.b;
import com.miteksystems.misnap.workflow.a.o;
import com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment;
import com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment$a$a;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class SettingsAdapter extends RecyclerView.Adapter {
    public final /* synthetic */ int $r8$classId = 0;
    public Object mMenuListClickedlistener;
    public List menuItems;

    public final class MenuListItem {
        public final int id;
        public final String title;

        public MenuListItem(int i, String str) {
            this.id = i;
            this.title = str;
        }
    }

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextDesc;
        public TextView mTextTitle;
        public View mView;
    }

    public SettingsAdapter(VoicePhraseSelectionFragment voicePhraseSelectionFragment, List list) {
        list.getClass();
        this.mMenuListClickedlistener = voicePhraseSelectionFragment;
        this.menuItems = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        switch (this.$r8$classId) {
            case 0:
                return ((ArrayList) this.menuItems).size();
            default:
                return this.menuItems.size();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        switch (this.$r8$classId) {
            case 0:
                ViewHolder viewHolder2 = (ViewHolder) viewHolder;
                MenuListItem menuListItem = (MenuListItem) ((ArrayList) this.menuItems).get(i);
                String str = menuListItem.title;
                int i2 = menuListItem.id;
                if (str == null || str.trim().length() <= 0) {
                    viewHolder2.mTextTitle.setVisibility(8);
                } else {
                    viewHolder2.mTextTitle.setText(menuListItem.title);
                    viewHolder2.mTextTitle.setVisibility(0);
                }
                viewHolder2.mTextDesc.setVisibility(8);
                viewHolder2.mView.setTag(Integer.valueOf(i2));
                break;
            default:
                VoicePhraseSelectionFragment$a$a voicePhraseSelectionFragment$a$a = (VoicePhraseSelectionFragment$a$a) viewHolder;
                voicePhraseSelectionFragment$a$a.getClass();
                String str2 = (String) this.menuItems.get(i);
                str2.getClass();
                ((MaterialTextView) voicePhraseSelectionFragment$a$a.a.c).setText(str2);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.$r8$classId) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fe_menu_item_row, viewGroup, false);
                m1 m1Var = (m1) this.mMenuListClickedlistener;
                ViewHolder viewHolder = new ViewHolder(inflate);
                viewHolder.mTextTitle = (TextView) inflate.findViewById(R.id.fe_txt_title);
                viewHolder.mTextDesc = (TextView) inflate.findViewById(R.id.fe_txt_desc);
                viewHolder.mView = inflate;
                inflate.setOnClickListener(new Toolbar.AnonymousClass4(m1Var, 5));
                return viewHolder;
            default:
                viewGroup.getClass();
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.misnap_voice_phrase_list_item, viewGroup, false);
                MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(inflate2, R.id.textView);
                if (materialTextView == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.textView)));
                    return null;
                }
                o oVar = new o((FrameLayout) inflate2, materialTextView, 1);
                float f = materialTextView.getContext().getResources().getConfiguration().fontScale;
                if (f > 1.0f) {
                    b.a(materialTextView, f);
                }
                return new VoicePhraseSelectionFragment$a$a(this, oVar);
        }
    }

    public /* synthetic */ SettingsAdapter() {
    }
}
