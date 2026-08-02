package com.squareup.cash.money.applets.sections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public enum AppletTilePresentation {
    Default(AnonymousClass1.INSTANCE),
    Promoted(AnonymousClass2.INSTANCE),
    UninstalledRow(AnonymousClass3.INSTANCE);

    public final Function4 method;

    /* renamed from: com.squareup.cash.money.applets.sections.AppletTilePresentation$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function4 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(4, AppletTilePresentation.class, "UI", "_init_$UI(Lcom/squareup/cash/money/applets/viewmodels/AppletTile;Lcom/squareup/cash/money/applets/viewmodels/AppletTile$AppletTileAppearance;Landroidx/compose/runtime/Composer;I)V", 0);

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AppletTile appletTile = (AppletTile) obj;
            AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj2;
            Composer composer = (Composer) obj3;
            int intValue = ((Number) obj4).intValue();
            appletTile.getClass();
            appletTileAppearance.getClass();
            composer.getClass();
            AppletTilePresentation appletTilePresentation = AppletTilePresentation.Default;
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1410412100);
            appletTile.UI(appletTileAppearance, gapComposer, ((intValue << 3) & 112) | ((intValue >> 3) & 14));
            gapComposer.end(false);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.cash.money.applets.sections.AppletTilePresentation$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function4 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2(4, AppletTilePresentation.class, "PromotedUI", "_init_$PromotedUI(Lcom/squareup/cash/money/applets/viewmodels/AppletTile;Lcom/squareup/cash/money/applets/viewmodels/AppletTile$AppletTileAppearance;Landroidx/compose/runtime/Composer;I)V", 0);

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AppletTile appletTile = (AppletTile) obj;
            AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj2;
            Composer composer = (Composer) obj3;
            int intValue = ((Number) obj4).intValue();
            appletTile.getClass();
            appletTileAppearance.getClass();
            composer.getClass();
            AppletTilePresentation appletTilePresentation = AppletTilePresentation.Default;
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-735676544);
            appletTile.PromotedUI(appletTileAppearance, gapComposer, ((intValue << 3) & 112) | ((intValue >> 3) & 14));
            gapComposer.end(false);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.cash.money.applets.sections.AppletTilePresentation$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function4 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3(4, AppletTilePresentation.class, "UninstalledRowUI", "_init_$UninstalledRowUI(Lcom/squareup/cash/money/applets/viewmodels/AppletTile;Lcom/squareup/cash/money/applets/viewmodels/AppletTile$AppletTileAppearance;Landroidx/compose/runtime/Composer;I)V", 0);

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AppletTile appletTile = (AppletTile) obj;
            AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj2;
            Composer composer = (Composer) obj3;
            int intValue = ((Number) obj4).intValue();
            appletTile.getClass();
            appletTileAppearance.getClass();
            composer.getClass();
            AppletTilePresentation appletTilePresentation = AppletTilePresentation.Default;
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-881272907);
            appletTile.UninstalledRowUI(appletTileAppearance, gapComposer, ((intValue << 3) & 112) | ((intValue >> 3) & 14));
            gapComposer.end(false);
            return Unit.INSTANCE;
        }
    }

    AppletTilePresentation(Function4 function4) {
        this.method = function4;
    }
}
