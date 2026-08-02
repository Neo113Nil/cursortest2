package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes6.dex */
public final /* synthetic */ class lp7 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThreadFactory b;

    public /* synthetic */ lp7(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = this.b.newThread(runnable);
                newThread.setName("YP:EPD");
                return newThread;
            case 1:
                Thread newThread2 = this.b.newThread(runnable);
                newThread2.setName("YP:ListPlayerManagerEventTracker");
                return newThread2;
            case 2:
                Thread newThread3 = this.b.newThread(runnable);
                newThread3.setName("YP:EPD");
                return newThread3;
            case 3:
                Thread newThread4 = this.b.newThread(runnable);
                newThread4.setName("YP:MscStrmTlmtr");
                return newThread4;
            case 4:
                Thread newThread5 = this.b.newThread(runnable);
                newThread5.setName("YP:PreloadEventTracker");
                return newThread5;
            case 5:
                Thread newThread6 = this.b.newThread(runnable);
                newThread6.setName("YP:PM:download");
                return newThread6;
            case 6:
                Thread newThread7 = this.b.newThread(runnable);
                newThread7.setName("YP:PlayerAliveLogger");
                return newThread7;
            case 7:
                Thread newThread8 = this.b.newThread(runnable);
                newThread8.setName("YP:VhPlayerStrategyScheduled");
                return newThread8;
            case 8:
                Thread newThread9 = this.b.newThread(runnable);
                newThread9.setName("YP:VhPlayerStrategy");
                return newThread9;
            default:
                Thread newThread10 = this.b.newThread(runnable);
                newThread10.setName("YP:StrmManager");
                return newThread10;
        }
    }
}
