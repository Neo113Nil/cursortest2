package com.knotapi.knot.ui.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.models.DialogOptions;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public class KnotBottomSheetDialog extends BottomSheetDialogFragment {
    public static final String TAG = "Knot:KnotBottomSheetDialog";
    private Bitmap bitmap;
    LinearLayout btn_primaryButton;
    LinearLayout btn_secondButton;
    CardView cardView_logo;
    DialogOptions dialogOptions;
    EditText edit_text;
    LinearLayout edit_text_layout;
    ImageView img_close;
    private boolean isNonDismissible = false;
    ImageView logo_link;
    TextView txt_description;
    TextView txt_primaryButton;
    TextView txt_secondButton;
    TextView txt_title;
    MerchantWebViewDelegate webViewDelegate;

    public KnotBottomSheetDialog(MerchantWebViewDelegate merchantWebViewDelegate) {
        this.webViewDelegate = merchantWebViewDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateDialog$0(DialogInterface dialogInterface) {
        FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
            from.setHideable(false);
            from.setState(3);
        }
    }

    public void closeSheet() {
        dismiss();
    }

    public String getConfirmationLink() {
        return this.edit_text.getText().toString().trim();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(bundle);
        if (this.isNonDismissible) {
            bottomSheetDialog.setCanceledOnTouchOutside(false);
            bottomSheetDialog.setCancelable(false);
            bottomSheetDialog.setOnShowListener(new KnotBottomSheetDialog$$ExternalSyntheticLambda0());
        }
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.knotapi.knot.R.layout.bottom_sheet_layout, viewGroup, false);
        this.img_close = (ImageView) inflate.findViewById(com.knotapi.knot.R.id.img_close);
        this.txt_title = (TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_title);
        this.txt_description = (TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_description);
        this.btn_primaryButton = (LinearLayout) inflate.findViewById(com.knotapi.knot.R.id.btn_primaryButton);
        this.btn_secondButton = (LinearLayout) inflate.findViewById(com.knotapi.knot.R.id.btn_secondButton);
        this.txt_primaryButton = (TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_primaryButton);
        this.txt_secondButton = (TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_secondButton);
        this.edit_text = (EditText) inflate.findViewById(com.knotapi.knot.R.id.editText_link);
        this.edit_text_layout = (LinearLayout) inflate.findViewById(com.knotapi.knot.R.id.editText);
        this.logo_link = (ImageView) inflate.findViewById(com.knotapi.knot.R.id.merchant_logo);
        this.cardView_logo = (CardView) inflate.findViewById(com.knotapi.knot.R.id.cardview_logo);
        DialogOptions dialogOptions = this.dialogOptions;
        if (dialogOptions == null) {
            closeSheet();
            return inflate;
        }
        this.txt_title.setText(dialogOptions.getTitle());
        boolean isEmpty = this.dialogOptions.getDescription().isEmpty();
        TextView textView = this.txt_description;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(Html.fromHtml(this.dialogOptions.getDescription()));
            this.txt_description.setVisibility(0);
        }
        this.txt_primaryButton.setText(this.dialogOptions.getPrimaryButton());
        this.txt_secondButton.setText(this.dialogOptions.getSecondaryButton());
        this.btn_primaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KnotBottomSheetDialog.this.dialogOptions.getPrimaryButtonListener().onClick(view);
            }
        });
        this.btn_secondButton.setOnClickListener(new View.OnClickListener() { // from class: com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KnotBottomSheetDialog.this.dialogOptions.getSecondaryButtonListener().onClick(view);
            }
        });
        this.img_close.setOnClickListener(this.dialogOptions.getCloseButtonListener());
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            this.logo_link.setImageBitmap(bitmap);
            this.cardView_logo.setVisibility(0);
        } else {
            this.cardView_logo.setVisibility(8);
        }
        boolean isEmpty2 = this.dialogOptions.isShowEditText().isEmpty();
        LinearLayout linearLayout = this.edit_text_layout;
        if (isEmpty2) {
            linearLayout.setVisibility(8);
            this.btn_primaryButton.setVisibility(0);
            return inflate;
        }
        linearLayout.setVisibility(0);
        this.btn_primaryButton.setVisibility(8);
        this.edit_text.setHint(this.dialogOptions.isShowEditText().trim());
        this.edit_text.addTextChangedListener(new TextWatcher() { // from class: com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean isEmpty3 = charSequence.toString().trim().isEmpty();
                KnotBottomSheetDialog knotBottomSheetDialog = KnotBottomSheetDialog.this;
                if (isEmpty3) {
                    knotBottomSheetDialog.btn_secondButton.setEnabled(false);
                    KnotBottomSheetDialog.this.btn_secondButton.setBackgroundResource(com.knotapi.knot.R.drawable.rounded_corner_button_disabled_grey);
                    KnotBottomSheetDialog.this.txt_secondButton.setTextColor(Color.parseColor("#737373"));
                } else {
                    knotBottomSheetDialog.btn_secondButton.setEnabled(true);
                    KnotBottomSheetDialog.this.btn_secondButton.setBackgroundResource(com.knotapi.knot.R.drawable.rounded_corner_button_transparent);
                    KnotBottomSheetDialog.this.txt_secondButton.setTextColor(Color.parseColor("#FFFFFF"));
                }
            }
        });
        if (!this.edit_text.getText().toString().trim().isEmpty()) {
            this.txt_secondButton.setTextColor(Color.parseColor("#FFFFFF"));
            return inflate;
        }
        this.btn_secondButton.setEnabled(false);
        this.btn_secondButton.setBackgroundResource(com.knotapi.knot.R.drawable.rounded_corner_button_disabled_grey);
        this.txt_secondButton.setTextColor(Color.parseColor("#737373"));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        getDialog().getWindow().setSoftInputMode(16);
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setDialogOptions(DialogOptions dialogOptions) {
        this.dialogOptions = dialogOptions;
    }

    public void setNonDismissible(boolean z) {
        this.isNonDismissible = z;
    }
}
