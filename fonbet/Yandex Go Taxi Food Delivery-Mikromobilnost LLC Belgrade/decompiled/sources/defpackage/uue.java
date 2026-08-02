package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class uue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CorpCreatingDraftModalView b;

    public /* synthetic */ uue(CorpCreatingDraftModalView corpCreatingDraftModalView, int i) {
        this.a = i;
        this.b = corpCreatingDraftModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CorpCreatingDraftModalView corpCreatingDraftModalView = this.b;
        switch (i) {
            case 0:
                CorpCreatingDraftModalView.setupCreateDraftButton$lambda$0(corpCreatingDraftModalView);
                break;
            case 1:
                CorpCreatingDraftModalView.setupPoliticButton$lambda$0(corpCreatingDraftModalView);
                break;
            default:
                CorpCreatingDraftModalView.setupOpenBusinessAccountButton$lambda$0(corpCreatingDraftModalView);
                break;
        }
    }
}
