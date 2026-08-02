package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.yandex.music.shared.slides.ui.music.logic.impl.selection.model.CardSelectionStorage$ArtistSelection;
import defpackage.hmm;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class ffp extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ String k;
    public final /* synthetic */ gfp l;
    public final /* synthetic */ tx3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffp(String str, gfp gfpVar, tx3 tx3Var, Continuation continuation) {
        super(2, continuation);
        this.k = str;
        this.l = gfpVar;
        this.m = tx3Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ffp ffpVar = new ffp(this.k, this.l, this.m, continuation);
        ffpVar.j = obj;
        return ffpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ffp) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        CardSelectionStorage$ArtistSelection cardSelectionStorage$ArtistSelection;
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a a = jmm.a(this.k);
        Gson gson = this.l.c;
        tx3 tx3Var = this.m;
        String str = tx3Var.b;
        saf safVar = tx3Var.a;
        if (safVar instanceof nn6) {
            nn6 nn6Var = (nn6) safVar;
            cardSelectionStorage$ArtistSelection = new CardSelectionStorage$ArtistSelection(nn6Var.n, nn6Var.o, nn6Var.p, str);
        } else {
            if (!(safVar instanceof mn6)) {
                b6e.s();
                return null;
            }
            cardSelectionStorage$ArtistSelection = new CardSelectionStorage$ArtistSelection(((mn6) safVar).n, null, null, str);
        }
        gson.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            gson.l(cardSelectionStorage$ArtistSelection, ux3.class, gson.h(stringWriter));
            String stringWriter2 = stringWriter.toString();
            lpiVar.getClass();
            lpiVar.h(a, stringWriter2);
            return Unit.a;
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
