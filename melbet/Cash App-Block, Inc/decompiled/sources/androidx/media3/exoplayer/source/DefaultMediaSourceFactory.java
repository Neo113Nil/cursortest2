package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.room.CoroutinesRoom;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import net.idrnd.misnap.iad.IadFrame;
import net.oneformapp.ProfileStore_;

/* loaded from: classes3.dex */
public final class DefaultMediaSourceFactory implements MediaSource$Factory {
    public final CallResult dataSourceFactory;
    public final ProfileStore_ delegateFactoryLoader;
    public final long liveMaxOffsetMs;
    public final float liveMaxSpeed;
    public final long liveMinOffsetMs;
    public final float liveMinSpeed;
    public final long liveTargetOffsetMs;
    public boolean parseSubtitlesDuringExtraction;
    public CoroutinesRoom.Companion subtitleParserFactory;

    public DefaultMediaSourceFactory(Context context, DefaultExtractorsFactory defaultExtractorsFactory) {
        CallResult callResult = new CallResult(context, 1);
        CoroutinesRoom.Companion companion = new CoroutinesRoom.Companion(14);
        this.dataSourceFactory = callResult;
        this.subtitleParserFactory = companion;
        ProfileStore_ profileStore_ = new ProfileStore_();
        profileStore_.passcode = defaultExtractorsFactory;
        profileStore_.profileData = companion;
        profileStore_.authStore = new HashMap();
        profileStore_.context = new HashMap();
        profileStore_.hasLoaded = true;
        profileStore_.runningVersion = 3;
        this.delegateFactoryLoader = profileStore_;
        if (callResult != ((CallResult) profileStore_.schema)) {
            profileStore_.schema = callResult;
            ((HashMap) profileStore_.authStore).clear();
            ((HashMap) profileStore_.context).clear();
        }
        this.liveTargetOffsetMs = -9223372036854775807L;
        this.liveMinOffsetMs = -9223372036854775807L;
        this.liveMaxOffsetMs = -9223372036854775807L;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }

