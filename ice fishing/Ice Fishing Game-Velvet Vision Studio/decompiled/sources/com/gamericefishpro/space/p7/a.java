package com.gamericefishpro.space.p7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.t0.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ int d;
    public static final a e = new a(0);
    public static final a i = new a(1);
    public static final a v = new a(2);
    public static final a w = new a(3);
    public static final a y = new a(4);
    public static final a z = new a(5);
    public static final a A = new a(6);
    public static final a B = new a(7);

    public /* synthetic */ a(int i2) {
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.f0.c item = (com.gamericefishpro.space.f0.c) obj;
                r rVar = (r) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((iIntValue & 17) == 16 && rVar.E()) {
                    rVar.V();
                } else {
                    a4.c("Swap adjacent fish", "Tap two neighboring fish to swap their positions.", null, Integer.valueOf(R.drawable.blue_fish), 0L, rVar, 54, 20);
                }
                break;
            case 1:
                com.gamericefishpro.space.f0.c item2 = (com.gamericefishpro.space.f0.c) obj;
                r rVar2 = (r) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && rVar2.E()) {
                    rVar2.V();
                } else {
                    a4.c("Match 3 or more", "Line up 3 or more identical fish to clear them and earn points.", null, Integer.valueOf(R.drawable.orange_fish), 0L, rVar2, 54, 20);
                }
                break;
            case 2:
                com.gamericefishpro.space.f0.c item3 = (com.gamericefishpro.space.f0.c) obj;
                r rVar3 = (r) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item3, "$this$item");
                if ((iIntValue3 & 17) == 16 && rVar3.E()) {
                    rVar3.V();
                } else {
                    a4.c("Crimson Bomb 💣", "Power-up: tap it, then tap any tile to blast a 3×3 area.", null, Integer.valueOf(R.drawable.crimson_bonus_item), 0L, rVar3, 54, 20);
                }
                break;
            case 3:
                com.gamericefishpro.space.f0.c item4 = (com.gamericefishpro.space.f0.c) obj;
                r rVar4 = (r) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item4, "$this$item");
                if ((iIntValue4 & 17) == 16 && rVar4.E()) {
                    rVar4.V();
                } else {
                    a4.c("Ice Blast ❄️", "Power-up: tap it, then tap a tile to clear its entire row.", null, Integer.valueOf(R.drawable.ice_bonus_item), 0L, rVar4, 54, 20);
                }
                break;
            case 4:
                com.gamericefishpro.space.f0.c item5 = (com.gamericefishpro.space.f0.c) obj;
                r rVar5 = (r) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item5, "$this$item");
                if ((iIntValue5 & 17) == 16 && rVar5.E()) {
                    rVar5.V();
                } else {
                    a4.c("Gold Strike ✨", "Power-up: tap it, then tap a tile to clear its entire column.", null, Integer.valueOf(R.drawable.golden_bonus_item), 0L, rVar5, 54, 20);
                }
                break;
            case i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.f0.c item6 = (com.gamericefishpro.space.f0.c) obj;
                r rVar6 = (r) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item6, "$this$item");
                if ((iIntValue6 & 17) == 16 && rVar6.E()) {
                    rVar6.V();
                } else {
                    a4.c("Buy Power-ups", "Spend coins to buy power-ups from the bar at the bottom of the game screen.", d5.G(), null, o.c(4294956367L), rVar6, 24630, 8);
                }
                break;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.f0.c item7 = (com.gamericefishpro.space.f0.c) obj;
                r rVar7 = (r) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item7, "$this$item");
                if ((iIntValue7 & 17) == 16 && rVar7.E()) {
                    rVar7.V();
                } else {
                    a4.c("Objectives", "Reach the target score before time and moves run out.", d5.B(), null, o.c(4278232063L), rVar7, 24630, 8);
                }
                break;
            default:
                com.gamericefishpro.space.f0.c item8 = (com.gamericefishpro.space.f0.c) obj;
                r rVar8 = (r) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item8, "$this$item");
                if ((iIntValue8 & 17) == 16 && rVar8.E()) {
                    rVar8.V();
                } else {
                    a4.c("Stars", "Score faster and higher to earn up to 3 stars per level!", d5.G(), null, d.a, rVar8, 24630, 8);
                }
                break;
        }
        return Unit.a;
    }
}
