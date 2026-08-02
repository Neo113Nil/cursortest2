package com.squareup.cash.arcade.treehouse;

import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewEvent;
import com.squareup.cash.treehouse.qr.QrScanResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public final /* synthetic */ class QrCodeScannerBinding$$ExternalSyntheticLambda0 implements Ui.EventReceiver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ QrCodeScannerBinding$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final void sendEvent(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                QrCodeScannerBinding qrCodeScannerBinding = (QrCodeScannerBinding) obj2;
                QrAddressScannerViewEvent qrAddressScannerViewEvent = (QrAddressScannerViewEvent) obj;
                qrAddressScannerViewEvent.getClass();
                if (!(qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.DialogClosed)) {
                    if (!qrAddressScannerViewEvent.equals(QrAddressScannerViewEvent.Exit.INSTANCE)) {
                        if (!qrAddressScannerViewEvent.equals(QrAddressScannerViewEvent.PasteAddressPressed.INSTANCE)) {
                            if (!(qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.ScanComplete)) {
                                if (!qrAddressScannerViewEvent.equals(QrAddressScannerViewEvent.ScanError.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    qrCodeScannerBinding.onResult.invoke(new QrScanResult.UnspecifiedFailure());
                                    break;
                                }
                            } else {
                                qrCodeScannerBinding.onResult.invoke(new QrScanResult.Success(((QrAddressScannerViewEvent.ScanComplete) qrAddressScannerViewEvent).code));
                                break;
                            }
                        } else {
                            PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = qrCodeScannerBinding.onButtonClick;
                            if (pageFetcher$generateNewPagingSource$3 != null) {
                                pageFetcher$generateNewPagingSource$3.invoke();
                                break;
                            }
                        }
                    } else {
                        qrCodeScannerBinding.onResult.invoke(QrScanResult.Canceled.INSTANCE);
                        break;
                    }
                }
                break;
            case 1:
                Ui.EventReceiver eventReceiver = (Ui.EventReceiver) obj2;
                InvestingGraphViewEvent investingGraphViewEvent = (InvestingGraphViewEvent) obj;
                investingGraphViewEvent.getClass();
                if (!(investingGraphViewEvent instanceof InvestingGraphViewEvent.ScrubPoint)) {
                    if (!(investingGraphViewEvent instanceof InvestingGraphViewEvent.SelectRange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        eventReceiver.sendEvent(new InvestingHomeViewEvent.SelectHistoricalRange(((InvestingGraphViewEvent.SelectRange) investingGraphViewEvent).range));
                        break;
                    }
                } else {
                    eventReceiver.sendEvent(new InvestingHomeViewEvent.ScrubPoint(((InvestingGraphViewEvent.ScrubPoint) investingGraphViewEvent).point));
                    break;
                }
            default:
                InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = (InvestingCryptoNewsViewEvent) obj;
                investingCryptoNewsViewEvent.getClass();
                ((GpsConfigQueries$$ExternalSyntheticLambda2) obj2).invoke(investingCryptoNewsViewEvent);
                break;
        }
    }
}