    public static MediaSource$Factory access$300(Class cls, DataSource.Factory factory) {
        try {
            return (MediaSource$Factory) cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource$Factory
    public final BaseMediaSource createMediaSource(MediaItem mediaItem) {
        int i;
        MediaItem mediaItem2;
        Uri uri;
        String str;
        List list;
        long j;
        mediaItem.localConfiguration.getClass();
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(mediaItem.localConfiguration.mimeType, "application/x-image-uri");
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (equals) {
            long j2 = localConfiguration.imageDurationMs;
            String str2 = Util.DEVICE_DEBUG_INFO;
            throw null;
        }
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != -9223372036854775807L) {
            DefaultExtractorsFactory defaultExtractorsFactory = (DefaultExtractorsFactory) this.delegateFactoryLoader.passcode;
            synchronized (defaultExtractorsFactory) {
                defaultExtractorsFactory.jpegFlags = 1;
            }
            DefaultExtractorsFactory defaultExtractorsFactory2 = (DefaultExtractorsFactory) this.delegateFactoryLoader.passcode;
            synchronized (defaultExtractorsFactory2) {
                defaultExtractorsFactory2.heifFlags = 1;
            }
        }
        try {
            MediaSource$Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(inferContentTypeForUriAndMimeType);
            MediaItem.LiveConfiguration.Builder buildUpon = mediaItem.liveConfiguration.buildUpon();
            MediaItem.LiveConfiguration liveConfiguration = mediaItem.liveConfiguration;
            if (liveConfiguration.targetOffsetMs == -9223372036854775807L) {
                buildUpon.targetOffsetMs = this.liveTargetOffsetMs;
            }
            if (liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                buildUpon.minPlaybackSpeed = this.liveMinSpeed;
            }
            if (liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                buildUpon.maxPlaybackSpeed = this.liveMaxSpeed;
            }
            if (liveConfiguration.minOffsetMs == -9223372036854775807L) {
                buildUpon.minOffsetMs = this.liveMinOffsetMs;
            }
            if (liveConfiguration.maxOffsetMs == -9223372036854775807L) {
                buildUpon.maxOffsetMs = this.liveMaxOffsetMs;
            }
            MediaItem.LiveConfiguration liveConfiguration2 = new MediaItem.LiveConfiguration(buildUpon);
            if (liveConfiguration2.equals(mediaItem.liveConfiguration)) {
                i = 1;
                mediaItem2 = mediaItem;
            } else {
                new DeviceInfo.Builder();
                List list2 = Collections.EMPTY_LIST;
                ImmutableList immutableList = RegularImmutableList.EMPTY;
                MediaItem.RequestMetadata requestMetadata = MediaItem.RequestMetadata.EMPTY;
                MediaItem.ClippingProperties clippingProperties = mediaItem.clippingConfiguration;
                IadFrame iadFrame = new IadFrame(false);
                iadFrame.b = clippingProperties.endPositionUs;
                String str3 = mediaItem.mediaId;
                MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
                mediaItem.liveConfiguration.buildUpon();
                MediaItem.RequestMetadata requestMetadata2 = mediaItem.requestMetadata;
                MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
                if (localConfiguration2 != null) {
                    String str4 = localConfiguration2.mimeType;
                    Uri uri2 = localConfiguration2.uri;
                    List list3 = localConfiguration2.streamKeys;
                    immutableList = localConfiguration2.subtitleConfigurations;
                    new DeviceInfo.Builder();
                    i = 1;
                    str = str4;
                    j = localConfiguration2.imageDurationMs;
                    list = list3;
                    uri = uri2;
                } else {
                    i = 1;
                    uri = null;
                    str = null;
                    list = list2;
                    j = -9223372036854775807L;
                }
                ImmutableList immutableList2 = immutableList;
                MediaItem.LiveConfiguration.Builder buildUpon2 = liveConfiguration2.buildUpon();
                MediaItem.LocalConfiguration localConfiguration3 = uri != null ? new MediaItem.LocalConfiguration(uri, str, null, list, immutableList2, j) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                MediaItem.ClippingProperties clippingProperties2 = new MediaItem.ClippingProperties(iadFrame);
                MediaItem.LiveConfiguration liveConfiguration3 = new MediaItem.LiveConfiguration(buildUpon2);
                if (mediaMetadata == null) {
                    mediaMetadata = MediaMetadata.EMPTY;
                }
                mediaItem2 = new MediaItem(str5, clippingProperties2, localConfiguration3, liveConfiguration3, mediaMetadata, requestMetadata2);
            }
            BaseMediaSource createMediaSource = mediaSourceFactory.createMediaSource(mediaItem2);
            ImmutableList immutableList3 = mediaItem2.localConfiguration.subtitleConfigurations;
            if (!immutableList3.isEmpty()) {
                BaseMediaSource[] baseMediaSourceArr = new BaseMediaSource[immutableList3.size() + 1];
                baseMediaSourceArr[0] = createMediaSource;
                if (immutableList3.size() > 0) {
                    if (!this.parseSubtitlesDuringExtraction) {
                        this.dataSourceFactory.getClass();
                        MediaItem.Subtitle subtitle = (MediaItem.Subtitle) immutableList3.get(0);
                        int i2 = i;
                        new ArrayList(i2);
                        new HashSet(i2);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
                        List list4 = Collections.EMPTY_LIST;
                        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
                        MediaItem.RequestMetadata requestMetadata3 = MediaItem.RequestMetadata.EMPTY;
                        Uri uri3 = Uri.EMPTY;
                        subtitle.getClass();
                        throw null;
                    }
                    Format.Builder builder = new Format.Builder();
                    ((MediaItem.Subtitle) immutableList3.get(0)).getClass();
                    ArrayList arrayList = MimeTypes.customMimeTypes;
                    builder.sampleMimeType = null;
                    ((MediaItem.Subtitle) immutableList3.get(0)).getClass();
                    builder.language = null;
                    ((MediaItem.Subtitle) immutableList3.get(0)).getClass();
                    builder.selectionFlags = 0;
                    ((MediaItem.Subtitle) immutableList3.get(0)).getClass();
                    builder.roleFlags = 0;
                    ((MediaItem.Subtitle) immutableList3.get(0)).getClass();
                    builder.label = null;
                    ((MediaItem.Subtitle) immutableList3.get(0)).getClass();
                    builder.id = null;
                    Format format2 = new Format(builder);
                    new DefaultDrmSessionManagerProvider();
                    if (this.subtitleParserFactory.supportsFormat(format2)) {
                        Format.Builder buildUpon3 = format2.buildUpon();
                        buildUpon3.sampleMimeType = MimeTypes.normalizeMimeType("application/x-media3-cues");
                        buildUpon3.codecs = format2.sampleMimeType;
                        buildUpon3.cueReplacementBehavior = this.subtitleParserFactory.getCueReplacementBehavior(format2);
                        new Format(buildUpon3);
                    }
                    ((MediaItem.Subtitle) immutableList3.get(0)).getClass();
                    throw null;
                }
                createMediaSource = new MergingMediaSource(baseMediaSourceArr);
            }
            MediaItem.ClippingProperties clippingProperties3 = mediaItem2.clippingConfiguration;
            if (clippingProperties3.endPositionUs != Long.MIN_VALUE) {
                ClippingMediaSource.Builder builder2 = new ClippingMediaSource.Builder(createMediaSource);
                Trace.checkState(!builder2.buildCalled);
                long j3 = clippingProperties3.endPositionUs;
                Trace.checkState(!builder2.buildCalled);
                builder2.endPositionUs = j3;
                Trace.checkState(!builder2.buildCalled);
                builder2.enableInitialDiscontinuity = true;
                Trace.checkState(!builder2.buildCalled);
                Trace.checkState(!builder2.buildCalled);
                Trace.checkState(!builder2.buildCalled);
                Trace.checkState(!builder2.buildCalled);
                builder2.buildCalled = true;
                createMediaSource = new ClippingMediaSource(builder2);
            }
            mediaItem2.localConfiguration.getClass();
            mediaItem2.localConfiguration.getClass();
            return createMediaSource;
        } catch (ClassNotFoundException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource$Factory
    public final void experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.parseSubtitlesDuringExtraction = z;
        ProfileStore_ profileStore_ = this.delegateFactoryLoader;
        profileStore_.hasLoaded = z;
        DefaultExtractorsFactory defaultExtractorsFactory = (DefaultExtractorsFactory) profileStore_.passcode;
        synchronized (defaultExtractorsFactory) {
            defaultExtractorsFactory.textTrackTranscodingEnabled = z;
        }
        Iterator it = ((HashMap) profileStore_.context).values().iterator();
        while (it.hasNext()) {
            ((MediaSource$Factory) it.next()).experimentalParseSubtitlesDuringExtraction(z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource$Factory
    public final void experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        ProfileStore_ profileStore_ = this.delegateFactoryLoader;
        profileStore_.runningVersion = i;
        DefaultExtractorsFactory defaultExtractorsFactory = (DefaultExtractorsFactory) profileStore_.passcode;
        synchronized (defaultExtractorsFactory) {
            defaultExtractorsFactory.codecsToParseWithinGopSampleDependencies = i;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource$Factory
    public final void setSubtitleParserFactory(CoroutinesRoom.Companion companion) {
        this.subtitleParserFactory = companion;
        ProfileStore_ profileStore_ = this.delegateFactoryLoader;
        profileStore_.profileData = companion;
        DefaultExtractorsFactory defaultExtractorsFactory = (DefaultExtractorsFactory) profileStore_.passcode;
        synchronized (defaultExtractorsFactory) {
            defaultExtractorsFactory.subtitleParserFactory = companion;
        }
        Iterator it = ((HashMap) profileStore_.context).values().iterator();
        while (it.hasNext()) {
            ((MediaSource$Factory) it.next()).setSubtitleParserFactory(companion);
        }
    }
}
