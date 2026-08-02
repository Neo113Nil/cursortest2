package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* loaded from: assets/audience_network/classes2.dex */
public class OK implements ServiceConnection {
    public static String[] A01 = {"5NfIE0YcA1j7k4kI09Qd", "GOyJyQVDSAttzLj2dwW1R", "UEE9UjADaku6tgIVG7TE", "AlbuaripePsmIRlIONJuvTINhX", "hDpBwlS77lkTDgpWlwn57aFtHcNJW0B1", "G5FnfniCDoZltv23hjG8RcIHEgm214hW", "K1Tu", "8SU16w9FmjIzUCDhhEyMBCCw6KqJKOI3"};
    public final /* synthetic */ OL A00;

    public OK(OL ol) {
        this.A00 = ol;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1860gi c1860gi;
        Handler handler;
        AbstractRunnableC1347Wc abstractRunnableC1347Wc;
        AbstractC1980ik abstractC1980ik;
        C1860gi c1860gi2;
        c1860gi = this.A00.A07;
        c1860gi.A0F().AI7();
        handler = this.A00.A04;
        abstractRunnableC1347Wc = this.A00.A09;
        handler.removeCallbacks(abstractRunnableC1347Wc);
        if (iBinder != null) {
            this.A00.A00 = new Messenger(iBinder);
            if (this.A00.A02) {
                this.A00.A02 = false;
                abstractC1980ik = this.A00.A06;
                abstractC1980ik.A06();
                return;
            }
            return;
        }
        c1860gi2 = this.A00.A07;
        c1860gi2.A0F().AI9();
        OL ol = this.A00;
        if (A01[3].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "klTZBPtNd5GFvPmgAP3f";
        strArr[2] = "mBOUVEJ7kKkpCLxr10ij";
        ol.A06();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1860gi c1860gi;
        c1860gi = this.A00.A07;
        c1860gi.A0F().AI8();
        if (!this.A00.A01) {
            return;
        }
        this.A00.A06();
    }
}
