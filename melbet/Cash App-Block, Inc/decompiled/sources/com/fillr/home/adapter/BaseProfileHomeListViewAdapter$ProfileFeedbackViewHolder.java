package com.fillr.home.adapter;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.n;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public Dialog mDialog;
    public final View mHeader;
    public final n.b mListener;
    public final ViewFlipper mViewFlipper;

    public BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder(View view, n.b bVar, FragmentActivity fragmentActivity) {
        super(view);
        this.mHeader = view;
        this.mListener = bVar;
        ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.viewFlipper);
        this.mViewFlipper = viewFlipper;
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.com_fillr_in_from_left));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.out_to_left));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.view1);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.view2);
        Button button = (Button) linearLayout.findViewById(R.id.btnOne);
        Button button2 = (Button) linearLayout.findViewById(R.id.btnTwo);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.fillr.home.adapter.BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.1
            public final /* synthetic */ BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder = this.this$0;
                switch (i2) {
                    case 0:
                        baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.mViewFlipper.showNext();
                        break;
                    default:
                        Dialog dialog = new Dialog(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.mHeader.getContext());
                        dialog.requestWindowFeature(1);
                        dialog.setContentView(R.layout.com_fillr_feedback_dialog);
                        View findViewById = dialog.findViewById(R.id.main_container);
                        Button button3 = (Button) findViewById.findViewById(R.id.btn_feedback_skip);
                        Button button4 = (Button) findViewById.findViewById(R.id.btn_feedback_rateus);
                        Button button5 = (Button) findViewById.findViewById(R.id.btn_feedback_share);
                        button3.setOnClickListener(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder);
                        button4.setOnClickListener(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder);
                        button5.setOnClickListener(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder);
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        dialog.show();
                        baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.mDialog = dialog;
                        break;
                }
            }
        });
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.fillr.home.adapter.BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.1
            public final /* synthetic */ BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder = this.this$0;
                switch (i22) {
                    case 0:
                        baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.mViewFlipper.showNext();
                        break;
                    default:
                        Dialog dialog = new Dialog(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.mHeader.getContext());
                        dialog.requestWindowFeature(1);
                        dialog.setContentView(R.layout.com_fillr_feedback_dialog);
                        View findViewById = dialog.findViewById(R.id.main_container);
                        Button button3 = (Button) findViewById.findViewById(R.id.btn_feedback_skip);
                        Button button4 = (Button) findViewById.findViewById(R.id.btn_feedback_rateus);
                        Button button5 = (Button) findViewById.findViewById(R.id.btn_feedback_share);
                        button3.setOnClickListener(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder);
                        button4.setOnClickListener(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder);
                        button5.setOnClickListener(baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder);
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        dialog.show();
                        baseProfileHomeListViewAdapter$ProfileFeedbackViewHolder.mDialog = dialog;
                        break;
                }
            }
        });
        TextView textView = (TextView) linearLayout2.findViewById(R.id.txt_howstheapp);
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.txt_experience);
        Button button3 = (Button) linearLayout2.findViewById(R.id.btnOne);
        Button button4 = (Button) linearLayout2.findViewById(R.id.btnTwo);
        ImageView imageView = (ImageView) linearLayout2.findViewById(R.id.img_feedback_star);
        textView.setText(fragmentActivity.getString(R.string.fillr_feedback_dialog_sorry_hear));
        textView2.setText(fragmentActivity.getString(R.string.fillr_feedback_dialog_make_better));
        button3.setText(fragmentActivity.getString(R.string.fillr_feedback_dialog_maybe_later));
        button4.setText(fragmentActivity.getString(R.string.fillr_feedback_dialog_ok));
        imageView.setImageResource(R.drawable.fillr_feedback_dialog_smiley_neg);
        button4.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.mListener.onItemClicked(view, getAdapterPosition());
    }
}
