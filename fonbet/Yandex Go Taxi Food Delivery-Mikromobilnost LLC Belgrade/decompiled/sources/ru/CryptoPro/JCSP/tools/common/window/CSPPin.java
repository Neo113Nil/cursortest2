package ru.CryptoPro.JCSP.tools.common.window;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.eb3;
import defpackage.g8e;
import defpackage.jzh0;
import defpackage.rch0;
import defpackage.woh0;
import defpackage.x610;
import java.io.UnsupportedEncodingException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.tools.common.window.CSPPin;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes4.dex */
public class CSPPin extends CSPDialog {
    private static final String BUTTON_OK_IS_ENABLED = "buttonOkIsEnabled";
    private static final int CRYPT_MAX_PIN_LENGTH = 100;
    private static final int FIRST_OK_ASCII_SYMBOL = 32;
    private static final int LAST_OK_ASCII_SYMBOL = 126;
    private static final int PIN_INVALID_ENCODING = 2;
    private static final int PIN_INVALID_LENGTH = 1;
    public static final int PIN_VALID = 0;
    private static final int SCARD_W_WRONG_CHV = -2146434965;
    private static final int S_CARD_E_INVALID_CHV = -2146435030;
    private String replacedMessage;
    private int max = 0;
    private int fun_result = 0;
    private boolean pinWatcherEnabled = true;
    private Button btOk = null;
    private TextInputEditText etPinField = null;
    private TextInputEditText etConfirmPinField = null;

