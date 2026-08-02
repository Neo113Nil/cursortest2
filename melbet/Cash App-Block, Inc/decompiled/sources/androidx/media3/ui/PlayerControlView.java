package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.camera.view.PreviewView$$ExternalSyntheticLambda0;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.ViewProvider;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.caverock.androidsvg.SVG;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.common.sdkinternal.zzb;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.ui.widget.AmountSelector$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda12;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] PLAYBACK_SPEEDS;
    public long[] adGroupTimesMs;
    public final View audioTrackButton;
    public final TextTrackSelectionAdapter audioTrackSelectionAdapter;
    public final float buttonAlphaDisabled;
    public final float buttonAlphaEnabled;
    public final ComponentListener componentListener;
    public final Class compositionPlayerClazz;
    public final Method compositionPlayerIsScrubbingModeEnabledMethod;
    public final Method compositionPlayerSetScrubbingModeEnabledMethod;
    public final PlayerControlViewLayoutManager controlViewLayoutManager;
    public long currentWindowOffset;
    public final TextView durationView;
    public final Class exoplayerClazz;
    public long[] extraAdGroupTimesMs;
    public boolean[] extraPlayedAdGroups;
    public final View fastForwardButton;
    public final TextView fastForwardButtonTextView;
    public final StringBuilder formatBuilder;
    public final Formatter formatter;
    public final ImageView fullscreenButton;
    public final String fullscreenEnterContentDescription;
    public final Drawable fullscreenEnterDrawable;
    public final String fullscreenExitContentDescription;
    public final Drawable fullscreenExitDrawable;
    public final Handler handler;
    public boolean isAttachedToWindow;
    public boolean isFullscreen;
    public final Method isScrubbingModeEnabledMethod;
    public final ImageView minimalFullscreenButton;
    public boolean multiWindowTimeBar;
    public boolean needToHideBars;
    public final ImageView nextButton;
    public final Drawable pauseButtonDrawable;
    public final Timeline.Period period;
    public final Drawable playButtonDrawable;
    public final ImageView playPauseButton;
    public final PlaybackSpeedAdapter playbackSpeedAdapter;
    public final View playbackSpeedButton;
    public boolean[] playedAdGroups;
    public Player player;
    public final TextView positionView;
    public final ImageView previousButton;
    public final String repeatAllButtonContentDescription;
    public final Drawable repeatAllButtonDrawable;
    public final String repeatOffButtonContentDescription;
    public final Drawable repeatOffButtonDrawable;
    public final String repeatOneButtonContentDescription;
    public final Drawable repeatOneButtonDrawable;
    public final ImageView repeatToggleButton;
    public int repeatToggleModes;
    public final Resources resources;
    public final View rewindButton;
    public final TextView rewindButtonTextView;
    public boolean scrubbing;
    public final Method setScrubbingModeEnabledMethod;
    public final SettingsAdapter settingsAdapter;
    public final View settingsButton;
    public final RecyclerView settingsView;
    public final PopupWindow settingsWindow;
    public final int settingsWindowMargin;
    public boolean showMultiWindowTimeBar;
    public boolean showPlayButtonIfSuppressed;
    public int showTimeoutMs;
    public final ImageView shuffleButton;
    public final Drawable shuffleOffButtonDrawable;
    public final String shuffleOffContentDescription;
    public final Drawable shuffleOnButtonDrawable;
    public final String shuffleOnContentDescription;
    public final ImageView subtitleButton;
    public final Drawable subtitleOffButtonDrawable;
    public final String subtitleOffContentDescription;
    public final Drawable subtitleOnButtonDrawable;
    public final String subtitleOnContentDescription;
    public final TextTrackSelectionAdapter textTrackSelectionAdapter;
    public final DefaultTimeBar timeBar;
    public int timeBarMinUpdateIntervalMs;
    public boolean timeBarScrubbingEnabled;
    public final DefaultTrackNameProvider trackNameProvider;
    public final AFd1lSDK$$ExternalSyntheticLambda0 updateProgressAction;
    public final CopyOnWriteArrayList visibilityListeners;
    public final ImageView vrButton;
    public final Timeline.Window window;

    public final class ComponentListener implements Player.Listener, View.OnClickListener, PopupWindow.OnDismissListener {
        public ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.subtitleButton;
            View view2 = playerControlView.audioTrackButton;
            View view3 = playerControlView.playbackSpeedButton;
            View view4 = playerControlView.settingsButton;
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.controlViewLayoutManager;
            Player player = playerControlView.player;
            if (player == null) {
                return;
            }
            playerControlViewLayoutManager.resetHideCallbacks();
            if (playerControlView.nextButton == view) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                if (exoPlayerImpl.isCommandAvailable(9)) {
                    exoPlayerImpl.seekToNext();
                    return;
                }
                return;
            }
            if (playerControlView.previousButton == view) {
                ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player;
                if (exoPlayerImpl2.isCommandAvailable(7)) {
                    exoPlayerImpl2.seekToPrevious();
                    return;
                }
                return;
            }
            if (playerControlView.fastForwardButton == view) {
                ExoPlayerImpl exoPlayerImpl3 = (ExoPlayerImpl) player;
                if (exoPlayerImpl3.getPlaybackState() == 4 || !exoPlayerImpl3.isCommandAvailable(12)) {
                    return;
                }
                exoPlayerImpl3.verifyApplicationThread();
                long currentPosition = exoPlayerImpl3.getCurrentPosition() + exoPlayerImpl3.seekForwardIncrementMs;
                long duration = exoPlayerImpl3.getDuration();
                if (duration != -9223372036854775807L) {
                    currentPosition = Math.min(currentPosition, duration);
                }
                exoPlayerImpl3.seekTo(Math.max(currentPosition, 0L), exoPlayerImpl3.getCurrentMediaItemIndex(), false);
                return;
            }
            if (playerControlView.rewindButton == view) {
                ExoPlayerImpl exoPlayerImpl4 = (ExoPlayerImpl) player;
                if (exoPlayerImpl4.isCommandAvailable(11)) {
                    exoPlayerImpl4.verifyApplicationThread();
                    long currentPosition2 = exoPlayerImpl4.getCurrentPosition() + (-exoPlayerImpl4.seekBackIncrementMs);
                    long duration2 = exoPlayerImpl4.getDuration();
                    if (duration2 != -9223372036854775807L) {
                        currentPosition2 = Math.min(currentPosition2, duration2);
                    }
                    exoPlayerImpl4.seekTo(Math.max(currentPosition2, 0L), exoPlayerImpl4.getCurrentMediaItemIndex(), false);
                    return;
                }
                return;
            }
            if (playerControlView.playPauseButton == view) {
                if (Util.shouldShowPlayButton(player, playerControlView.showPlayButtonIfSuppressed)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                ExoPlayerImpl exoPlayerImpl5 = (ExoPlayerImpl) player;
                if (exoPlayerImpl5.isCommandAvailable(1)) {
                    exoPlayerImpl5.setPlayWhenReady(false);
                    return;
                }
                return;
            }
            if (playerControlView.repeatToggleButton == view) {
                ExoPlayerImpl exoPlayerImpl6 = (ExoPlayerImpl) player;
                if (exoPlayerImpl6.isCommandAvailable(15)) {
                    exoPlayerImpl6.verifyApplicationThread();
                    int i = exoPlayerImpl6.repeatMode;
                    int i2 = playerControlView.repeatToggleModes;
                    for (int i3 = 1; i3 <= 2; i3++) {
                        int i4 = (i + i3) % 3;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 == 2 && (i2 & 2) != 0) {
                                }
                            } else if ((i2 & 1) == 0) {
                            }
                        }
                        i = i4;
                    }
                    exoPlayerImpl6.setRepeatMode(i);
                    return;
                }
                return;
            }
            if (playerControlView.shuffleButton == view) {
                ExoPlayerImpl exoPlayerImpl7 = (ExoPlayerImpl) player;
                if (exoPlayerImpl7.isCommandAvailable(14)) {
                    exoPlayerImpl7.verifyApplicationThread();
                    boolean z = !exoPlayerImpl7.shuffleModeEnabled;
                    ListenerSet listenerSet = exoPlayerImpl7.listeners;
                    exoPlayerImpl7.verifyApplicationThread();
                    if (exoPlayerImpl7.shuffleModeEnabled != z) {
                        exoPlayerImpl7.shuffleModeEnabled = z;
                        exoPlayerImpl7.internalPlayer.handler.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
                        listenerSet.queueEvent(9, new ExoPlayerImpl$$ExternalSyntheticLambda2(z, 0));
                        exoPlayerImpl7.updateAvailableCommands();
                        listenerSet.flushEvents();
                        return;
                    }
                    return;
                }
                return;
            }
            if (view4 == view) {
                playerControlViewLayoutManager.removeHideCallbacks();
                playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, view4);
                return;
            }
            if (view3 == view) {
                playerControlViewLayoutManager.removeHideCallbacks();
                playerControlView.displaySettingsWindow(playerControlView.playbackSpeedAdapter, view3);
            } else if (view2 == view) {
                playerControlViewLayoutManager.removeHideCallbacks();
                playerControlView.displaySettingsWindow(playerControlView.audioTrackSelectionAdapter, view2);
            } else if (imageView == view) {
                playerControlViewLayoutManager.removeHideCallbacks();
                playerControlView.displaySettingsWindow(playerControlView.textTrackSelectionAdapter, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.needToHideBars) {
                playerControlView.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onEvents(ExoPlayerImpl exoPlayerImpl, Player.Events events) {
            boolean containsAny = events.containsAny(4, 5, 13);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (containsAny) {
                float[] fArr = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                float[] fArr2 = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                float[] fArr3 = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                float[] fArr4 = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                float[] fArr6 = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                float[] fArr7 = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                float[] fArr8 = PlayerControlView.PLAYBACK_SPEEDS;
                playerControlView.updateTrackLists();
            }
        }
    }

    public interface OnFullScreenModeChangedListener {
    }

    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter {
        public final String[] playbackSpeedTexts;
        public final float[] playbackSpeeds;
        public int selectedIndex;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SubSettingViewHolder subSettingViewHolder = (SubSettingViewHolder) viewHolder;
            String[] strArr = this.playbackSpeedTexts;
            if (i < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i]);
            }
            int i2 = 1;
            if (i == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new AmountSelector$$ExternalSyntheticLambda0(this, i, i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
    }

    public final class SettingViewHolder extends RecyclerView.ViewHolder {
        public final ImageView iconView;
        public final TextView mainTextView;
        public final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            this.mainTextView = (TextView) view.findViewById(R.id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(R.id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 3));
        }
    }

    public final class SettingsAdapter extends RecyclerView.Adapter {
        public final Drawable[] iconIds;
        public final String[] mainTexts;
        public final String[] subTexts;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SettingViewHolder settingViewHolder = (SettingViewHolder) viewHolder;
            if (shouldShowSetting(i)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.mainTexts[i]);
            String str = this.subTexts[i];
            TextView textView = settingViewHolder.subTextView;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.iconIds[i];
            ImageView imageView = settingViewHolder.iconView;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            return playerControlView.new SettingViewHolder(LayoutInflater.from(playerControlView.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        public final boolean shouldShowSetting(int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.player;
            if (player == null) {
                return false;
            }
            return i != 0 ? i != 1 || (((ExoPlayerImpl) player).isCommandAvailable(30) && ((ExoPlayerImpl) playerControlView.player).isCommandAvailable(29)) : ((ExoPlayerImpl) player).isCommandAvailable(13);
        }
    }

    public final class SubSettingViewHolder extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.exo_text);
            this.checkView = view.findViewById(R.id.exo_check);
        }
    }

    public final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(Tracks tracks, int i, int i2, String str) {
            this.trackGroup = (Tracks.Group) tracks.groups.get(i);
            this.trackIndex = i2;
            this.trackName = str;
        }
    }

    public interface VisibilityListener {
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027e  */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.view.View, android.widget.TextView, androidx.media3.exoplayer.video.MediaCodecVideoRenderer$OnFrameRenderedListener] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        Class cls;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i17;
        Method method;
        Method method2;
        Class<?> cls2;
        Method method3;
        Method method4;
        ImageView imageView;
        ImageView imageView2;
        int i18;
        ImageView imageView3;
        View findViewById;
        View findViewById2;
        View findViewById3;
        DefaultTimeBar defaultTimeBar;
        ImageView imageView4;
        boolean z9;
        boolean z10;
        int i19;
        int i20;
        int i21;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i22;
        int i23;
        boolean z15;
        int i24;
        int i25;
        ?? r13;
        int i26;
        DefaultTimeBar defaultTimeBar2;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        ImageView imageView8;
        View view;
        ImageView imageView9;
        View view2;
        ImageView imageView10;
        ImageView imageView11;
        ImageView imageView12;
        Class cls3 = Boolean.TYPE;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        int i27 = R.layout.exo_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.PlayerControlView, i, 0);
            try {
                i27 = obtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId = obtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId2 = obtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId3 = obtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId4 = obtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId5 = obtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId6 = obtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId7 = obtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId8 = obtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                cls = cls3;
                int resourceId9 = obtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId10 = obtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId11 = obtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId12 = obtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId13 = obtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                i15 = obtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                i16 = obtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId14 = obtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.showTimeoutMs = obtainStyledAttributes.getInt(32, this.showTimeoutMs);
                this.repeatToggleModes = obtainStyledAttributes.getInt(19, this.repeatToggleModes);
                z5 = obtainStyledAttributes.getBoolean(29, true);
                z6 = obtainStyledAttributes.getBoolean(26, true);
                z7 = obtainStyledAttributes.getBoolean(28, true);
                z8 = obtainStyledAttributes.getBoolean(27, true);
                boolean z16 = obtainStyledAttributes.getBoolean(30, false);
                boolean z17 = obtainStyledAttributes.getBoolean(31, false);
                boolean z18 = obtainStyledAttributes.getBoolean(33, false);
                this.timeBarScrubbingEnabled = obtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(38, this.timeBarMinUpdateIntervalMs));
                boolean z19 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                i3 = resourceId;
                i4 = resourceId2;
                i5 = resourceId3;
                i6 = resourceId4;
                i7 = resourceId5;
                i8 = resourceId6;
                i9 = resourceId7;
                i11 = resourceId10;
                i12 = resourceId11;
                i13 = resourceId12;
                i14 = resourceId13;
                i17 = resourceId14;
                z3 = z17;
                z4 = z18;
                i10 = resourceId9;
                i2 = resourceId8;
                z2 = z16;
                z = z19;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            cls = cls3;
            i2 = R.drawable.exo_styled_controls_fullscreen_enter;
            i3 = R.drawable.exo_styled_controls_play;
            i4 = R.drawable.exo_styled_controls_pause;
            i5 = R.drawable.exo_styled_controls_next;
            i6 = R.drawable.exo_styled_controls_simple_fastforward;
            i7 = R.drawable.exo_styled_controls_previous;
            i8 = R.drawable.exo_styled_controls_simple_rewind;
            i9 = R.drawable.exo_styled_controls_fullscreen_exit;
            i10 = R.drawable.exo_styled_controls_repeat_off;
            i11 = R.drawable.exo_styled_controls_repeat_one;
            i12 = R.drawable.exo_styled_controls_repeat_all;
            i13 = R.drawable.exo_styled_controls_shuffle_on;
            i14 = R.drawable.exo_styled_controls_shuffle_off;
            i15 = R.drawable.exo_styled_controls_subtitle_on;
            i16 = R.drawable.exo_styled_controls_subtitle_off;
            z = true;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
            i17 = R.drawable.exo_styled_controls_vr;
        }
        LayoutInflater.from(context).inflate(i27, this);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        this.componentListener = new ComponentListener();
        this.visibilityListeners = new CopyOnWriteArrayList();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        int i28 = i14;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        this.updateProgressAction = new AFd1lSDK$$ExternalSyntheticLambda0(this, 22);
        Method method5 = null;
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls);
            try {
                method5 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.exoplayerClazz = ExoPlayer.class;
        this.setScrubbingModeEnabledMethod = method;
        this.isScrubbingModeEnabledMethod = method5;
        try {
            cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls2.getMethod("setScrubbingModeEnabled", cls);
                method2 = null;
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                method2 = null;
                method3 = null;
            }
            try {
                method4 = cls2.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method4 = method2;
                this.compositionPlayerClazz = cls2;
                this.compositionPlayerSetScrubbingModeEnabledMethod = method3;
                this.compositionPlayerIsScrubbingModeEnabledMethod = method4;
                this.durationView = (TextView) findViewById(R.id.exo_duration);
                this.positionView = (TextView) findViewById(R.id.exo_position);
                imageView = (ImageView) findViewById(R.id.exo_subtitle);
                this.subtitleButton = imageView;
                if (imageView != null) {
                }
                imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
                this.fullscreenButton = imageView2;
                int i29 = 1;
                Q0$$ExternalSyntheticLambda0 q0$$ExternalSyntheticLambda0 = new Q0$$ExternalSyntheticLambda0(this, i29);
                if (imageView2 != null) {
                }
                imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
                this.minimalFullscreenButton = imageView3;
                Q0$$ExternalSyntheticLambda0 q0$$ExternalSyntheticLambda02 = new Q0$$ExternalSyntheticLambda0(this, i29);
                if (imageView3 != null) {
                }
                findViewById = findViewById(R.id.exo_settings);
                this.settingsButton = findViewById;
                if (findViewById != null) {
                }
                findViewById2 = findViewById(R.id.exo_playback_speed);
                this.playbackSpeedButton = findViewById2;
                if (findViewById2 != null) {
                }
                findViewById3 = findViewById(R.id.exo_audio_track);
                this.audioTrackButton = findViewById3;
                if (findViewById3 != null) {
                }
                defaultTimeBar = (DefaultTimeBar) findViewById(R.id.exo_progress);
                View findViewById4 = findViewById(R.id.exo_progress_placeholder);
                if (defaultTimeBar == null) {
                }
                defaultTimeBar2 = this.timeBar;
                if (defaultTimeBar2 != null) {
                }
                this.handler = Util.createHandlerForCurrentLooper(r13);
                Resources resources = context.getResources();
                this.resources = resources;
                imageView5 = (ImageView) findViewById(R.id.exo_play_pause);
                this.playPauseButton = imageView5;
                if (imageView5 != null) {
                }
                imageView6 = (ImageView) findViewById(R.id.exo_prev);
                this.previousButton = imageView6;
                if (imageView6 != null) {
                }
                imageView7 = (ImageView) findViewById(R.id.exo_next);
                this.nextButton = imageView7;
                if (imageView7 != null) {
                }
                Typeface font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
                imageView8 = (ImageView) findViewById(R.id.exo_rew);
                TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                if (imageView8 == null) {
                }
                view = this.rewindButton;
                if (view != null) {
                }
                imageView9 = (ImageView) findViewById(R.id.exo_ffwd);
                TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                if (imageView9 == null) {
                }
                view2 = this.fastForwardButton;
                if (view2 != null) {
                }
                imageView10 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                this.repeatToggleButton = imageView10;
                if (imageView10 != null) {
                }
                imageView11 = (ImageView) findViewById(R.id.exo_shuffle);
                this.shuffleButton = imageView11;
                if (imageView11 != null) {
                }
                this.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                this.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView12 = (ImageView) findViewById(R.id.exo_vr);
                this.vrButton = imageView12;
                if (imageView12 != null) {
                }
                PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(this);
                this.controlViewLayoutManager = playerControlViewLayoutManager;
                playerControlViewLayoutManager.animationEnabled = z;
                SettingsAdapter settingsAdapter = new SettingsAdapter(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                this.settingsAdapter = settingsAdapter;
                this.settingsWindowMargin = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                this.settingsView = recyclerView;
                recyclerView.setAdapter(settingsAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                this.settingsWindow = popupWindow;
                popupWindow.setOnDismissListener(this.componentListener);
                this.needToHideBars = true;
                this.trackNameProvider = new DefaultTrackNameProvider(getResources(), 0);
                this.subtitleOnButtonDrawable = resources.getDrawable(i25, context.getTheme());
                this.subtitleOffButtonDrawable = resources.getDrawable(i21, context.getTheme());
                this.subtitleOnContentDescription = resources.getString(R.string.exo_controls_cc_enabled_description);
                this.subtitleOffContentDescription = resources.getString(R.string.exo_controls_cc_disabled_description);
                this.textTrackSelectionAdapter = new TextTrackSelectionAdapter(this, 0);
                this.audioTrackSelectionAdapter = new TextTrackSelectionAdapter(this, 1);
                this.playbackSpeedAdapter = new PlaybackSpeedAdapter(resources.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                this.playButtonDrawable = resources.getDrawable(i23, context.getTheme());
                this.pauseButtonDrawable = resources.getDrawable(i4, context.getTheme());
                this.fullscreenExitDrawable = resources.getDrawable(i9, context.getTheme());
                this.fullscreenEnterDrawable = resources.getDrawable(i22, context.getTheme());
                this.repeatOffButtonDrawable = resources.getDrawable(i10, context.getTheme());
                this.repeatOneButtonDrawable = resources.getDrawable(i24, context.getTheme());
                this.repeatAllButtonDrawable = resources.getDrawable(i26, context.getTheme());
                this.shuffleOnButtonDrawable = resources.getDrawable(i19, context.getTheme());
                this.shuffleOffButtonDrawable = resources.getDrawable(i20, context.getTheme());
                this.fullscreenExitContentDescription = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                this.fullscreenEnterContentDescription = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                this.repeatOffButtonContentDescription = resources.getString(R.string.exo_controls_repeat_off_description);
                this.repeatOneButtonContentDescription = resources.getString(R.string.exo_controls_repeat_one_description);
                this.repeatAllButtonContentDescription = resources.getString(R.string.exo_controls_repeat_all_description);
                this.shuffleOnContentDescription = resources.getString(R.string.exo_controls_shuffle_on_description);
                this.shuffleOffContentDescription = resources.getString(R.string.exo_controls_shuffle_off_description);
                playerControlViewLayoutManager.setShowButton((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                playerControlViewLayoutManager.setShowButton(this.fastForwardButton, z12);
                playerControlViewLayoutManager.setShowButton(this.rewindButton, z11);
                playerControlViewLayoutManager.setShowButton(imageView6, z13);
                playerControlViewLayoutManager.setShowButton(imageView7, z14);
                playerControlViewLayoutManager.setShowButton(imageView11, z15);
                playerControlViewLayoutManager.setShowButton(imageView4, z9);
                playerControlViewLayoutManager.setShowButton(imageView12, z10);
                playerControlViewLayoutManager.setShowButton(imageView10, this.repeatToggleModes == 0);
                addOnLayoutChangeListener(new PreviewView$$ExternalSyntheticLambda0(this, 1));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method2 = null;
            cls2 = null;
            method3 = null;
        }
        this.compositionPlayerClazz = cls2;
        this.compositionPlayerSetScrubbingModeEnabledMethod = method3;
        this.compositionPlayerIsScrubbingModeEnabledMethod = method4;
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.componentListener);
        }
        imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.fullscreenButton = imageView2;
        int i292 = 1;
        Q0$$ExternalSyntheticLambda0 q0$$ExternalSyntheticLambda03 = new Q0$$ExternalSyntheticLambda0(this, i292);
        if (imageView2 != null) {
            i18 = 8;
        } else {
            i18 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(q0$$ExternalSyntheticLambda03);
        }
        imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.minimalFullscreenButton = imageView3;
        Q0$$ExternalSyntheticLambda0 q0$$ExternalSyntheticLambda022 = new Q0$$ExternalSyntheticLambda0(this, i292);
        if (imageView3 != null) {
            imageView3.setVisibility(i18);
            imageView3.setOnClickListener(q0$$ExternalSyntheticLambda022);
        }
        findViewById = findViewById(R.id.exo_settings);
        this.settingsButton = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this.componentListener);
        }
        findViewById2 = findViewById(R.id.exo_playback_speed);
        this.playbackSpeedButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this.componentListener);
        }
        findViewById3 = findViewById(R.id.exo_audio_track);
        this.audioTrackButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this.componentListener);
        }
        defaultTimeBar = (DefaultTimeBar) findViewById(R.id.exo_progress);
        View findViewById42 = findViewById(R.id.exo_progress_placeholder);
        if (defaultTimeBar == null) {
            this.timeBar = defaultTimeBar;
            imageView4 = imageView;
            z9 = z3;
            z10 = z4;
            i19 = i13;
            i20 = i28;
            i21 = i16;
            z11 = z5;
            z12 = z6;
            z13 = z7;
            z14 = z8;
            i22 = i2;
            i23 = i3;
            z15 = z2;
            i24 = i11;
            i25 = i15;
            r13 = 0;
            i26 = i12;
        } else if (findViewById42 != null) {
            boolean z20 = z3;
            i22 = i2;
            z9 = z20;
            z10 = z4;
            i20 = i28;
            imageView4 = imageView;
            z11 = z5;
            z12 = z6;
            z13 = z7;
            z14 = z8;
            i23 = i3;
            z15 = z2;
            i19 = i13;
            i25 = i15;
            i21 = i16;
            i24 = i11;
            i26 = i12;
            r13 = 0;
            DefaultTimeBar defaultTimeBar3 = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar3.setId(R.id.exo_progress);
            defaultTimeBar3.setLayoutParams(findViewById42.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById42.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById42);
            viewGroup.removeView(findViewById42);
            viewGroup.addView(defaultTimeBar3, indexOfChild);
            this.timeBar = defaultTimeBar3;
        } else {
            imageView4 = imageView;
            z9 = z3;
            z10 = z4;
            i19 = i13;
            i20 = i28;
            i21 = i16;
            z11 = z5;
            z12 = z6;
            z13 = z7;
            z14 = z8;
            i22 = i2;
            i23 = i3;
            z15 = z2;
            i24 = i11;
            i25 = i15;
            r13 = 0;
            i26 = i12;
            this.timeBar = null;
        }
        defaultTimeBar2 = this.timeBar;
        if (defaultTimeBar2 != null) {
            ComponentListener componentListener = this.componentListener;
            componentListener.getClass();
            defaultTimeBar2.listeners.add(componentListener);
        }
        this.handler = Util.createHandlerForCurrentLooper(r13);
        Resources resources2 = context.getResources();
        this.resources = resources2;
        imageView5 = (ImageView) findViewById(R.id.exo_play_pause);
        this.playPauseButton = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(this.componentListener);
        }
        imageView6 = (ImageView) findViewById(R.id.exo_prev);
        this.previousButton = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources2.getDrawable(i7, context.getTheme()));
            imageView6.setOnClickListener(this.componentListener);
        }
        imageView7 = (ImageView) findViewById(R.id.exo_next);
        this.nextButton = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources2.getDrawable(i5, context.getTheme()));
            imageView7.setOnClickListener(this.componentListener);
        }
        Typeface font2 = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
        imageView8 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView3 = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView8 == null) {
            imageView8.setImageDrawable(resources2.getDrawable(i8, context.getTheme()));
            this.rewindButton = imageView8;
            this.rewindButtonTextView = null;
        } else if (textView3 != null) {
            textView3.setTypeface(font2);
            this.rewindButtonTextView = textView3;
            this.rewindButton = textView3;
        } else {
            this.rewindButtonTextView = r13;
            this.rewindButton = r13;
        }
        view = this.rewindButton;
        if (view != null) {
            view.setOnClickListener(this.componentListener);
        }
        imageView9 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView22 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView9 == null) {
            imageView9.setImageDrawable(resources2.getDrawable(i6, context.getTheme()));
            this.fastForwardButton = imageView9;
            this.fastForwardButtonTextView = null;
        } else if (textView22 != null) {
            textView22.setTypeface(font2);
            this.fastForwardButtonTextView = textView22;
            this.fastForwardButton = textView22;
        } else {
            this.fastForwardButtonTextView = null;
            this.fastForwardButton = null;
        }
        view2 = this.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(this.componentListener);
        }
        imageView10 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.componentListener);
        }
        imageView11 = (ImageView) findViewById(R.id.exo_shuffle);
        this.shuffleButton = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(this.componentListener);
        }
        this.buttonAlphaEnabled = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView12 = (ImageView) findViewById(R.id.exo_vr);
        this.vrButton = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(resources2.getDrawable(i17, context.getTheme()));
            updateButton(imageView12, false);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager2 = new PlayerControlViewLayoutManager(this);
        this.controlViewLayoutManager = playerControlViewLayoutManager2;
        playerControlViewLayoutManager2.animationEnabled = z;
        SettingsAdapter settingsAdapter2 = new SettingsAdapter(new String[]{resources2.getString(R.string.exo_controls_playback_speed), resources2.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources2.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources2.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.settingsAdapter = settingsAdapter2;
        this.settingsWindowMargin = resources2.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.settingsView = recyclerView2;
        recyclerView2.setAdapter(settingsAdapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
        this.settingsWindow = popupWindow2;
        popupWindow2.setOnDismissListener(this.componentListener);
        this.needToHideBars = true;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources(), 0);
        this.subtitleOnButtonDrawable = resources2.getDrawable(i25, context.getTheme());
        this.subtitleOffButtonDrawable = resources2.getDrawable(i21, context.getTheme());
        this.subtitleOnContentDescription = resources2.getString(R.string.exo_controls_cc_enabled_description);
        this.subtitleOffContentDescription = resources2.getString(R.string.exo_controls_cc_disabled_description);
        this.textTrackSelectionAdapter = new TextTrackSelectionAdapter(this, 0);
        this.audioTrackSelectionAdapter = new TextTrackSelectionAdapter(this, 1);
        this.playbackSpeedAdapter = new PlaybackSpeedAdapter(resources2.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        this.playButtonDrawable = resources2.getDrawable(i23, context.getTheme());
        this.pauseButtonDrawable = resources2.getDrawable(i4, context.getTheme());
        this.fullscreenExitDrawable = resources2.getDrawable(i9, context.getTheme());
        this.fullscreenEnterDrawable = resources2.getDrawable(i22, context.getTheme());
        this.repeatOffButtonDrawable = resources2.getDrawable(i10, context.getTheme());
        this.repeatOneButtonDrawable = resources2.getDrawable(i24, context.getTheme());
        this.repeatAllButtonDrawable = resources2.getDrawable(i26, context.getTheme());
        this.shuffleOnButtonDrawable = resources2.getDrawable(i19, context.getTheme());
        this.shuffleOffButtonDrawable = resources2.getDrawable(i20, context.getTheme());
        this.fullscreenExitContentDescription = resources2.getString(R.string.exo_controls_fullscreen_exit_description);
        this.fullscreenEnterContentDescription = resources2.getString(R.string.exo_controls_fullscreen_enter_description);
        this.repeatOffButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources2.getString(R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources2.getString(R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager2.setShowButton((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        playerControlViewLayoutManager2.setShowButton(this.fastForwardButton, z12);
        playerControlViewLayoutManager2.setShowButton(this.rewindButton, z11);
        playerControlViewLayoutManager2.setShowButton(imageView6, z13);
        playerControlViewLayoutManager2.setShowButton(imageView7, z14);
        playerControlViewLayoutManager2.setShowButton(imageView11, z15);
        playerControlViewLayoutManager2.setShowButton(imageView4, z9);
        playerControlViewLayoutManager2.setShowButton(imageView12, z10);
        playerControlViewLayoutManager2.setShowButton(imageView10, this.repeatToggleModes == 0);
        addOnLayoutChangeListener(new PreviewView$$ExternalSyntheticLambda0(this, 1));
    }

    public static void access$2300(PlayerControlView playerControlView, Player player, long j) {
        if (playerControlView.multiWindowTimeBar) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
            if (exoPlayerImpl.isCommandAvailable(17) && exoPlayerImpl.isCommandAvailable(10)) {
                Timeline currentTimeline = exoPlayerImpl.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i = 0;
                while (true) {
                    long usToMs = Util.usToMs(currentTimeline.getWindow(i, playerControlView.window, 0L).durationUs);
                    if (j < usToMs) {
                        break;
                    }
                    if (i == windowCount - 1) {
                        j = usToMs;
                        break;
                    } else {
                        j -= usToMs;
                        i++;
                    }
                }
                exoPlayerImpl.seekTo(j, i, false);
            }
        } else {
            ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player;
            if (exoPlayerImpl2.isCommandAvailable(5)) {
                exoPlayerImpl2.seekTo(j, exoPlayerImpl2.getCurrentMediaItemIndex(), false);
            }
        }
        playerControlView.updateProgress();
    }

    public static boolean canShowMultiWindowTimeBar(Player player, Timeline.Window window) {
        Timeline currentTimeline;
        int windowCount;
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        if (!exoPlayerImpl.isCommandAvailable(17) || (windowCount = (currentTimeline = exoPlayerImpl.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i = 0; i < windowCount; i++) {
            if (currentTimeline.getWindow(i, window, 0L).durationUs == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                if (exoPlayerImpl.getPlaybackState() != 4 && exoPlayerImpl.isCommandAvailable(12)) {
                    exoPlayerImpl.verifyApplicationThread();
                    long currentPosition = exoPlayerImpl.getCurrentPosition() + exoPlayerImpl.seekForwardIncrementMs;
                    long duration = exoPlayerImpl.getDuration();
                    if (duration != -9223372036854775807L) {
                        currentPosition = Math.min(currentPosition, duration);
                    }
                    exoPlayerImpl.seekTo(Math.max(currentPosition, 0L), exoPlayerImpl.getCurrentMediaItemIndex(), false);
                }
            } else {
                if (keyCode == 89) {
                    ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player;
                    if (exoPlayerImpl2.isCommandAvailable(11)) {
                        exoPlayerImpl2.verifyApplicationThread();
                        long currentPosition2 = exoPlayerImpl2.getCurrentPosition() + (-exoPlayerImpl2.seekBackIncrementMs);
                        long duration2 = exoPlayerImpl2.getDuration();
                        if (duration2 != -9223372036854775807L) {
                            currentPosition2 = Math.min(currentPosition2, duration2);
                        }
                        exoPlayerImpl2.seekTo(Math.max(currentPosition2, 0L), exoPlayerImpl2.getCurrentMediaItemIndex(), false);
                    }
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode == 79 || keyCode == 85) {
                        if (Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                            Util.handlePlayButtonAction(player);
                        } else {
                            ExoPlayerImpl exoPlayerImpl3 = (ExoPlayerImpl) player;
                            if (exoPlayerImpl3.isCommandAvailable(1)) {
                                exoPlayerImpl3.setPlayWhenReady(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        ExoPlayerImpl exoPlayerImpl4 = (ExoPlayerImpl) player;
                        if (exoPlayerImpl4.isCommandAvailable(9)) {
                            exoPlayerImpl4.seekToNext();
                        }
                    } else if (keyCode == 88) {
                        ExoPlayerImpl exoPlayerImpl5 = (ExoPlayerImpl) player;
                        if (exoPlayerImpl5.isCommandAvailable(7)) {
                            exoPlayerImpl5.seekToPrevious();
                        }
                    } else if (keyCode == 126) {
                        Util.handlePlayButtonAction(player);
                    } else if (keyCode == 127) {
                        String str = Util.DEVICE_DEBUG_INFO;
                        ExoPlayerImpl exoPlayerImpl6 = (ExoPlayerImpl) player;
                        if (exoPlayerImpl6.isCommandAvailable(1)) {
                            exoPlayerImpl6.setPlayWhenReady(false);
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void displaySettingsWindow(RecyclerView.Adapter adapter, View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        PopupWindow popupWindow = this.settingsWindow;
        popupWindow.dismiss();
        this.needToHideBars = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.settingsWindowMargin;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final RegularImmutableList gatherSupportedTrackInfosOfType(Tracks tracks, int i) {
        ImmutableList immutableList;
        Tracks.Group group;
        String buildLanguageOrLabelString;
        String mediaMimeType;
        int i2 = 4;
        DimensionKt.checkNonnegative(4, "initialCapacity");
        Object[] objArr = new Object[4];
        ImmutableList immutableList2 = tracks.groups;
        int i3 = 0;
        int i4 = 0;
        while (i3 < immutableList2.size()) {
            Tracks.Group group2 = (Tracks.Group) immutableList2.get(i3);
            if (group2.mediaTrackGroup.f871type == i) {
                int i5 = 0;
                while (i5 < group2.length) {
                    if (group2.trackSupport[i5] == i2) {
                        Format format2 = group2.mediaTrackGroup.formats[i5];
                        int i6 = format2.selectionFlags;
                        int i7 = format2.bitrate;
                        if ((i6 & 2) == 0) {
                            DefaultTrackNameProvider defaultTrackNameProvider = this.trackNameProvider;
                            Resources resources = defaultTrackNameProvider.resources;
                            Resources resources2 = defaultTrackNameProvider.resources;
                            String str = format2.sampleMimeType;
                            int i8 = format2.channelCount;
                            immutableList = immutableList2;
                            int i9 = format2.height;
                            int i10 = i4;
                            int i11 = format2.width;
                            group = group2;
                            String str2 = format2.codecs;
                            int trackType = MimeTypes.getTrackType(str);
                            if (trackType == -1) {
                                String str3 = null;
                                if (str2 != null) {
                                    String[] split = TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1);
                                    int length = split.length;
                                    String[] strArr = split;
                                    for (int i12 = 0; i12 < length; i12++) {
                                        mediaMimeType = MimeTypes.getMediaMimeType(strArr[i12]);
                                        if (mediaMimeType != null && MimeTypes.isVideo(mediaMimeType)) {
                                            break;
                                        }
                                    }
                                }
                                mediaMimeType = null;
                                if (mediaMimeType == null) {
                                    if (str2 != null) {
                                        String[] split2 = TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1);
                                        int length2 = split2.length;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= length2) {
                                                break;
                                            }
                                            String mediaMimeType2 = MimeTypes.getMediaMimeType(split2[i13]);
                                            if (mediaMimeType2 != null && MimeTypes.isAudio(mediaMimeType2)) {
                                                str3 = mediaMimeType2;
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                    if (str3 == null) {
                                        if (i11 == -1 && i9 == -1) {
                                            if (i8 == -1 && format2.sampleRate == -1) {
                                                trackType = -1;
                                            }
                                        }
                                    }
                                    trackType = 1;
                                }
                                trackType = 2;
                            }
                            if (trackType == 2) {
                                buildLanguageOrLabelString = defaultTrackNameProvider.joinWithSeparator(defaultTrackNameProvider.buildRoleString(format2), (i11 == -1 || i9 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i9)), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else if (trackType == 1) {
                                buildLanguageOrLabelString = defaultTrackNameProvider.joinWithSeparator(defaultTrackNameProvider.buildLanguageOrLabelString(format2), (i8 == -1 || i8 < 1) ? "" : i8 != 1 ? i8 != 2 ? (i8 == 6 || i8 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i8 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else {
                                buildLanguageOrLabelString = defaultTrackNameProvider.buildLanguageOrLabelString(format2);
                            }
                            if (buildLanguageOrLabelString.isEmpty()) {
                                String str4 = format2.language;
                                buildLanguageOrLabelString = (str4 == null || str4.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str4);
                            }
                            TrackInformation trackInformation = new TrackInformation(tracks, i3, i5, buildLanguageOrLabelString);
                            i4 = i10 + 1;
                            int expandedCapacity = ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, i4);
                            if (expandedCapacity > objArr.length) {
                                objArr = Arrays.copyOf(objArr, expandedCapacity);
                            }
                            objArr[i10] = trackInformation;
                            i5++;
                            immutableList2 = immutableList;
                            group2 = group;
                            i2 = 4;
                        }
                    }
                    immutableList = immutableList2;
                    group = group2;
                    i5++;
                    immutableList2 = immutableList;
                    group2 = group;
                    i2 = 4;
                }
            }
            i3++;
            immutableList2 = immutableList2;
            i2 = 4;
        }
        return ImmutableList.asImmutableList(i4, objArr);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void hide() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.controlViewLayoutManager;
        int i = playerControlViewLayoutManager.uxState;
        if (i == 3 || i == 2) {
            return;
        }
        playerControlViewLayoutManager.removeHideCallbacks();
        if (!playerControlViewLayoutManager.animationEnabled) {
            playerControlViewLayoutManager.setUxState(2);
        } else if (playerControlViewLayoutManager.uxState == 1) {
            playerControlViewLayoutManager.hideProgressBarAnimator.start();
        } else {
            playerControlViewLayoutManager.hideAllBarsAnimator.start();
        }
    }

    public final boolean isCompositionPlayer(Player player) {
        Class cls;
        return (player == null || (cls = this.compositionPlayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    public final boolean isExoPlayer(Player player) {
        Class cls;
        return (player == null || (cls = this.exoplayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    public final boolean isFullyVisible() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.controlViewLayoutManager;
        return playerControlViewLayoutManager.uxState == 0 && playerControlViewLayoutManager.playerControlView.isVisible();
    }

    public final boolean isScrubbingModeEnabled(Player player) {
        try {
            if (isExoPlayer(player)) {
                Method method = this.isScrubbingModeEnabledMethod;
                method.getClass();
                Object invoke = method.invoke(player, null);
                invoke.getClass();
                if (((Boolean) invoke).booleanValue()) {
                    return true;
                }
            }
            if (isCompositionPlayer(player)) {
                Method method2 = this.compositionPlayerIsScrubbingModeEnabledMethod;
                method2.getClass();
                Object invoke2 = method2.invoke(player, null);
                invoke2.getClass();
                if (((Boolean) invoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException | InvocationTargetException e) {
            a$$ExternalSyntheticBUOutline0.m(e);
            return false;
        }
    }

    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.controlViewLayoutManager;
        playerControlViewLayoutManager.playerControlView.addOnLayoutChangeListener(playerControlViewLayoutManager.onLayoutChangeListener);
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            playerControlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.controlViewLayoutManager;
        playerControlViewLayoutManager.playerControlView.removeOnLayoutChangeListener(playerControlViewLayoutManager.onLayoutChangeListener);
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        playerControlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.controlViewLayoutManager.controlsBackground;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.animationEnabled = z;
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            zArr.getClass();
            Trace.checkArgument(jArr.length == zArr.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateTimeline();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMediaRouteButtonViewProvider(ViewProvider viewProvider) {
        View findViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (findViewById == null) {
            a$$ExternalSyntheticBUOutline0.m$1("The media route button placeholder is missing.");
            return;
        }
        if (viewProvider == null) {
            findViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
        if (viewGroup == null) {
            a$$ExternalSyntheticBUOutline0.m$1("The media route button placeholder has no parent view.");
            return;
        }
        ListenableFuture view = viewProvider.getView();
        SVG svg = new SVG(2, this, findViewById, viewGroup);
        Handler handler = this.handler;
        Objects.requireNonNull(handler);
        view.addListener(new zzb(view, svg, 0 == true ? 1 : 0, 15), new PlayerControlView$$ExternalSyntheticLambda0(handler, 0));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        boolean z = onFullScreenModeChangedListener != null;
        ImageView imageView = this.fullscreenButton;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = onFullScreenModeChangedListener != null;
        ImageView imageView2 = this.minimalFullscreenButton;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(Player player) {
        Trace.checkState(Looper.myLooper() == Looper.getMainLooper());
        Trace.checkArgument(player == null || ((ExoPlayerImpl) player).applicationLooper == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        ComponentListener componentListener = this.componentListener;
        if (player2 != null) {
            ((ExoPlayerImpl) player2).removeListener(componentListener);
        }
        this.player = player;
        if (player != null) {
            ((ExoPlayerImpl) player).addListener(componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        Player player = this.player;
        if (player != null && ((ExoPlayerImpl) player).isCommandAvailable(15)) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.player;
            exoPlayerImpl.verifyApplicationThread();
            int i2 = exoPlayerImpl.repeatMode;
            if (i == 0 && i2 != 0) {
                ((ExoPlayerImpl) this.player).setRepeatMode(0);
            } else if (i == 1 && i2 == 2) {
                ((ExoPlayerImpl) this.player).setRepeatMode(1);
            } else if (i == 2 && i2 == 1) {
                ((ExoPlayerImpl) this.player).setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z);
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z);
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z);
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.timeBarScrubbingEnabled = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(imageView, onClickListener != null);
        }
    }

    public final void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public final void updateButton(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    public final void updateIsFullscreen(boolean z) {
        if (this.isFullscreen == z) {
            return;
        }
        this.isFullscreen = z;
        String str = this.fullscreenEnterContentDescription;
        Drawable drawable = this.fullscreenEnterDrawable;
        String str2 = this.fullscreenExitContentDescription;
        Drawable drawable2 = this.fullscreenExitDrawable;
        ImageView imageView = this.fullscreenButton;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.minimalFullscreenButton;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    public final void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                z = (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window)) ? ((ExoPlayerImpl) player).isCommandAvailable(10) : ((ExoPlayerImpl) player).isCommandAvailable(5);
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                z3 = exoPlayerImpl.isCommandAvailable(7);
                z4 = exoPlayerImpl.isCommandAvailable(11);
                z5 = exoPlayerImpl.isCommandAvailable(12);
                z2 = exoPlayerImpl.isCommandAvailable(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            Resources resources = this.resources;
            View view = this.rewindButton;
            if (z4) {
                Player player2 = this.player;
                if (player2 != null) {
                    ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player2;
                    exoPlayerImpl2.verifyApplicationThread();
                    j2 = exoPlayerImpl2.seekBackIncrementMs;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.rewindButtonTextView;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.fastForwardButton;
            if (z5) {
                Player player3 = this.player;
                if (player3 != null) {
                    ExoPlayerImpl exoPlayerImpl3 = (ExoPlayerImpl) player3;
                    exoPlayerImpl3.verifyApplicationThread();
                    j = exoPlayerImpl3.seekForwardIncrementMs;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.fastForwardButtonTextView;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            updateButton(this.previousButton, z3);
            updateButton(view, z4);
            updateButton(view2, z5);
            updateButton(this.nextButton, z2);
            DefaultTimeBar defaultTimeBar = this.timeBar;
            if (defaultTimeBar != null) {
                defaultTimeBar.setEnabled(z);
            }
        }
    }

    public final void updatePlayPauseButton() {
        ImageView imageView;
        boolean z;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.playPauseButton) != null) {
            boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            Drawable drawable = shouldShowPlayButton ? this.playButtonDrawable : this.pauseButtonDrawable;
            int i = shouldShowPlayButton ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.resources.getString(i));
            Player player = this.player;
            boolean z2 = false;
            if (player != null) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                int playbackState = exoPlayerImpl.getPlaybackState();
                if (exoPlayerImpl.isCommandAvailable(16)) {
                    Timeline currentTimeline = exoPlayerImpl.getCurrentTimeline();
                    if ((currentTimeline.isEmpty() ? null : currentTimeline.getWindow(exoPlayerImpl.getCurrentMediaItemIndex(), exoPlayerImpl.window, 0L).mediaItem) == null) {
                        z = false;
                        boolean isCommandAvailable = exoPlayerImpl.isCommandAvailable(1);
                        boolean z3 = playbackState != 1 && exoPlayerImpl.isCommandAvailable(2);
                        boolean z4 = playbackState != 4 && exoPlayerImpl.isCommandAvailable(4);
                        if (z && (isCommandAvailable || z3 || z4)) {
                            z2 = true;
                        }
                    }
                }
                z = true;
                boolean isCommandAvailable2 = exoPlayerImpl.isCommandAvailable(1);
                if (playbackState != 1) {
                }
                if (playbackState != 4) {
                }
                if (z) {
                    z2 = true;
                }
            }
            updateButton(imageView, z2);
        }
    }

    public final void updatePlaybackSpeedList() {
        PlaybackSpeedAdapter playbackSpeedAdapter;
        Player player = this.player;
        if (player == null) {
            return;
        }
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        exoPlayerImpl.verifyApplicationThread();
        float f = exoPlayerImpl.playbackInfo.playbackParameters.speed;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            playbackSpeedAdapter = this.playbackSpeedAdapter;
            float[] fArr = playbackSpeedAdapter.playbackSpeeds;
            if (i >= fArr.length) {
                break;
            }
            float abs = Math.abs(f - fArr[i]);
            if (abs < f2) {
                i2 = i;
                f2 = abs;
            }
            i++;
        }
        playbackSpeedAdapter.selectedIndex = i2;
        String str = playbackSpeedAdapter.playbackSpeedTexts[i2];
        SettingsAdapter settingsAdapter = this.settingsAdapter;
        settingsAdapter.subTexts[0] = str;
        updateButton(this.settingsButton, settingsAdapter.shouldShowSetting(1) || settingsAdapter.shouldShowSetting(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateProgress() {
        long j;
        long j2;
        TextView textView;
        DefaultTimeBar defaultTimeBar;
        int playbackState;
        long j3;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                if (exoPlayerImpl.isCommandAvailable(16)) {
                    long j4 = this.currentWindowOffset;
                    exoPlayerImpl.verifyApplicationThread();
                    j = exoPlayerImpl.getContentPositionInternal(exoPlayerImpl.playbackInfo) + j4;
                    j2 = exoPlayerImpl.getContentBufferedPosition() + this.currentWindowOffset;
                    textView = this.positionView;
                    if (textView != null && !this.scrubbing) {
                        textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j));
                    }
                    defaultTimeBar = this.timeBar;
                    if (defaultTimeBar != null) {
                        defaultTimeBar.setPosition(j);
                        if (isScrubbingModeEnabled(player)) {
                            j2 = j;
                        }
                        defaultTimeBar.setBufferedPosition(j2);
                    }
                    AFd1lSDK$$ExternalSyntheticLambda0 aFd1lSDK$$ExternalSyntheticLambda0 = this.updateProgressAction;
                    removeCallbacks(aFd1lSDK$$ExternalSyntheticLambda0);
                    playbackState = player != null ? 1 : ((ExoPlayerImpl) player).getPlaybackState();
                    if (player != null) {
                        ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player;
                        if (exoPlayerImpl2.isPlaying()) {
                            if (defaultTimeBar != null) {
                                int width = (int) (defaultTimeBar.progressBar.width() / defaultTimeBar.density);
                                if (width != 0) {
                                    long j5 = defaultTimeBar.duration;
                                    if (j5 != 0 && j5 != -9223372036854775807L) {
                                        j3 = j5 / width;
                                    }
                                }
                                j3 = Long.MAX_VALUE;
                            } else {
                                j3 = 1000;
                            }
                            long min = Math.min(j3, 1000 - (j % 1000));
                            exoPlayerImpl2.verifyApplicationThread();
                            float f = exoPlayerImpl2.playbackInfo.playbackParameters.speed;
                            postDelayed(aFd1lSDK$$ExternalSyntheticLambda0, Util.constrainValue(f > RecyclerView.DECELERATION_RATE ? (long) (min / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
                            return;
                        }
                    }
                    if (playbackState != 4 || playbackState == 1) {
                    }
                    postDelayed(aFd1lSDK$$ExternalSyntheticLambda0, 1000L);
                    return;
                }
            }
            j = 0;
            j2 = 0;
            textView = this.positionView;
            if (textView != null) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j));
            }
            defaultTimeBar = this.timeBar;
            if (defaultTimeBar != null) {
            }
            AFd1lSDK$$ExternalSyntheticLambda0 aFd1lSDK$$ExternalSyntheticLambda02 = this.updateProgressAction;
            removeCallbacks(aFd1lSDK$$ExternalSyntheticLambda02);
            if (player != null) {
            }
            if (player != null) {
            }
            if (playbackState != 4) {
            }
        }
    }

    public final void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(imageView, false);
                return;
            }
            Player player = this.player;
            String str = this.repeatOffButtonContentDescription;
            Drawable drawable = this.repeatOffButtonDrawable;
            if (player != null) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                if (exoPlayerImpl.isCommandAvailable(15)) {
                    updateButton(imageView, true);
                    exoPlayerImpl.verifyApplicationThread();
                    int i = exoPlayerImpl.repeatMode;
                    if (i == 0) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str);
                        return;
                    } else if (i == 1) {
                        imageView.setImageDrawable(this.repeatOneButtonDrawable);
                        imageView.setContentDescription(this.repeatOneButtonContentDescription);
                        return;
                    } else {
                        if (i != 2) {
                            return;
                        }
                        imageView.setImageDrawable(this.repeatAllButtonDrawable);
                        imageView.setContentDescription(this.repeatAllButtonContentDescription);
                        return;
                    }
                }
            }
            updateButton(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void updateSettingsWindowSize() {
        RecyclerView recyclerView = this.settingsView;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.settingsWindowMargin;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.settingsWindow;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.controlViewLayoutManager.shownButtons.contains(imageView)) {
                updateButton(imageView, false);
                return;
            }
            String str = this.shuffleOffContentDescription;
            Drawable drawable = this.shuffleOffButtonDrawable;
            if (player != null) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                if (exoPlayerImpl.isCommandAvailable(14)) {
                    updateButton(imageView, true);
                    exoPlayerImpl.verifyApplicationThread();
                    if (exoPlayerImpl.shuffleModeEnabled) {
                        drawable = this.shuffleOnButtonDrawable;
                    }
                    imageView.setImageDrawable(drawable);
                    exoPlayerImpl.verifyApplicationThread();
                    if (exoPlayerImpl.shuffleModeEnabled) {
                        str = this.shuffleOnContentDescription;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            updateButton(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void updateTimeline() {
        long j;
        long j2;
        int i;
        long usToMs;
        int i2;
        Timeline timeline;
        boolean z;
        boolean[] zArr;
        boolean z2;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z3 = this.showMultiWindowTimeBar;
        Timeline.Window window = this.window;
        boolean z4 = false;
        boolean z5 = true;
        this.multiWindowTimeBar = z3 && canShowMultiWindowTimeBar(player, window);
        long j3 = 0;
        this.currentWindowOffset = 0L;
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        Timeline currentTimeline = exoPlayerImpl.isCommandAvailable(17) ? exoPlayerImpl.getCurrentTimeline() : Timeline.EMPTY;
        if (currentTimeline.isEmpty()) {
            if (exoPlayerImpl.isCommandAvailable(16)) {
                Timeline currentTimeline2 = exoPlayerImpl.getCurrentTimeline();
                if (currentTimeline2.isEmpty()) {
                    usToMs = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    usToMs = Util.usToMs(currentTimeline2.getWindow(exoPlayerImpl.getCurrentMediaItemIndex(), exoPlayerImpl.window, 0L).durationUs);
                }
                if (usToMs != -9223372036854775807L) {
                    j2 = Util.msToUs(usToMs);
                    i = 0;
                }
            } else {
                j = 0;
            }
            j2 = j;
            i = 0;
        } else {
            int currentMediaItemIndex = exoPlayerImpl.getCurrentMediaItemIndex();
            boolean z6 = this.multiWindowTimeBar;
            int i3 = z6 ? 0 : currentMediaItemIndex;
            int windowCount = z6 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i = 0;
            long j4 = 0;
            Timeline timeline2 = currentTimeline;
            while (true) {
                if (i3 > windowCount) {
                    break;
                }
                long j5 = -9223372036854775807L;
                if (i3 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j4);
                }
                timeline2.getWindow(i3, window);
                if (window.durationUs == -9223372036854775807L) {
                    Trace.checkState(this.multiWindowTimeBar ^ z5);
                    break;
                }
                int i4 = window.firstPeriodIndex;
                Timeline timeline3 = timeline2;
                boolean z7 = z4;
                while (i4 <= window.lastPeriodIndex) {
                    Timeline.Period period = this.period;
                    timeline3.getPeriod(i4, period, z7);
                    long j6 = j5;
                    AdPlaybackState adPlaybackState = period.adPlaybackState;
                    adPlaybackState.getClass();
                    int i5 = adPlaybackState.adGroupCount;
                    Timeline timeline4 = timeline3;
                    for (int i6 = z7; i6 < i5; i6++) {
                        period.getAdGroupTimeUs(i6);
                        long j7 = j3;
                        long j8 = period.positionInWindowUs;
                        if (j8 >= j7) {
                            long[] jArr = this.adGroupTimesMs;
                            i2 = currentMediaItemIndex;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                            }
                            this.adGroupTimesMs[i] = Util.usToMs(j8 + j4);
                            boolean[] zArr2 = this.playedAdGroups;
                            AdPlaybackState.AdGroup adGroup = period.adPlaybackState.getAdGroup(i6);
                            int i7 = adGroup.count;
                            if (i7 == -1) {
                                zArr = zArr2;
                                timeline = timeline4;
                                z = true;
                                z2 = true;
                            } else {
                                int i8 = 0;
                                Timeline timeline5 = timeline4;
                                while (i8 < i7) {
                                    zArr = zArr2;
                                    int i9 = adGroup.states[i8];
                                    timeline = timeline5;
                                    z = true;
                                    if (i9 == 0 || i9 == 1) {
                                        z2 = true;
                                        break;
                                    } else {
                                        i8++;
                                        zArr2 = zArr;
                                        timeline5 = timeline;
                                    }
                                }
                                zArr = zArr2;
                                timeline = timeline5;
                                z = true;
                                z2 = false;
                            }
                            zArr[i] = !z2;
                            i++;
                        } else {
                            i2 = currentMediaItemIndex;
                            timeline = timeline4;
                            z = z5;
                        }
                        z5 = z;
                        j3 = j7;
                        currentMediaItemIndex = i2;
                        timeline4 = timeline;
                    }
                    i4++;
                    j5 = j6;
                    timeline3 = timeline4;
                    z7 = false;
                }
                j4 += window.durationUs;
                i3++;
                z5 = z5;
                timeline2 = timeline3;
                z4 = false;
            }
            j2 = j4;
        }
        long usToMs2 = Util.usToMs(j2);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, usToMs2));
        }
        DefaultTimeBar defaultTimeBar = this.timeBar;
        if (defaultTimeBar != null) {
            defaultTimeBar.setDuration(usToMs2);
            int length2 = this.extraAdGroupTimesMs.length;
            int i10 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i10 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i10);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i10);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            defaultTimeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i10);
        }
        updateProgress();
    }

    public final void updateTrackLists() {
        TextTrackSelectionAdapter textTrackSelectionAdapter = this.textTrackSelectionAdapter;
        textTrackSelectionAdapter.getClass();
        List list = Collections.EMPTY_LIST;
        textTrackSelectionAdapter.tracks = list;
        TextTrackSelectionAdapter textTrackSelectionAdapter2 = this.audioTrackSelectionAdapter;
        textTrackSelectionAdapter2.getClass();
        textTrackSelectionAdapter2.tracks = list;
        Player player = this.player;
        ImageView imageView = this.subtitleButton;
        if (player != null && ((ExoPlayerImpl) player).isCommandAvailable(30) && ((ExoPlayerImpl) this.player).isCommandAvailable(29)) {
            Tracks currentTracks = ((ExoPlayerImpl) this.player).getCurrentTracks();
            RegularImmutableList gatherSupportedTrackInfosOfType = gatherSupportedTrackInfosOfType(currentTracks, 1);
            textTrackSelectionAdapter2.tracks = gatherSupportedTrackInfosOfType;
            PlayerControlView playerControlView = textTrackSelectionAdapter2.this$0;
            Player player2 = playerControlView.player;
            SettingsAdapter settingsAdapter = playerControlView.settingsAdapter;
            player2.getClass();
            TrackSelectionParameters trackSelectionParameters = ((ExoPlayerImpl) player2).getTrackSelectionParameters();
            if (!gatherSupportedTrackInfosOfType.isEmpty()) {
                if (textTrackSelectionAdapter2.hasSelectionOverride(trackSelectionParameters)) {
                    int i = 0;
                    while (true) {
                        if (i >= gatherSupportedTrackInfosOfType.size) {
                            break;
                        }
                        TrackInformation trackInformation = (TrackInformation) gatherSupportedTrackInfosOfType.get(i);
                        if (trackInformation.trackGroup.trackSelected[trackInformation.trackIndex]) {
                            settingsAdapter.subTexts[1] = trackInformation.trackName;
                            break;
                        }
                        i++;
                    }
                } else {
                    settingsAdapter.subTexts[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                settingsAdapter.subTexts[1] = playerControlView.getResources().getString(R.string.exo_track_selection_none);
            }
            PlayerControlViewLayoutManager playerControlViewLayoutManager = this.controlViewLayoutManager;
            if (imageView == null) {
                playerControlViewLayoutManager.getClass();
            } else if (playerControlViewLayoutManager.shownButtons.contains(imageView)) {
                textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            }
            textTrackSelectionAdapter.init(RegularImmutableList.EMPTY);
        }
        updateButton(imageView, textTrackSelectionAdapter.getItemCount() > 0);
        SettingsAdapter settingsAdapter2 = this.settingsAdapter;
        updateButton(this.settingsButton, settingsAdapter2.shouldShowSetting(1) || settingsAdapter2.shouldShowSetting(0));
    }

    public final class TextTrackSelectionAdapter extends RecyclerView.Adapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ PlayerControlView this$0;
        public final /* synthetic */ PlayerControlView this$0$1;
        public List tracks = new ArrayList();

        public TextTrackSelectionAdapter(PlayerControlView playerControlView, int i) {
            this.$r8$classId = i;
            this.this$0 = playerControlView;
            this.this$0$1 = playerControlView;
        }

        private final void onTrackSelection$androidx$media3$ui$PlayerControlView$TextTrackSelectionAdapter(String str) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        public boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.tracks.size(); i++) {
                if (trackSelectionParameters.overrides.containsKey(((TrackInformation) this.tracks.get(i)).trackGroup.mediaTrackGroup)) {
                    return true;
                }
            }
            return false;
        }

        public void init(List list) {
            PlayerControlView playerControlView = this.this$0;
            ImageView imageView = playerControlView.subtitleButton;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= ((RegularImmutableList) list).size) {
                    break;
                }
                TrackInformation trackInformation = (TrackInformation) ((RegularImmutableList) list).get(i);
                if (trackInformation.trackGroup.trackSelected[trackInformation.trackIndex]) {
                    z = true;
                    break;
                }
                i++;
            }
            if (imageView != null) {
                imageView.setImageDrawable(z ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                imageView.setContentDescription(z ? playerControlView.subtitleOnContentDescription : playerControlView.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            switch (this.$r8$classId) {
                case 0:
                    onBindViewHolder$androidx$media3$ui$PlayerControlView$TrackSelectionAdapter(subSettingViewHolder, i);
                    if (i > 0) {
                        TrackInformation trackInformation = (TrackInformation) this.tracks.get(i - 1);
                        subSettingViewHolder.checkView.setVisibility(trackInformation.trackGroup.trackSelected[trackInformation.trackIndex] ? 0 : 4);
                        break;
                    }
                    break;
                default:
                    onBindViewHolder$androidx$media3$ui$PlayerControlView$TrackSelectionAdapter(subSettingViewHolder, i);
                    break;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
        
            if (r5.trackGroup.trackSelected[r5.trackIndex] != false) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onBindViewHolder$androidx$media3$ui$PlayerControlView$TrackSelectionAdapter(SubSettingViewHolder subSettingViewHolder, int i) {
            Player player = this.this$0$1.player;
            if (player == null) {
            }
            boolean z = true;
            if (i != 0) {
                TrackInformation trackInformation = (TrackInformation) this.tracks.get(i - 1);
                TrackGroup trackGroup = trackInformation.trackGroup.mediaTrackGroup;
                if (((ExoPlayerImpl) player).getTrackSelectionParameters().overrides.get(trackGroup) != null) {
                }
                z = false;
                subSettingViewHolder.textView.setText(trackInformation.trackName);
                subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
                subSettingViewHolder.itemView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda12(this, player, trackGroup, trackInformation, 1));
                return;
            }
            switch (this.$r8$classId) {
                case 0:
                    subSettingViewHolder.textView.setText(R.string.exo_track_selection_none);
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.tracks.size()) {
                            TrackInformation trackInformation2 = (TrackInformation) this.tracks.get(i2);
                            if (trackInformation2.trackGroup.trackSelected[trackInformation2.trackIndex]) {
                                z = false;
                            } else {
                                i2++;
                            }
                        }
                    }
                    subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
                    subSettingViewHolder.itemView.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, r0));
                    break;
                default:
                    subSettingViewHolder.textView.setText(R.string.exo_track_selection_auto);
                    Player player2 = this.this$0.player;
                    player2.getClass();
                    subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((ExoPlayerImpl) player2).getTrackSelectionParameters()) ? 4 : 0);
                    subSettingViewHolder.itemView.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 2));
                    break;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(this.this$0$1.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            switch (this.$r8$classId) {
                case 0:
                    onBindViewHolder((SubSettingViewHolder) viewHolder, i);
                    break;
                default:
                    onBindViewHolder((SubSettingViewHolder) viewHolder, i);
                    break;
            }
        }
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }
}
