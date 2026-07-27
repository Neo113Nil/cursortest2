package com.catchingfish.fishcatcherpro.presentation.info;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.catchingfish.fishcatcherpro.R;
import kotlin.text.CatchingFishBundleAndroidX;
import kotlin.text.CatchingFishBundleGlide;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishFluxPicasso;
import kotlin.text.CatchingFishFragmentFactory;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishKtorHiltIntent;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
public final class GameInfoActivity extends AppCompatActivity {
    public static final /* synthetic */ int CatchingFishPayPalService = 0;
    public final CatchingFishKtorHiltIntent CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishFluxPicasso(0, this));
    public CatchingFishBundleGlide CatchingFishMutableLiveData;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_game_info, (ViewGroup) null, false);
        TextView textView = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.infoGame);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.infoGame)));
        }
        this.CatchingFishMutableLiveData = new CatchingFishBundleGlide(2, (ConstraintLayout) inflate, textView);
        CatchingFishKtorHiltIntent catchingFishKtorHiltIntent = this.CatchingFishJobScheduler;
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = ((CatchingFishBundleAndroidX) catchingFishKtorHiltIntent.getValue()).CatchingFishCoroutine;
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishMutableLiveData;
        if (catchingFishBundleGlide == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) catchingFishBundleGlide.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(constraintLayout, "getRoot(...)");
        catchingFishMVPExoPlayer.CatchingFishEspressoTesting(this, constraintLayout);
        CatchingFishBundleGlide catchingFishBundleGlide2 = this.CatchingFishMutableLiveData;
        if (catchingFishBundleGlide2 == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
            throw null;
        }
        setContentView((ConstraintLayout) catchingFishBundleGlide2.CatchingFishDaggerWebsocket);
        CatchingFishBundleGlide catchingFishBundleGlide3 = this.CatchingFishMutableLiveData;
        if (catchingFishBundleGlide3 == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
            throw null;
        }
        TextView textView2 = (TextView) catchingFishBundleGlide3.CatchingFishWorkManager;
        Object obj = ((CatchingFishBundleAndroidX) catchingFishKtorHiltIntent.getValue()).CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
        textView2.setText("\"Catching Fish\" is an engaging and strategic match-pair puzzle game set in a world of ancient myths and legends. Players are tasked with matching pairs of mystical tiles on a dynamic game board, each round presenting unique challenges and opportunities for bonuses. The game board is filled with various types of tiles, including regular, bonus, secret, and blocked tiles, each adding a layer of complexity and excitement to the gameplay.\n\nAs the game begins, you’ll have a limited amount of time to find and match all the pairs on the board. Each correct match not only increases your score but also brings you closer to unlocking secret tiles that reveal hidden bonuses. However, be cautious—every mistake you make reduces your remaining time, pushing you closer to the edge of failure. But don’t worry, bonus tiles scattered throughout the game can add extra time to your countdown, giving you a second chance to complete the level.\n\nThe challenge doesn’t stop there. As you progress through the levels, the game introduces random tile shuffles, keeping you on your toes and ensuring no two games are ever the same. You’ll need to be quick, strategic, and accurate to master the art of pairing tiles, unlocking secrets, and advancing through increasingly difficult stages.\n\nTo win, players must complete levels by matching all pairs before the timer runs out. Each level presents a new configuration of tiles, requiring fresh strategies and quick thinking. The goal is to achieve the highest score possible while navigating the various challenges presented by the game. \"Compare Balls\" is a perfect blend of quick reflexes, sharp memory, and strategic planning, making it an enjoyable and challenging experience for players of all ages.");
        CatchingFishDaggerBiometric.CatchingFishReduxKtor(CatchingFishLayout(), this, new CatchingFishFragmentFactory(3, this));
    }
}