    private void cancelAction() {
        closeKeyboard();
        endDialog(1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkPasswords(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    private boolean checkPin() {
        boolean z = isPinCharAppropriate(String.valueOf(this.etPinField.getText())) == 0;
        return this.dialogType == 301 ? z : z && checkPasswords(String.valueOf(this.etPinField.getText()), String.valueOf(this.etConfirmPinField.getText()));
    }

    private void closeKeyboard() {
        InputMethodManager inputMethodManager;
        if (getContext() == null || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.etPinField.getWindowToken(), 0);
    }

    private void confirmAction() {
        closeKeyboard();
        endDialog(0, String.valueOf(this.etPinField.getText()));
    }

    private DialogInterface.OnKeyListener getKeyListener() {
        return new eb3(2, this);
    }

    private TextWatcher getPinCodeWatcher(final TextInputLayout textInputLayout) {
        return new TextWatcher() { // from class: ru.CryptoPro.JCSP.tools.common.window.CSPPin.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (CSPPin.this.btOk != null) {
                    boolean z = false;
                    boolean z2 = CSPPin.isPinCharAppropriate(editable.toString()) == 0;
                    CSPPin cSPPin = CSPPin.this;
                    if (cSPPin.dialogType == 301) {
                        cSPPin.btOk.setEnabled(z2);
                    } else {
                        Button button = cSPPin.btOk;
                        if (z2) {
                            CSPPin cSPPin2 = CSPPin.this;
                            if (cSPPin2.checkPasswords(String.valueOf(cSPPin2.etPinField.getText()), String.valueOf(CSPPin.this.etConfirmPinField.getText()))) {
                                z = true;
                            }
                        }
                        button.setEnabled(z);
                    }
                    textInputLayout.setError(z2 ? null : CSPPin.this.getString(jzh0.InvalidPassword));
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
    }

    public static int isPinCharAppropriate(String str) {
        if (str.length() > 100) {
            return 1;
        }
        if (!CSPMessageConverter.isPureAscii(str)) {
            return 2;
        }
        try {
            for (byte b : str.getBytes("cp1251")) {
                if (b < 32 || b > 126) {
                    return 2;
                }
            }
            return 0;
        } catch (UnsupportedEncodingException unused) {
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$getKeyListener$3(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            cancelAction();
            return true;
        }
        if (i != 66 || keyEvent.getAction() != 0 || !checkPin()) {
            return false;
        }
        confirmAction();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$0(DialogInterface dialogInterface, int i) {
        confirmAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$1(DialogInterface dialogInterface, int i) {
        cancelAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$2(AlertDialog alertDialog, Bundle bundle, DialogInterface dialogInterface) {
        Button button = alertDialog.getButton(-1);
        this.btOk = button;
        if (bundle != null) {
            button.setEnabled(bundle.getBoolean(BUTTON_OK_IS_ENABLED, true));
        }
        showKeyBoard();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(final Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        View inflate = getLayoutInflater().inflate(woh0.fragment_csp_pin, (ViewGroup) null);
        this.etPinField = (TextInputEditText) inflate.findViewById(rch0.etPinField);
        this.etConfirmPinField = (TextInputEditText) inflate.findViewById(rch0.etConfirmPinField);
        Bundle bundle2 = this.bundle;
        final int i = 1;
        final int i2 = 0;
        if (bundle2 != null) {
            this.max = bundle2.getInt(IDialogId.INTENT_EXTRA_IN_MAX, 0);
            this.fun_result = (int) (this.bundle.getLong(IDialogId.INTENT_EXTRA_IN_FUN_RESULT, 0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            this.replacedMessage = this.bundle.getString(IDialogId.INTENT_EXTRA_IN_REPLACED_MESSAGE);
            this.pinWatcherEnabled = this.bundle.getBoolean(IDialogId.INTENT_EXTRA_IN_PIN_WATCHER_ENABLED, true);
        }
        ((TextView) inflate.findViewById(rch0.tvPinMessage)).setText(this.replacedMessage);
        TextView textView = (TextView) inflate.findViewById(rch0.tvAddMessage);
        textView.setVisibility(this.fun_result != 0 ? 0 : 8);
        int i3 = this.fun_result;
        if (i3 == -2146435030) {
            textView.setText(jzh0.InvalidPassword);
        } else if (i3 == -2146434965) {
            textView.setText(jzh0.WrongPassword);
        } else if (i3 != 0) {
            textView.setText(String.format(getString(jzh0.UnknownTokenError), String.format("0x%08X", Long.valueOf(_Gost_CryptoPro_PrivateKeyValues.maxDWORD & i3))));
        }
        if (this.dialogType == 301 && this.max > 0) {
            String charSequence = textView.getText().toString();
            String format = String.format(getString(jzh0.AttemptLeft), Integer.valueOf(this.max));
            if (!charSequence.isEmpty()) {
                format = g8e.p(charSequence, "\n\n", format);
            }
            textView.setText(format);
            textView.setVisibility(0);
        }
        this.etConfirmPinField.requestFocus();
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(rch0.tilConfirmPin);
        if (this.dialogType == 2109) {
            textInputLayout.setVisibility(0);
        }
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(rch0.tilPin);
        if (this.pinWatcherEnabled) {
            this.etPinField.addTextChangedListener(getPinCodeWatcher(textInputLayout2));
        }
        this.etPinField.requestFocus();
        if (this.dialogType == 2109 && this.pinWatcherEnabled) {
            this.etConfirmPinField.addTextChangedListener(getPinCodeWatcher(textInputLayout));
        }
        final AlertDialog create = new x610(requireActivity, 0).m(getDialogTitle()).o(inflate).k(new DialogInterface.OnClickListener(this) { // from class: m97
            public final /* synthetic */ CSPPin b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                int i5 = i2;
                CSPPin cSPPin = this.b;
                switch (i5) {
                    case 0:
                        cSPPin.lambda$onCreateDialog$0(dialogInterface, i4);
                        break;
                    default:
                        cSPPin.lambda$onCreateDialog$1(dialogInterface, i4);
                        break;
                }
            }
        }).j(new DialogInterface.OnClickListener(this) { // from class: m97
            public final /* synthetic */ CSPPin b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                int i5 = i;
                CSPPin cSPPin = this.b;
                switch (i5) {
                    case 0:
                        cSPPin.lambda$onCreateDialog$0(dialogInterface, i4);
                        break;
                    default:
                        cSPPin.lambda$onCreateDialog$1(dialogInterface, i4);
                        break;
                }
            }
        }).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: n97
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CSPPin.this.lambda$onCreateDialog$2(create, bundle, dialogInterface);
            }
        });
        create.setCancelable(true);
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(getKeyListener());
        return create;
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CSPDialog, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.etPinField.requestFocus();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(BUTTON_OK_IS_ENABLED, this.btOk.isEnabled());
        super.onSaveInstanceState(bundle);
    }

    public void showKeyBoard() {
        Window window;
        this.etPinField.requestFocus();
        if (getDialog() == null || (window = getDialog().getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(5);
    }
}
