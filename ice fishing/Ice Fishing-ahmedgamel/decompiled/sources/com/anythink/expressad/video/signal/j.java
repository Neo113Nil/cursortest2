package com.anythink.expressad.video.signal;

/* loaded from: classes.dex */
public interface j {
    public static final int m_ = 1;
    public static final int n_ = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f22977o = 1;
    public static final int o_ = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f22978p = 2;
    public static final int p_ = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f22979q = 1;
    public static final int q_ = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f22980r = 2;
    public static final int r_ = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f22981s = 0;
    public static final int s_ = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f22982t = 1;
    public static final int t_ = 1;
    public static final int u_ = 1;
    public static final int v_ = 2;
    public static final int w_ = 1;
    public static final int x_ = 2;
    public static final int y_ = -1;

    void alertWebViewShowed();

    void closeVideoOperate(int i, int i4);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i);

    boolean isH5Canvas();

    void notifyCloseBtn(int i);

    void progressBarOperate(int i);

    void progressOperate(int i, int i4);

    void setCover(boolean z6);

    void setInstallDialogState(boolean z6);

    void setMiniEndCardState(boolean z6);

    void setScaleFitXY(int i);

    void setVisible(int i);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i, int i4, int i6, int i9, int i10, int i11, int i12, int i13, int i14);

    void soundOperate(int i, int i4);

    void soundOperate(int i, int i4, String str);

    void videoOperate(int i);
}
