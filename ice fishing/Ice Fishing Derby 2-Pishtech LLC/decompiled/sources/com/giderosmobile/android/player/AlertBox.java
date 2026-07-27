package com.giderosmobile.android.player;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public class AlertBox implements DialogInterface.OnShowListener, DialogInterface.OnClickListener, DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private AlertDialog alertDialog_;
    private String button1_;
    private String button2_;
    private String cancel_;
    private boolean isVisible_ = false;
    private long udata_;

    private native void completeCallback(int i, String str, long j);

    public AlertBox(final String str, final String str2, final String str3, final String str4, final String str5, long j) {
        this.cancel_ = str3;
        this.button1_ = str4;
        this.button2_ = str5;
        this.udata_ = j;
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.AlertBox.1
            @Override // java.lang.Runnable
            public void run() {
                AlertBox.this.alertDialog_ = new AlertDialog.Builder(WeakActivityHolder.get()).create();
                AlertBox.this.alertDialog_.setTitle(str);
                AlertBox.this.alertDialog_.setMessage(str2);
                AlertBox.this.alertDialog_.setCancelable(true);
                AlertBox.this.alertDialog_.setOnShowListener(this);
                AlertBox.this.alertDialog_.setButton(-2, str3, this);
                if (str4 != null) {
                    AlertBox.this.alertDialog_.setButton(-1, str4, this);
                }
                if (str5 != null) {
                    AlertBox.this.alertDialog_.setButton(-3, str5, this);
                }
                AlertBox.this.alertDialog_.setOnCancelListener(this);
                AlertBox.this.alertDialog_.setOnDismissListener(this);
            }
        });
    }

    public void show() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.AlertBox.2
            @Override // java.lang.Runnable
            public void run() {
                AlertBox.this.alertDialog_.show();
            }
        });
    }

    public void hide() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.AlertBox.3
            @Override // java.lang.Runnable
            public void run() {
                AlertBox.this.alertDialog_.hide();
            }
        });
    }

    public void delete() {
        this.alertDialog_.dismiss();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -3) {
            completeCallback(2, this.button2_, this.udata_);
        } else if (i == -2) {
            completeCallback(0, this.cancel_, this.udata_);
        } else {
            if (i != -1) {
                return;
            }
            completeCallback(1, this.button1_, this.udata_);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        completeCallback(0, this.cancel_, this.udata_);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        this.isVisible_ = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.isVisible_ = false;
    }

    public boolean isVisible() {
        return this.isVisible_;
    }
}
