package com.miteksystems.misnap.workflow.fragment;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.embedded.settings.adapter.SettingsAdapter;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class VoicePhraseSelectionFragment$a$a extends RecyclerView.ViewHolder {
    public final o a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoicePhraseSelectionFragment$a$a(SettingsAdapter settingsAdapter, o oVar) {
        super(r0);
        FrameLayout frameLayout = (FrameLayout) oVar.a;
        this.a = oVar;
        frameLayout.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(6, (VoicePhraseSelectionFragment) settingsAdapter.mMenuListClickedlistener, this));
    }
}
