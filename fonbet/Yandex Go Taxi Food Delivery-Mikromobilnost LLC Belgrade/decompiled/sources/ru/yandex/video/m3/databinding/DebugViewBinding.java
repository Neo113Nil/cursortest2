package ru.yandex.video.m3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.zo31;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.view.graph.LineGraphView;
import ru.yandex.video.m3.player.ui.debug.view.graph.LoadedChunkGraphView;

/* loaded from: classes7.dex */
public final class DebugViewBinding implements zo31 {
    public final TextView additional;
    public final TextView additionalLabel;
    public final TextView audioDecoder;
    public final TextView audioDecoderLabel;
    public final TextView audioTrack;
    public final TextView audioTrackLabel;
    public final TextView bandwidthEstimation;
    public final LineGraphView bandwidthEstimationGraph;
    public final TextView bandwidthEstimationLabel;
    public final TextView bufferSize;
    public final LineGraphView bufferSizeGraph;
    public final TextView bufferSizeLabel;
    public final TextView bytesLoadedLabel;
    public final LoadedChunkGraphView chunksGraph;
    public final TextView content;
    public final TextView contentLabel;
    public final Flow dataBlock;
    public final Flow decoderBlock;
    public final Flow errorBlock;
    public final Flow graphsBlock;
    public final TextView lastError;
    public final TextView lastErrorLabel;
    public final TextView latency;
    public final Flow latencyAndAdditionalBlock;
    public final TextView latencyLabel;
    public final ImageView qrCode;
    private final ConstraintLayout rootView;
    public final Flow sessionBlock;
    public final Flow subPlusViewportBlock;
    public final TextView subtitlesTrack;
    public final TextView subtitlesTrackLabel;
    public final TextView totalBytesLoaded;
    public final Flow trackBlock;
    public final TextView videoDecoder;
    public final TextView videoDecoderLabel;
    public final TextView videoTrack;
    public final TextView videoTrackLabel;
    public final TextView viewPortSizeLabel;
    public final TextView viewportSize;
    public final TextView vsid;
    public final TextView vsidLabel;

