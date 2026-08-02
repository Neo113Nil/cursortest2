package com.anythink.core.mg.api;

import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.p;

/* loaded from: classes.dex */
public class MgComparedResult {
    private long cpCostTime;
    private double cpPrice;
    private boolean isCompared;
    private boolean isCpTimeout;
    private final boolean isMgWin;
    private final MgAdInfo mgAdInfo;

    private MgComparedResult(boolean z6) {
        this(z6, null);
    }

    public static MgComparedResult create() {
        return create(null, null, 0L, false);
    }

    public long getCpCostTime() {
        return this.cpCostTime;
    }

    public double getCpPrice() {
        return this.cpPrice;
    }

    public MgAdInfo getMgAdInfo() {
        return this.mgAdInfo;
    }

    public boolean isCompared() {
        return this.isCompared;
    }

    public boolean isCpTimeout() {
        return this.isCpTimeout;
    }

    public boolean isMgWin() {
        return this.isMgWin;
    }

    public String toString() {
        return "MgComparedResult{isMgWin=" + this.isMgWin + ", mgAdInfo=" + this.mgAdInfo + ", cpCostTime=" + this.cpCostTime + '}';
    }

    private MgComparedResult(boolean z6, MgAdInfo mgAdInfo) {
        this.isMgWin = z6;
        this.mgAdInfo = mgAdInfo;
    }

    public static MgComparedResult create(bv bvVar, MgAdInfo mgAdInfo, long j6, boolean z6) {
        try {
            double a9 = p.a(bvVar);
            boolean z9 = (mgAdInfo != null ? mgAdInfo.getUSDEcpm() : 0.0d) > a9;
            if (bvVar != null && bvVar.br()) {
                z9 = false;
            }
            if (mgAdInfo != null) {
                mgAdInfo.getCurrency();
            }
            MgComparedResult mgComparedResult = new MgComparedResult(z9, mgAdInfo);
            mgComparedResult.isCompared = MgAdInfo.isMgAdInfoValid(mgAdInfo);
            mgComparedResult.cpCostTime = j6;
            mgComparedResult.isCpTimeout = z6;
            mgComparedResult.cpPrice = a9;
            return mgComparedResult;
        } catch (Throwable th) {
            th.getMessage();
            return new MgComparedResult(false);
        }
    }
}
