package defpackage;

import java.io.IOException;

/* loaded from: classes10.dex */
public interface yf10 {
    void onDownstreamFormatChanged(int i, sf10 sf10Var, he10 he10Var);

    void onLoadCanceled(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var);

    void onLoadCompleted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var);

    void onLoadError(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z);

    void onLoadStarted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, int i2);

    void onUpstreamDiscarded(int i, sf10 sf10Var, he10 he10Var);
}
