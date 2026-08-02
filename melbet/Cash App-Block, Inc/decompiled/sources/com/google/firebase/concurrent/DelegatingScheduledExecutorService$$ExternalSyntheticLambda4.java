package com.google.firebase.concurrent;

import com.squareup.scannerview.SizeMap;

/* loaded from: classes4.dex */
public final /* synthetic */ class DelegatingScheduledExecutorService$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelegatingScheduledExecutorService f$0;
    public final /* synthetic */ Runnable f$1;
    public final /* synthetic */ SizeMap f$2;

    public /* synthetic */ DelegatingScheduledExecutorService$$ExternalSyntheticLambda4(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, SizeMap sizeMap, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingScheduledExecutorService;
        this.f$1 = runnable;
        this.f$2 = sizeMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        final SizeMap sizeMap = this.f$2;
        final Runnable runnable = this.f$1;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f$0;
        switch (i) {
            case 0:
                final int i2 = 1;
                delegatingScheduledExecutorService.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        SizeMap sizeMap2 = sizeMap;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    sizeMap2.set(null);
                                    return;
                                } catch (Exception e) {
                                    sizeMap2.setException(e);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    sizeMap2.setException(e2);
                                    throw e2;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    sizeMap2.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 0;
                delegatingScheduledExecutorService.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        SizeMap sizeMap2 = sizeMap;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    sizeMap2.set(null);
                                    return;
                                } catch (Exception e) {
                                    sizeMap2.setException(e);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    sizeMap2.setException(e2);
                                    throw e2;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    sizeMap2.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 2;
                delegatingScheduledExecutorService.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i4;
                        SizeMap sizeMap2 = sizeMap;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    sizeMap2.set(null);
                                    return;
                                } catch (Exception e) {
                                    sizeMap2.setException(e);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    sizeMap2.setException(e2);
                                    throw e2;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    sizeMap2.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