    private DebugViewBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LineGraphView lineGraphView, TextView textView8, TextView textView9, LineGraphView lineGraphView2, TextView textView10, TextView textView11, LoadedChunkGraphView loadedChunkGraphView, TextView textView12, TextView textView13, Flow flow, Flow flow2, Flow flow3, Flow flow4, TextView textView14, TextView textView15, TextView textView16, Flow flow5, TextView textView17, ImageView imageView, Flow flow6, Flow flow7, TextView textView18, TextView textView19, TextView textView20, Flow flow8, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28) {
        this.rootView = constraintLayout;
        this.additional = textView;
        this.additionalLabel = textView2;
        this.audioDecoder = textView3;
        this.audioDecoderLabel = textView4;
        this.audioTrack = textView5;
        this.audioTrackLabel = textView6;
        this.bandwidthEstimation = textView7;
        this.bandwidthEstimationGraph = lineGraphView;
        this.bandwidthEstimationLabel = textView8;
        this.bufferSize = textView9;
        this.bufferSizeGraph = lineGraphView2;
        this.bufferSizeLabel = textView10;
        this.bytesLoadedLabel = textView11;
        this.chunksGraph = loadedChunkGraphView;
        this.content = textView12;
        this.contentLabel = textView13;
        this.dataBlock = flow;
        this.decoderBlock = flow2;
        this.errorBlock = flow3;
        this.graphsBlock = flow4;
        this.lastError = textView14;
        this.lastErrorLabel = textView15;
        this.latency = textView16;
        this.latencyAndAdditionalBlock = flow5;
        this.latencyLabel = textView17;
        this.qrCode = imageView;
        this.sessionBlock = flow6;
        this.subPlusViewportBlock = flow7;
        this.subtitlesTrack = textView18;
        this.subtitlesTrackLabel = textView19;
        this.totalBytesLoaded = textView20;
        this.trackBlock = flow8;
        this.videoDecoder = textView21;
        this.videoDecoderLabel = textView22;
        this.videoTrack = textView23;
        this.videoTrackLabel = textView24;
        this.viewPortSizeLabel = textView25;
        this.viewportSize = textView26;
        this.vsid = textView27;
        this.vsidLabel = textView28;
    }

    public static DebugViewBinding bind(View view) {
        int i = R.id.additional;
        TextView textView = (TextView) cma1.O(i, view);
        if (textView != null) {
            i = R.id.additionalLabel;
            TextView textView2 = (TextView) cma1.O(i, view);
            if (textView2 != null) {
                i = R.id.audioDecoder;
                TextView textView3 = (TextView) cma1.O(i, view);
                if (textView3 != null) {
                    i = R.id.audioDecoderLabel;
                    TextView textView4 = (TextView) cma1.O(i, view);
                    if (textView4 != null) {
                        i = R.id.audioTrack;
                        TextView textView5 = (TextView) cma1.O(i, view);
                        if (textView5 != null) {
                            i = R.id.audioTrackLabel;
                            TextView textView6 = (TextView) cma1.O(i, view);
                            if (textView6 != null) {
                                i = R.id.bandwidthEstimation;
                                TextView textView7 = (TextView) cma1.O(i, view);
                                if (textView7 != null) {
                                    i = R.id.bandwidthEstimationGraph;
                                    LineGraphView lineGraphView = (LineGraphView) cma1.O(i, view);
                                    if (lineGraphView != null) {
                                        i = R.id.bandwidthEstimationLabel;
                                        TextView textView8 = (TextView) cma1.O(i, view);
                                        if (textView8 != null) {
                                            i = R.id.bufferSize;
                                            TextView textView9 = (TextView) cma1.O(i, view);
                                            if (textView9 != null) {
                                                i = R.id.bufferSizeGraph;
                                                LineGraphView lineGraphView2 = (LineGraphView) cma1.O(i, view);
                                                if (lineGraphView2 != null) {
                                                    i = R.id.bufferSizeLabel;
                                                    TextView textView10 = (TextView) cma1.O(i, view);
                                                    if (textView10 != null) {
                                                        i = R.id.bytesLoadedLabel;
                                                        TextView textView11 = (TextView) cma1.O(i, view);
                                                        if (textView11 != null) {
                                                            i = R.id.chunksGraph;
                                                            LoadedChunkGraphView loadedChunkGraphView = (LoadedChunkGraphView) cma1.O(i, view);
                                                            if (loadedChunkGraphView != null) {
                                                                i = R.id.content;
                                                                TextView textView12 = (TextView) cma1.O(i, view);
                                                                if (textView12 != null) {
                                                                    i = R.id.contentLabel;
                                                                    TextView textView13 = (TextView) cma1.O(i, view);
                                                                    if (textView13 != null) {
                                                                        Flow flow = (Flow) cma1.O(R.id.data_block, view);
                                                                        Flow flow2 = (Flow) cma1.O(R.id.decoder_block, view);
                                                                        i = R.id.error_block;
                                                                        Flow flow3 = (Flow) cma1.O(i, view);
                                                                        if (flow3 != null) {
                                                                            i = R.id.graphs_block;
                                                                            Flow flow4 = (Flow) cma1.O(i, view);
                                                                            if (flow4 != null) {
                                                                                i = R.id.lastError;
                                                                                TextView textView14 = (TextView) cma1.O(i, view);
                                                                                if (textView14 != null) {
                                                                                    i = R.id.lastErrorLabel;
                                                                                    TextView textView15 = (TextView) cma1.O(i, view);
                                                                                    if (textView15 != null) {
                                                                                        i = R.id.latency;
                                                                                        TextView textView16 = (TextView) cma1.O(i, view);
                                                                                        if (textView16 != null) {
                                                                                            i = R.id.latency_and_additional_block;
                                                                                            Flow flow5 = (Flow) cma1.O(i, view);
                                                                                            if (flow5 != null) {
                                                                                                i = R.id.latencyLabel;
                                                                                                TextView textView17 = (TextView) cma1.O(i, view);
                                                                                                if (textView17 != null) {
                                                                                                    i = R.id.qrCode;
                                                                                                    ImageView imageView = (ImageView) cma1.O(i, view);
                                                                                                    if (imageView != null) {
                                                                                                        Flow flow6 = (Flow) cma1.O(R.id.session_block, view);
                                                                                                        Flow flow7 = (Flow) cma1.O(R.id.sub_plus_viewport_block, view);
                                                                                                        i = R.id.subtitlesTrack;
                                                                                                        TextView textView18 = (TextView) cma1.O(i, view);
                                                                                                        if (textView18 != null) {
                                                                                                            i = R.id.subtitlesTrackLabel;
                                                                                                            TextView textView19 = (TextView) cma1.O(i, view);
                                                                                                            if (textView19 != null) {
                                                                                                                i = R.id.totalBytesLoaded;
                                                                                                                TextView textView20 = (TextView) cma1.O(i, view);
                                                                                                                if (textView20 != null) {
                                                                                                                    Flow flow8 = (Flow) cma1.O(R.id.track_block, view);
                                                                                                                    i = R.id.videoDecoder;
                                                                                                                    TextView textView21 = (TextView) cma1.O(i, view);
                                                                                                                    if (textView21 != null) {
                                                                                                                        i = R.id.videoDecoderLabel;
                                                                                                                        TextView textView22 = (TextView) cma1.O(i, view);
                                                                                                                        if (textView22 != null) {
                                                                                                                            i = R.id.videoTrack;
                                                                                                                            TextView textView23 = (TextView) cma1.O(i, view);
                                                                                                                            if (textView23 != null) {
                                                                                                                                i = R.id.videoTrackLabel;
                                                                                                                                TextView textView24 = (TextView) cma1.O(i, view);
                                                                                                                                if (textView24 != null) {
                                                                                                                                    i = R.id.viewPortSizeLabel;
                                                                                                                                    TextView textView25 = (TextView) cma1.O(i, view);
                                                                                                                                    if (textView25 != null) {
                                                                                                                                        i = R.id.viewportSize;
                                                                                                                                        TextView textView26 = (TextView) cma1.O(i, view);
                                                                                                                                        if (textView26 != null) {
                                                                                                                                            i = R.id.vsid;
                                                                                                                                            TextView textView27 = (TextView) cma1.O(i, view);
                                                                                                                                            if (textView27 != null) {
                                                                                                                                                i = R.id.vsidLabel;
                                                                                                                                                TextView textView28 = (TextView) cma1.O(i, view);
                                                                                                                                                if (textView28 != null) {
                                                                                                                                                    return new DebugViewBinding((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, lineGraphView, textView8, textView9, lineGraphView2, textView10, textView11, loadedChunkGraphView, textView12, textView13, flow, flow2, flow3, flow4, textView14, textView15, textView16, flow5, textView17, imageView, flow6, flow7, textView18, textView19, textView20, flow8, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static DebugViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.debug_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.zo31
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DebugViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
