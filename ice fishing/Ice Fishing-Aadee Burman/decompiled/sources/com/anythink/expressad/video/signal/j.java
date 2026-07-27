package com.anythink.expressad.video.signal;

/* loaded from: classes.dex */
public interface j {
    public static final int m_ = 1;
    public static final int n_ = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f22190o = 1;
    public static final int o_ = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f22191p = 2;
    public static final int p_ = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f22192q = 1;
    public static final int q_ = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f22193r = 2;
    public static final int r_ = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f22194s = 0;
    public static final int s_ = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f22195t = 1;
    public static final int t_ = 1;
    public static final int u_ = 1;
    public static final int v_ = 2;
    public static final int w_ = 1;
    public static final int x_ = 2;
    public static final int y_ = -1;

    void alertWebViewShowed();

    void closeVideoOperate(int i, int i6);

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

    void progressOperate(int i, int i6);

    void setCover(boolean z3);

    void setInstallDialogState(boolean z3);

    void setMiniEndCardState(boolean z3);

    void setScaleFitXY(int i);

    void setVisible(int i);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i, int i6, int i9, int i10, int i11, int i12, int i13, int i14, int i15);

    void soundOperate(int i, int i6);

    void soundOperate(int i, int i6, String str);

    void videoOperate(int i);
}
